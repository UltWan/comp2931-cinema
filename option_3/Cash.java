import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Cash extends Application {

private TextField tfAdult = new TextField();
private TextField tfChild = new TextField();
private TextField tfSenior = new TextField();
private TextField tfStudent = new TextField();
private TextField tfTotal = new TextField();
private TextField tfCashGiven = new TextField();
private TextField tfChangeGiven = new TextField();
private Button btCalculate1 = new Button("Calculate Total");
private Button btCalculate2 = new Button("Calculate Change");

  public class Transaction {
    private double adult = 0;
    private double child = 0;
    private double senior = 0;
    private double student = 0;
    private double total = 0;
    private double cashGiven = 0;

    public Transaction(double adult, double child, double senior,
                       double student, double cashGiven) {
      this.adult = adult;
      this.child = child;
      this.senior = senior;
      this.student = student;
      this.cashGiven = cashGiven;
    }

    public double getAdult() {
      return adult;
    }

    public void setAdult(double adult) {
        this.adult = adult;
    }

    public double getChild() {
      return child;
    }

    public void setChild(double child) {
      this.child = child;
    }

    public double getSenior() {
      return senior;
    }

    public void setSenior(double senior) {
      this.senior = senior;
    }

    public double getStudent() {
      return student;
    }

    public void setStudent(double student) {
      this.student = student;
    }

    public double getTotal() {
      double total = ((adult * 10) + (child * 7.5) + (senior * 8) +
                     (student * 8));
      return total;
    }

    public double getCashGiven() {
      return cashGiven;
    }

    public void setCashGiven(double cashGiven) {
      this.cashGiven = cashGiven;
    }

    public double getChangeGiven() {
      double changeGiven = cashGiven - getTotal();
      return changeGiven;
    }
  }

  @Override
  public void start(Stage primaryStage) {
    //Create windows and items
    GridPane gridPane = new GridPane();
    gridPane.setAlignment(Pos.CENTER);
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.setPadding(new Insets(15, 15, 15, 15));
    gridPane.add(new Label("No. Adult:"), 0, 0);
    gridPane.add(new Label("£ 10.00"), 1, 0);
    gridPane.add(tfAdult, 2, 0);
    tfAdult.setText("0");
    gridPane.add(new Label("No. Child:"), 0, 2);
    gridPane.add(new Label("£   7.50"), 1, 2);
    gridPane.add(tfChild, 2, 2);
    tfChild.setText("0");
    gridPane.add(new Label("No. Senior:"), 0, 4);
    gridPane.add(new Label("£   8.00"), 1, 4);
    gridPane.add(tfSenior, 2, 4);
    tfSenior.setText("0");
    gridPane.add(new Label("No. Student:"), 0, 6);
    gridPane.add(new Label("£   8.00"), 1, 6);
    gridPane.add(tfStudent, 2, 6);
    tfStudent.setText("0");
    gridPane.add(new Label("Tickets Total:"), 0, 8);
    gridPane.add(tfTotal, 2, 8);
    gridPane.add(btCalculate1, 2, 10);
    gridPane.add(new Label("Cash Given:"), 0, 14);
    gridPane.add(tfCashGiven, 2, 14);
    tfCashGiven.setText("0");
    gridPane.add(new Label("Change Given:"), 0, 16);
    gridPane.add(tfChangeGiven, 2, 16);
    gridPane.add(btCalculate2, 2, 18);
    //gridPane.Vbox(1);

    //Set properties for UI
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

    //Button presses
    btCalculate1.setOnAction(e -> calculateTotal());
    btCalculate2.setOnAction(e -> calculateChangeGiven());

    //Create a scene and place it in the state
    Scene scene = new Scene(gridPane, 400, 400);
    primaryStage.setTitle("Price of Tickets");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  private void calculateTotal() {
    double adult = Integer.parseInt(tfAdult.getText());
    double child = Integer.parseInt(tfChild.getText());
    double senior = Integer.parseInt(tfSenior.getText());
    double student = Integer.parseInt(tfStudent.getText());
    double cash = Double.parseDouble(tfCashGiven.getText());

    Transaction transaction = new Transaction(adult, child, senior, student, cash);

    tfTotal.setText(String.format("£%.2f", transaction.getTotal()));
  }

  private void calculateChangeGiven() {
    double adult = Integer.parseInt(tfAdult.getText());
    double child = Integer.parseInt(tfChild.getText());
    double senior = Integer.parseInt(tfSenior.getText());
    double student = Integer.parseInt(tfStudent.getText());
    double cash = Double.parseDouble(tfCashGiven.getText());
    Transaction transaction = new Transaction(adult, child, senior, student, cash);

    if(transaction.getTotal() > cash) {
      tfChangeGiven.setText("Error: Insufficient Cash");
    }
    else {
      tfChangeGiven.setText(String.format("£%.2f", transaction.getChangeGiven()));
    }
  }
}
