import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Login implements Controller {
  private final Scene root;

  private Stage primaryStage;
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

    this.primaryStage = primaryStage;

    primaryStage.setTitle("Login");

    BorderPane border = new BorderPane();

    border.setPadding(new Insets(50,50,50,50));

    HBox box = new HBox();

    box.setPadding(new Insets(20,20,20,30));

    GridPane gridPane = new GridPane();
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

    Text text = new Text("Login");
    text.setFont(Font.font("Courier New", FontWeight.BOLD, 25));
    box.getChildren().add(text);


    btnLogin.setOnAction(e -> {
        checkUser = txtUserName.getText().toString();
        checkPw = pf.getText().toString();
        if(checkUser.equals(user) && checkPw.equals(pass) || checkUser.equals(user1) && checkPw.equals(pass1)||checkUser.equals(user2) && checkPw.equals(pass2) ||checkUser.equals(user3) && checkPw.equals(pass3) ||checkUser.equals(user4) && checkPw.equals(pass4)){
          confirm.setText("Welcome family!!!");
          confirm.setTextFill(Color.GREEN);

          changeScenes();
        }
        else{
          confirm.setText("Incorrect user or pass.you only have 5 attempts");
          confirm.setTextFill(Color.RED);
        }
        txtUserName.setText("");
        pf.setText("");
      });

    border.setTop(box);
    border.setCenter(gridPane);
    Scene scene = new Scene(border);
    primaryStage.setScene(scene);
    primaryStage.show();

  @Override
  public Parent getContent() {
      return root;
  }

  private void changeScenes() {
    Controller2 controller2 = new Controller2();
    navToSecond.getScene().setRoot(controller2.getContent());
  }
}
