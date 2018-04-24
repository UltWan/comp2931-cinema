import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField ;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Login extends Application {

    Button signin,cancel;
    TextField usernametext;
    PasswordField Password;
    Label error,labelUsername,labelPassword;
    int index;
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

        usernametext=new TextField();
        usernametext.setMaxWidth(200);

        Password=new PasswordField();
        Password.setMaxWidth(200);

        labelUsername=new Label();
        labelUsername.setText("Username");

        labelPassword=new Label();
        labelPassword.setText("Password");

       signin.setOnAction(e ->{
           if (index < 15 ){
            index++;
            user[index]=usernametext.getText();
            pass[index]=Password.getText();


           usernametext.clear();
           Password.clear();
       }else{

       }
       });

      //  cancel.setOnAction(e ->{
      //      for (int c = 0; c < 15; c++)
      //      {
      //     if ((user[c] == usernametext.getText()) && (pass[c] == Password.getText())){
      //           //  error.display("good");
      //           }
      //     else{
      //       //  error.display( "missing words");
      //       }
      //   }
      //});


        VBox layout = new VBox();
        layout.getChildren().addAll(labelUsername,usernametext,labelPassword,Password,signin,cancel);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
