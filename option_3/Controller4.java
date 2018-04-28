import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Controller4 implements Controller {
    private final VBox root;
    private TextField tfAdult = new TextField();
    private TextField tfChild = new TextField();
    private TextField tfSenior = new TextField();
    private TextField tfStudent = new TextField();
    private TextField tfTotal = new TextField();
    private TextField tfCashGiven = new TextField();
    private TextField tfChangeGiven = new TextField();
    private Button btCalculate1 = new Button("Calculate Total");
    private Button btCalculate2 = new Button("Calculate Change");
    public Label lblInfo = new Label();
    public Label lblSeats = new Label();
    public Label lblTotalSeats = new Label();

    public Controller4() {
      // sets up positions of elements in the gridpane
      GridPane gridPane = new GridPane();
      gridPane.setAlignment(Pos.CENTER);
      gridPane.setHgap(5);
      gridPane.setVgap(5);
      gridPane.setPadding(new Insets(15, 15, 15, 15));
      gridPane.add(lblInfo, 0, 0);
      gridPane.add(lblSeats, 0, 2);
      gridPane.add(lblTotalSeats, 0, 4);
      gridPane.add(new Label("No. Adult:"), 0, 6);
      gridPane.add(new Label("£ 10.00"), 1, 6);
      gridPane.add(tfAdult, 2, 6);
      tfAdult.setText("0");
      gridPane.add(new Label("No. Child:"), 0, 8);
      gridPane.add(new Label("£   6.00"), 1, 8);
      gridPane.add(tfChild, 2, 8);
      tfChild.setText("0");
      gridPane.add(new Label("No. Senior:"), 0, 10);
      gridPane.add(new Label("£   6.00"), 1, 10);
      gridPane.add(tfSenior, 2, 10);
      tfSenior.setText("0");
      gridPane.add(new Label("No. Student:"), 0, 12);
      gridPane.add(new Label("£   7.50"), 1, 12);
      gridPane.add(tfStudent, 2, 12);
      tfStudent.setText("0");
      gridPane.add(new Label("Tickets Total:"), 0, 14);
      gridPane.add(tfTotal, 2, 14);
      gridPane.add(btCalculate1, 2, 16);
      gridPane.add(new Label("Cash Given:"), 0, 20);
      gridPane.add(tfCashGiven, 2, 20);
      tfCashGiven.setText("0");
      gridPane.add(new Label("Change Given:"), 0, 24);
      gridPane.add(tfChangeGiven, 2, 24);
      gridPane.add(btCalculate2, 2, 26);

      //Set positions properties for UI
      gridPane.setAlignment(Pos.CENTER);
      tfAdult.setAlignment(Pos.BOTTOM_RIGHT);
      tfChild.setAlignment(Pos.BOTTOM_RIGHT);
      tfSenior.setAlignment(Pos.BOTTOM_RIGHT);
      tfStudent.setAlignment(Pos.BOTTOM_RIGHT);
      tfTotal.setAlignment(Pos.BOTTOM_RIGHT);
      GridPane.setHalignment(btCalculate1, HPos.RIGHT);
      GridPane.setHalignment(btCalculate2, HPos.RIGHT);
      tfCashGiven.setAlignment(Pos.BOTTOM_RIGHT);
      tfChangeGiven.setAlignment(Pos.BOTTOM_RIGHT);
      tfTotal.setEditable(false);
      tfChangeGiven.setEditable(false);

      //Actions for button presses
      btCalculate1.setOnAction(e -> calculateTotal());
      btCalculate2.setOnAction(e -> calculateChangeGiven());

      Button btBack = new Button("Back");
      Button btPrint = new Button("Logout");

      HBox hBox = new HBox(360);
      hBox.getChildren().add(btBack);
      hBox.getChildren().add(btPrint);
      hBox.setAlignment(Pos.CENTER);

      // go back to the previous scene (seat selection)
      btBack.setOnMouseClicked(e -> {
          Controller3 controller3 = new Controller3();
          btBack.getScene().setRoot(controller3.getContent());
      });

      // go to the next scene
      btPrint.setOnAction(event -> {
          Controller1 controller1 = new Controller1();
          btPrint.getScene().setRoot(controller1.getContent());
      });

      root = new VBox (gridPane, hBox);
      root.setAlignment(Pos.CENTER);
  }

    private void calculateTotal() {
      int adult = Integer.parseInt(tfAdult.getText());
      int child = Integer.parseInt(tfChild.getText());
      int senior = Integer.parseInt(tfSenior.getText());
      int student = Integer.parseInt(tfStudent.getText());
      double cash = Double.parseDouble(tfCashGiven.getText());

      Transaction transaction = new Transaction(adult, child, senior, student, cash);

      tfTotal.setText(String.format("£%.2f", transaction.getTotal()));
    }

    private void calculateChangeGiven() {
      int adult = Integer.parseInt(tfAdult.getText());
      int child = Integer.parseInt(tfChild.getText());
      int senior = Integer.parseInt(tfSenior.getText());
      int student = Integer.parseInt(tfStudent.getText());
      double cash = Double.parseDouble(tfCashGiven.getText());
      Transaction transaction = new Transaction(adult, child, senior, student, cash);

      if(transaction.getTotal() > cash) {
        tfChangeGiven.setText("Error: Insufficient Cash");
      }
      else {
        tfChangeGiven.setText(String.format("£%.2f", transaction.getChangeGiven()));
      }
    }

    @Override
    public Parent getContent() {
        return root;
    }
}
