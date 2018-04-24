import javafx.application.Application;
import javafx.scene.control.ComboBox;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;

public class MovieSelect extends Application {
  private PreparedStatement preparedStatement;
  private Label lblStatus = new Label();
  private Connection connection;
  private ObservableList<String> movieList = FXCollections.observableArrayList();
  private ComboBox<String> movieComboBox = new ComboBox<>(movieList);

  @Override
  public void start(Stage primaryStage) {
    initialiseDB();
    fillComboBox();

    //ComboBox<String> movieComboBox = new ComboBox<>(movieList);
    //movieComboBox.setEditable(true);

    Button btMovieSelection = new Button("Select Movie");
    HBox hBox = new HBox(5);
    hBox.getChildren().addAll(new Label("Movie: "), movieComboBox, (btMovieSelection));

    VBox vBox = new VBox(10);
    vBox.getChildren().addAll(hBox, lblStatus);

    //movieComboBox.setPrefColumnCount(6);
    btMovieSelection.setOnAction(e -> movieSelection());

    Scene scene = new Scene (vBox, 420, 80);
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


  public void fillComboBox() {
    try {
      String queryString ="SELECT title FROM movies ORDER BY title";
      preparedStatement = connection.prepareStatement(queryString);
      ResultSet rset = preparedStatement.executeQuery();

      //gets all titles of films found in database file
      while(rset.next()) {
        movieList.add(rset.getString("title"));
      }
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }

  // incomplete - needs to display text
  public void movieSelection() {
    String title = movieComboBox.getValue();
    //String title = movieComboBox.getText();
    try {
      preparedStatement.setString(1, title);
      ResultSet rset = preparedStatement.executeQuery();

      if (rset.next()) {
        String movieTitle = rset.getString(1);

        lblStatus.setText(title + "selected");
      } else {
        lblStatus.setText("Not found");
      }
    }
    catch (SQLException ex) {
      ex.printStackTrace();
    }
  }
}
