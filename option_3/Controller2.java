import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
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

public class Controller2 implements Controller {
    private final VBox root;
    private Stage primaryStage;
    private PreparedStatement prepStatementTitle;
    private PreparedStatement prepStatementCert;
    private PreparedStatement prepStatementTime;
    private PreparedStatement prepStatementScreen;
    public Button btSelectMovie = new Button("Select Movie");
    private Button btBack = new Button("Back");
    public Label lblConfirm = new Label();
    private TextField tfCert = new TextField();
    private Connection connection;
    private ObservableList<String> movieList = FXCollections.observableArrayList();
    private ObservableList<String> timeList = FXCollections.observableArrayList();
    public ComboBox<String> movieComboBox = new ComboBox<>(movieList);
    public ComboBox<String> timeComboBox = new ComboBox<>(timeList);
    public GridPane gridPane = new GridPane();
    public TextField tfScreen = new TextField();
    public Scene scene;
    public String movie, time, screen;


    public Controller2() {
        initialiseDB();
        fillMovieComboBox();

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(20,20,20,20));

        gridPane.setHgap(5);
        gridPane.setVgap(5);

        gridPane.add(movieComboBox, 0, 0);
        gridPane.add(new Label ("Certificate"), 2, 0);
        gridPane.add(tfCert, 4, 0);
        gridPane.add(timeComboBox, 0, 2);
        gridPane.add(new Label ("Theatre No."), 2, 2);
        gridPane.add(tfScreen, 4, 2);
        gridPane.add(lblConfirm, 0, 6);

        tfCert.setEditable(false);
        tfScreen.setEditable(false);

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

        HBox hBox = new HBox(225);
        hBox.getChildren().add(btBack);
        hBox.getChildren().add(btSelectMovie);
        hBox.setAlignment(Pos.CENTER);

        btBack.setOnAction(e -> {
            Controller1 controller1 = new Controller1();
            btBack.getScene().setRoot(controller1.getContent());
        });

        btSelectMovie.setOnAction(e -> movieSelection());
                root = new VBox(gridPane, hBox);
                root.setAlignment(Pos.CENTER);
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
              lblConfirm.setText(title + " selected for the " + time +
                                         " showing in theatre " + screen);

              Controller3 controller3 = new Controller3();
              controller3.movieInfo.add(title);
              controller3.movieInfo.add(certificate);
              controller3.movieInfo.add(time);
              controller3.movieInfo.add(screen);
              controller3.lblInfo.setText(title + " (" + certificate + ")\n" +
                                          time + ", Theatre " + screen);

              btSelectMovie.getScene().setRoot(controller3.getContent());
            }
            else {
              lblConfirm.setText("Error: Movie or time not selected");
            }
          }
          catch (Exception ex) {
            ex.printStackTrace();
          }
        }

    @Override
    public Parent getContent() {
        return root;
    }
}
