import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Controller2 implements Controller {
    private final VBox root;

    public Controller2() {
        Button navToThird = new Button("third");

        navToThird.setOnMouseClicked(event -> {
            Controller3 controller3 = new Controller3();
            navToThird.getScene().setRoot(controller3.getContent());
        });

        root = new VBox (navToThird);
        root.setAlignment(Pos.CENTER);
    }

    @Override
    public Parent getContent() {
        return root;
    }
}
