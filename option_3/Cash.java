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

    private TextField tfTotalAmount = new TextField();
    private TextField tfCashGiven = new TextField();
    private TextField tfChangeGiven = new TextField();
    private Button btCalculate = new Button("Calculate");

    public class Transaction {
        private double totalAmount;
        private double cashGiven;

        public Transaction(double totalAmount, double cashGiven) {
            this.totalAmount = totalAmount;
            this.cashGiven = cashGiven;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(double totalAmount) {
            this.totalAmount = totalAmount;
        }

        public double getCashGiven() {
            return cashGiven;
        }

        public void setCashGiven(double cashGiven) {
            this.cashGiven = cashGiven;
        }

        public double getChangeGiven() {
            double changeGiven = cashGiven - totalAmount;
            return changeGiven;
        }
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Cashier Till");
        //Create UI
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.setPadding(new Insets(15, 15, 15, 15));
        gridPane.add(new Label("Total Amount:"), 0, 0);
        gridPane.add(tfTotalAmount, 1, 0);
        gridPane.add(new Label("Cash Given:"), 0, 2);
        gridPane.add(tfCashGiven, 1, 2);
        gridPane.add(new Label("Change Given:"), 0, 4);
        gridPane.add(tfChangeGiven, 1, 4);
        gridPane.add(btCalculate, 1, 6);

        //Set properties for UI
        gridPane.setAlignment(Pos.CENTER);
        tfTotalAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfCashGiven.setAlignment(Pos.BOTTOM_RIGHT);
        tfChangeGiven.setAlignment(Pos.BOTTOM_RIGHT);
        tfChangeGiven.setEditable(false);
        GridPane.setHalignment(btCalculate, HPos.RIGHT);

        //Process events
        btCalculate.setOnAction(e -> calculateChangeGiven());

        //Create a scene and place it in the state
        Scene scene = new Scene(gridPane, 400, 250);
        primaryStage.setTitle("Cashier Till");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void calculateChangeGiven() {
        double total = Double.parseDouble(tfTotalAmount.getText());
        double cash = Double.parseDouble(tfCashGiven.getText());
        Transaction transaction = new Transaction(total, cash);

        if(total > cash)
        {
            tfChangeGiven.setText("Error: Insufficient Cash");
        }
        else
        {
            tfChangeGiven.setText(String.format("£%.2f", transaction.getChangeGiven()));
        }
    }
}
