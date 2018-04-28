import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class ControllerTest implements Controller {
    private final VBox root;

    public ControllerTest() {
        Button navToLogin = new Button("Logout");

        navToLogin.setOnMouseClicked(event -> {
            Controller1 controller1 = new Controller1();
            navToLogin.getScene().setRoot(controller1.getContent());
        });

        root = new VBox (navToLogin);
        root.setAlignment(Pos.CENTER);
    }

    @Override
    public Parent getContent() {
        return root;
    }
}
