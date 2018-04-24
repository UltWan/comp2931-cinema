import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.control.ComboBox;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.*;
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

    Button btMovieSelection = new Button("Select Movie");
    HBox hBox = new HBox(5);
    hBox.setAlignment(Pos.CENTER);
    hBox.getChildren().addAll(new Label("Movie: "), movieComboBox, (btMovieSelection));

    VBox vBox = new VBox(10);
    vBox.getChildren().addAll(hBox, lblStatus);

    btMovieSelection.setOnAction(e -> movieSelection());

    Scene scene = new Scene (vBox, 500, 250);
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

  public void movieSelection() {
    String title = movieComboBox.getValue();
    try {
        lblStatus.setText(title + " selected");
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
