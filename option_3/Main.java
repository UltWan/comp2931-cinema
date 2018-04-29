import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

  private Stage stage;

  public void start(Stage stage) throws Exception {
    Controller1 controller1 = new Controller1();
    // first scene (login)
    Scene scene = new Scene(controller1.getContent(), 800, 700);
    scene.getStylesheets().add("style.css");

    //sets the stage and loads up the first scene
    stage.setTitle("Jackdaw Cinema Staff System");
    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
