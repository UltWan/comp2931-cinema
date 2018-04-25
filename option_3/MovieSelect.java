import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.sql.*;

public class MovieSelect extends Application {
  private PreparedStatement prepStatementTitle;
  private PreparedStatement prepStatementCert;
  private PreparedStatement prepStatementTime;
  private PreparedStatement prepStatementScreen;
  private Label lblConfirm = new Label();
  private TextField tfCert = new TextField();
  private TextField tfScreen = new TextField();
  private Connection connection;
  private ObservableList<String> movieList = FXCollections.observableArrayList();
  private ObservableList<String> timeList = FXCollections.observableArrayList();
  private ComboBox<String> movieComboBox = new ComboBox<>(movieList);
  private ComboBox<String> timeComboBox = new ComboBox<>(timeList);

  @Override
  public void start(Stage primaryStage) {
    initialiseDB();
    fillMovieComboBox();

    Button btSelectMovie = new Button("Select Movie");
    tfCert.setEditable(false);
    tfScreen.setEditable(false);

    HBox hBox = new HBox(5);
    hBox.setAlignment(Pos.CENTER);
    hBox.getChildren().addAll(new Label("Movie: "), movieComboBox,
                              new Label("Certificate: "),tfCert,
                              new Label("Time: "), timeComboBox,
                              new Label("Screen: "),tfScreen, btSelectMovie);

    VBox vBox = new VBox(10);
    vBox.getChildren().addAll(hBox, lblConfirm);

    tfCert.setPrefColumnCount(3);
    tfScreen.setPrefColumnCount(2);

    // fills certificate field and time combobox with values corresponding to
    // the movie selected
    movieComboBox.setOnAction(e-> {
      try {
        String queryCert = "SELECT title, certificate FROM movies WHERE title = ?";
        prepStatementCert = connection.prepareStatement(queryCert);
        prepStatementCert.setString
          (1,(String)movieComboBox.getSelectionModel().getSelectedItem());
        ResultSet rsetCert = prepStatementCert.executeQuery();

        String queryTime = "SELECT title, time FROM schedule WHERE title = ?";
        prepStatementTime = connection.prepareStatement(queryTime);
        prepStatementTime.setString
          (1,(String)movieComboBox.getSelectionModel().getSelectedItem());
        ResultSet rsetTime = prepStatementTime.executeQuery();

        tfCert.setText(rsetCert.getString("certificate"));
        timeList.clear();

        while(rsetTime.next()) {
          timeList.add(rsetTime.getString("time"));
        }

        tfScreen.setText("");
        lblConfirm.setText("");
      }
      catch (SQLException ex) {
        ex.printStackTrace();
      }
    });

    //screen TextField is filled after time is selected
    timeComboBox.setOnAction(e-> {
      try {
        String queryScreen = "SELECT title, time, theatre_num FROM schedule WHERE title = ? and time = ?";
        prepStatementScreen = connection.prepareStatement(queryScreen);
        prepStatementScreen.setString
          (1,(String)movieComboBox.getSelectionModel().getSelectedItem());
        prepStatementScreen.setString
          (2,(String)timeComboBox.getSelectionModel().getSelectedItem());
        ResultSet rsetScreen = prepStatementScreen.executeQuery();

        lblConfirm.setText("");
        tfScreen.setText(rsetScreen.getString("theatre_num"));
      }
      catch (SQLException ex) {
        ex.printStackTrace();
      }
    });
    btSelectMovie.setOnAction(e -> movieSelection());

    Scene scene = new Scene (vBox, 750, 250);
    primaryStage.setTitle("Movie Listings");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  //connects to database file via sqlite
  public void initialiseDB() {
    try {
      Class.forName("org.sqlite.JDBC");
      System.out.println("Driver loaded");

      connection = DriverManager.getConnection("jdbc:sqlite:app.db");
      System.out.println("Database connected");
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  // fills movie combobox with movies
  public void fillMovieComboBox() {
    try {
      String queryTitle = "SELECT title FROM movies ORDER BY title";
      prepStatementTitle = connection.prepareStatement(queryTitle);
      ResultSet rsetTitle = prepStatementTitle.executeQuery();

      //gets all titles of films found in database file
      while(rsetTitle.next()) {
        movieList.add(rsetTitle.getString("title"));
      }
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  // confirmation of selection of movie and time
  public void movieSelection() {
    String title = movieComboBox.getValue();
    String certificate = tfCert.getText();
    String time = timeComboBox.getValue();
    String screen = tfScreen.getText();

    try {
      if (title != null && time != null) {
        lblConfirm.setText(title + " selected for the " + time + " showing in theatre " + screen);
      }
      else {
        lblConfirm.setText("Error: Movie or time not selected");
      }
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
