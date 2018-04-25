import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField ;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Platform;
import javafx.scene.control.Alert;
import javafx.scene.control.Dialog;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.ChoiceDialog;

public class Login extends Application {

    Button signin,cancel;
    TextField usernametext;
    PasswordField Password;
    Label error,labelUsername,labelPassword;
    int attempt = 5;
    String[] user = new String[20];
    String[] pass = new String[20];


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login ");


        signin = new Button();
        signin.setText("Log in");

        cancel = new Button();
        cancel.setText("Cancel");
        cancel.setOnAction(e -> Platform.exit());

        usernametext=new TextField();
        usernametext.setMaxWidth(300);

        Password =new PasswordField();
        Password.setMaxWidth(300);

        labelUsername=new Label();
        labelUsername.setText("Username");

        labelPassword=new Label();
        labelPassword.setText("Password");


       signin.setOnAction(e ->{
           while (attempt !=0 ){
            if (usernametext.getText().equals("1234") && Password.getText().equals("1234")){
            //user[attempt]=usernametext.getText("1234");
            // pass[attempt]=Password.getText("1234");


            return;
       }
       else {

          attempt --;
       }
       }
     });

       cancel.setOnAction(e -> Platform.exit());



        VBox layout = new VBox();
        layout.getChildren().addAll(labelUsername,usernametext,labelPassword,Password,signin,cancel);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
