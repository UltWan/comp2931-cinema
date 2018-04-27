import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

  private Stage stage;

  public void start(Stage stage) throws Exception {
    Controller1 controller1 = new Controller1();
    Scene scene = new Scene(controller1.getContent(), 750, 500, Color.AQUA);

    stage.setScene(scene);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
