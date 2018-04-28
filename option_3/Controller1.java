import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller1 implements Controller {
    private final VBox root;
    String user = "Joao";
    String pass = "jackdaw1";
    String user1 = "Ryan";
    String pass1 = "jackdaw2";
    String user2 = "Nick";
    String pass2 = "jackdaw3";
    String user3 = "Antonis";
    String pass3 = "jackdaw4";
    String user4 = "Clesio";
    String pass4 = "jackdaw5";

    String checkUser, checkPw;

    public Controller1() {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(20,20,20,20));

        gridPane.setHgap(5);
        gridPane.setVgap(5);

        Label labelusername = new Label("Username");
        TextField txtUserName = new TextField();

        Label labelpassword = new Label("Password");
        PasswordField pf = new PasswordField();

        Button btnLogin = new Button("Login");
        Label confirm = new Label();

        gridPane.add(labelusername, 0, 0);
        gridPane.add(txtUserName, 1, 0);
        gridPane.add(labelpassword, 0, 1);
        gridPane.add(pf, 1, 1);
        gridPane.add(btnLogin, 2, 1);
        gridPane.add(confirm, 1, 2);

        btnLogin.setOnAction(event -> {
          checkUser = txtUserName.getText().toString();
          checkPw = pf.getText().toString();
          Controller2 controller2 = new Controller2();
          if(checkUser.equals(user) && checkPw.equals(pass) || checkUser.equals(user1) && checkPw.equals(pass1)||checkUser.equals(user2) && checkPw.equals(pass2) ||checkUser.equals(user3) && checkPw.equals(pass3) ||checkUser.equals(user4) && checkPw.equals(pass4)){
            confirm.setText("Welcome family!!!");
            confirm.setTextFill(Color.GREEN);

            btnLogin.getScene().setRoot(controller2.getContent());
          }
          else{
            confirm.setText("Incorrect user or pass.you only have 5 attempts");
            confirm.setTextFill(Color.RED);
          }
          txtUserName.setText("");
          pf.setText("");
        });

        root = new VBox (gridPane, btnLogin);
        root.setAlignment(Pos.CENTER);
    }

    @Override
    public Parent getContent() {
        return root;
    }
}
