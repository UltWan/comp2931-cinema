import java.util.*;
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

public class Controller3 implements Controller {
    private final VBox root;
    List<String> movieInfo = new ArrayList<String>();
    List<String> seatNum = new ArrayList<String>();
    Button btA1,btA2,btA3,btA4,btA5,btA6,btA7,btA8,btA9,btA10;
    Button btB1,btB2,btB3,btB4,bt15,bt16,bt17,bt18,bt19,bt20;
    Button btC1,bt22,bt23,bt24,bt25,bt26,bt27,bt28,bt29,bt30;
    Button btD1,bt32,bt33,bt34,bt35,bt36,bt37,bt38,bt39,bt40;
    Button btE1,bt42,bt43,bt44,bt45,bt46,bt47,bt48,bt49,bt50;
    Button btF1,bt52,bt53,bt54,bt55,bt56,bt57,bt58,bt59,bt60;
    Button btG1,bt62,bt63,bt64,bt65,bt66,bt67,bt68,bt69,bt70;
    Button btH1,bt72,bt73,bt74,bt75,bt76,bt77,bt78,bt79,bt80;
    Button btI1,bt82,bt83,bt84,bt85,bt86,bt87,bt88,bt89,bt90;
    Button btJ1,bt92,bt93,bt94,bt95,bt96,bt97,bt98,bt99,bt100;
    Button bt101,bt102,bt103,bt104,bt105,bt106,bt107,bt108,bt109,bt110,bt111;
    public Label lblInfo = new Label();

    boolean condition=true;

    public Controller3() {
      GridPane gridPane = new GridPane();
      gridPane.setAlignment(Pos.CENTER);
      gridPane.setHgap(5);
      gridPane.setVgap(5);
      gridPane.setPadding(new Insets(15, 15, 15, 15));

      btA1 = new Button(" A1 ");
      btA2 = new Button(" A2 ");
      btA3 = new Button(" A3 ");
      btA4 = new Button(" A4 ");
      btA5 = new Button(" A5 ");
      btA6 = new Button(" A6 ");
      btA7 = new Button(" A7 ");
      btA8 = new Button(" A8 ");
      btA9 = new Button(" A9 ");
      btA10 = new Button("A10");

      gridPane.add(btA1,0,10);
      gridPane.add(btA2,0,15);
      gridPane.add(btA3,0,20);
      gridPane.add(btA4,0,25);
      gridPane.add(btA5,0,30);
      gridPane.add(btA6,0,35);
      gridPane.add(btA7,0,40);
      gridPane.add(btA8,0,45);
      gridPane.add(btA9,0,50);
      gridPane.add(btA10,0,55);

      gridPane.setHalignment(btA1,HPos.RIGHT);
      gridPane.setHalignment(btA2,HPos.RIGHT);
      gridPane.setHalignment(btA3,HPos.RIGHT);
      gridPane.setHalignment(btA4,HPos.RIGHT);
      gridPane.setHalignment(btA5,HPos.RIGHT);
      gridPane.setHalignment(btA6,HPos.RIGHT);
      gridPane.setHalignment(btA7,HPos.RIGHT);
      gridPane.setHalignment(btA8,HPos.RIGHT);
      gridPane.setHalignment(btA9,HPos.RIGHT);
      gridPane.setHalignment(btA10,HPos.RIGHT);

      //  btA1.setAction(e->set.UserAgentStylesheet(STYLESHEET_CASPIAN));
      //---------------------------------1ST ROW END-------------------------------------------
      // gridPane.setHalignment(btA1,HPos.RIGHT);
      // gridPane.setHalignment(btA2,HPos.LEFT);

      btB1 = new Button(" B1 ");
      btB2 = new Button(" B2 ");
      btB3 = new Button(" B3 ");
      btB4 = new Button(" B4 ");
      bt15 = new Button(" B5 ");
      bt16 = new Button(" B6 ");
      bt17 = new Button(" B7 ");
      bt18 = new Button(" B8 ");
      bt19 = new Button(" B9 ");
      bt20 = new Button("B10");

      gridPane.add(btB1,1,10);
      gridPane.add(btB2,1,15);
      gridPane.add(btB3,1,20);
      gridPane.add(btB4,1,25);
      gridPane.add(bt15,1,30);
      gridPane.add(bt16,1,35);
      gridPane.add(bt17,1,40);
      gridPane.add(bt18,1,45);
      gridPane.add(bt19,1,50);
      gridPane.add(bt20,1,55);

      gridPane.setHalignment(btB1,HPos.RIGHT);
      gridPane.setHalignment(btB2,HPos.RIGHT);
      gridPane.setHalignment(btB3,HPos.RIGHT);
      gridPane.setHalignment(btB4,HPos.RIGHT);
      gridPane.setHalignment(bt15,HPos.RIGHT);
      gridPane.setHalignment(bt16,HPos.RIGHT);
      gridPane.setHalignment(bt17,HPos.RIGHT);
      gridPane.setHalignment(bt18,HPos.RIGHT);
      gridPane.setHalignment(bt19,HPos.RIGHT);
      gridPane.setHalignment(bt20,HPos.RIGHT);

      //-----------------------------------------------------------------------------

      btC1 = new Button(" C1 ");
      bt22 = new Button(" C2 ");
      bt23 = new Button(" C3 ");
      bt24 = new Button(" C4 ");
      bt25 = new Button(" C5 ");
      bt26 = new Button(" C6 ");
      bt27 = new Button(" C7 ");
      bt28 = new Button(" C8 ");
      bt29 = new Button(" C9 ");
      bt30 = new Button("C10");

      gridPane.add(btC1,2,10);
      gridPane.add(bt22,2,15);
      gridPane.add(bt23,2,20);
      gridPane.add(bt24,2,25);
      gridPane.add(bt25,2,30);
      gridPane.add(bt26,2,35);
      gridPane.add(bt27,2,40);
      gridPane.add(bt28,2,45);
      gridPane.add(bt29,2,50);
      gridPane.add(bt30,2,55);

      gridPane.setHalignment(btC1,HPos.RIGHT);
      gridPane.setHalignment(bt22,HPos.RIGHT);
      gridPane.setHalignment(bt23,HPos.RIGHT);
      gridPane.setHalignment(bt24,HPos.RIGHT);
      gridPane.setHalignment(bt25,HPos.RIGHT);
      gridPane.setHalignment(bt26,HPos.RIGHT);
      gridPane.setHalignment(bt27,HPos.RIGHT);
      gridPane.setHalignment(bt28,HPos.RIGHT);
      gridPane.setHalignment(bt29,HPos.RIGHT);
      gridPane.setHalignment(bt30,HPos.RIGHT);

      //------------------------------------------------------------------------

      btD1 = new Button(" D1 ");
      bt32 = new Button(" D2 ");
      bt33 = new Button(" D3 ");
      bt34 = new Button(" D4 ");
      bt35 = new Button(" D5 ");
      bt36 = new Button(" D6 ");
      bt37 = new Button(" D7 ");
      bt38 = new Button(" D8 ");
      bt39 = new Button(" D9 ");
      bt40 = new Button("D10");

      gridPane.add(btD1,3,10);
      gridPane.add(bt32,3,15);
      gridPane.add(bt33,3,20);
      gridPane.add(bt34,3,25);
      gridPane.add(bt35,3,30);
      gridPane.add(bt36,3,35);
      gridPane.add(bt37,3,40);
      gridPane.add(bt38,3,45);
      gridPane.add(bt39,3,50);
      gridPane.add(bt40,3,55);

      gridPane.setHalignment(btD1,HPos.RIGHT);
      gridPane.setHalignment(bt32,HPos.RIGHT);
      gridPane.setHalignment(bt33,HPos.RIGHT);
      gridPane.setHalignment(bt34,HPos.RIGHT);
      gridPane.setHalignment(bt35,HPos.RIGHT);
      gridPane.setHalignment(bt36,HPos.RIGHT);
      gridPane.setHalignment(bt37,HPos.RIGHT);
      gridPane.setHalignment(bt38,HPos.RIGHT);
      gridPane.setHalignment(bt39,HPos.RIGHT);
      gridPane.setHalignment(bt40,HPos.RIGHT);
      //----------------------------------------------------------------------------
      btE1 = new Button(" E1 ");
      bt42 = new Button(" E2 ");
      bt43 = new Button(" E3 ");
      bt44 = new Button(" E4 ");
      bt45 = new Button(" E5 ");
      bt46 = new Button(" E6 ");
      bt47 = new Button(" E7 ");
      bt48 = new Button(" E8 ");
      bt49 = new Button(" E9 ");
      bt50 = new Button("E10");

      gridPane.add(btE1,4,10);
      gridPane.add(bt42,4,15);
      gridPane.add(bt43,4,20);
      gridPane.add(bt44,4,25);
      gridPane.add(bt45,4,30);
      gridPane.add(bt46,4,35);
      gridPane.add(bt47,4,40);
      gridPane.add(bt48,4,45);
      gridPane.add(bt49,4,50);
      gridPane.add(bt50,4,55);

      gridPane.setHalignment(btE1,HPos.RIGHT);
      gridPane.setHalignment(bt42,HPos.RIGHT);
      gridPane.setHalignment(bt43,HPos.RIGHT);
      gridPane.setHalignment(bt44,HPos.RIGHT);
      gridPane.setHalignment(bt45,HPos.RIGHT);
      gridPane.setHalignment(bt46,HPos.RIGHT);
      gridPane.setHalignment(bt47,HPos.RIGHT);
      gridPane.setHalignment(bt48,HPos.RIGHT);
      gridPane.setHalignment(bt49,HPos.RIGHT);
      gridPane.setHalignment(bt50,HPos.RIGHT);
      //-------------------------------------------------------------------------
      btF1 = new Button(" F1 ");
      bt52 = new Button(" F2 ");
      bt53 = new Button(" F3 ");
      bt54 = new Button(" F4 ");
      bt55 = new Button(" F5 ");
      bt56 = new Button(" F6 ");
      bt57 = new Button(" F7 ");
      bt58 = new Button(" F8 ");
      bt59 = new Button(" F9 ");
      bt60 = new Button("F10");

      gridPane.add(btF1,7,10);
      gridPane.add(bt52,7,15);
      gridPane.add(bt53,7,20);
      gridPane.add(bt54,7,25);
      gridPane.add(bt55,7,30);
      gridPane.add(bt56,7,35);
      gridPane.add(bt57,7,40);
      gridPane.add(bt58,7,45);
      gridPane.add(bt59,7,50);
      gridPane.add(bt60,7,55);

      gridPane.setHalignment(btF1,HPos.RIGHT);
      gridPane.setHalignment(bt52,HPos.RIGHT);
      gridPane.setHalignment(bt53,HPos.RIGHT);
      gridPane.setHalignment(bt54,HPos.RIGHT);
      gridPane.setHalignment(bt55,HPos.RIGHT);
      gridPane.setHalignment(bt56,HPos.RIGHT);
      gridPane.setHalignment(bt57,HPos.RIGHT);
      gridPane.setHalignment(bt58,HPos.RIGHT);
      gridPane.setHalignment(bt59,HPos.RIGHT);
      gridPane.setHalignment(bt60,HPos.RIGHT);
      //--------------------------------------------------------------------------
      btG1 = new Button(" G1 ");
      bt62 = new Button(" G2 ");
      bt63 = new Button(" G3 ");
      bt64 = new Button(" G4 ");
      bt65 = new Button(" G5 ");
      bt66 = new Button(" G6 ");
      bt67 = new Button(" G7 ");
      bt68 = new Button(" G8 ");
      bt69 = new Button(" G9 ");
      bt70 = new Button("G10");

      gridPane.add(btG1,8,10);
      gridPane.add(bt62,8,15);
      gridPane.add(bt63,8,20);
      gridPane.add(bt64,8,25);
      gridPane.add(bt65,8,30);
      gridPane.add(bt66,8,35);
      gridPane.add(bt67,8,40);
      gridPane.add(bt68,8,45);
      gridPane.add(bt69,8,50);
      gridPane.add(bt70,8,55);

      gridPane.setHalignment(btG1,HPos.RIGHT);
      gridPane.setHalignment(bt62,HPos.RIGHT);
      gridPane.setHalignment(bt63,HPos.RIGHT);
      gridPane.setHalignment(bt64,HPos.RIGHT);
      gridPane.setHalignment(bt65,HPos.RIGHT);
      gridPane.setHalignment(bt66,HPos.RIGHT);
      gridPane.setHalignment(bt67,HPos.RIGHT);
      gridPane.setHalignment(bt68,HPos.RIGHT);
      gridPane.setHalignment(bt69,HPos.RIGHT);
      gridPane.setHalignment(bt70,HPos.RIGHT);

      //-------------------------------------------------------------------------
      btH1 = new Button(" H1 ");
      bt72 = new Button(" H2 ");
      bt73 = new Button(" H3 ");
      bt74 = new Button(" H4 ");
      bt75 = new Button(" H5 ");
      bt76 = new Button(" H6 ");
      bt77 = new Button(" H7 ");
      bt78 = new Button(" H8 ");
      bt79 = new Button(" H9 ");
      bt80 = new Button("H10");

      gridPane.add(btH1,9,10);
      gridPane.add(bt72,9,15);
      gridPane.add(bt73,9,20);
      gridPane.add(bt74,9,25);
      gridPane.add(bt75,9,30);
      gridPane.add(bt76,9,35);
      gridPane.add(bt77,9,40);
      gridPane.add(bt78,9,45);
      gridPane.add(bt79,9,50);
      gridPane.add(bt80,9,55);

      gridPane.setHalignment(btH1,HPos.RIGHT);
      gridPane.setHalignment(bt72,HPos.RIGHT);
      gridPane.setHalignment(bt73,HPos.RIGHT);
      gridPane.setHalignment(bt74,HPos.RIGHT);
      gridPane.setHalignment(bt75,HPos.RIGHT);
      gridPane.setHalignment(bt76,HPos.RIGHT);
      gridPane.setHalignment(bt77,HPos.RIGHT);
      gridPane.setHalignment(bt78,HPos.RIGHT);
      gridPane.setHalignment(bt79,HPos.RIGHT);
      gridPane.setHalignment(bt80,HPos.RIGHT);
      //-------------------------------------------------------------------------
      btI1 = new Button(" I1 ");
      bt82 = new Button(" I2 ");
      bt83 = new Button(" I3 ");
      bt84 = new Button(" I4 ");
      bt85 = new Button(" I5 ");
      bt86 = new Button(" I6 ");
      bt87 = new Button(" I7 ");
      bt88 = new Button(" I8 ");
      bt89 = new Button(" I9 ");
      bt90 = new Button("I10");

      gridPane.add(btI1,10,10);
      gridPane.add(bt82,10,15);
      gridPane.add(bt83,10,20);
      gridPane.add(bt84,10,25);
      gridPane.add(bt85,10,30);
      gridPane.add(bt86,10,35);
      gridPane.add(bt87,10,40);
      gridPane.add(bt88,10,45);
      gridPane.add(bt89,10,50);
      gridPane.add(bt90,10,55);

      gridPane.setHalignment(btI1,HPos.RIGHT);
      gridPane.setHalignment(bt82,HPos.RIGHT);
      gridPane.setHalignment(bt83,HPos.RIGHT);
      gridPane.setHalignment(bt84,HPos.RIGHT);
      gridPane.setHalignment(bt85,HPos.RIGHT);
      gridPane.setHalignment(bt86,HPos.RIGHT);
      gridPane.setHalignment(bt87,HPos.RIGHT);
      gridPane.setHalignment(bt88,HPos.RIGHT);
      gridPane.setHalignment(bt89,HPos.RIGHT);
      gridPane.setHalignment(bt90,HPos.RIGHT);
      //-------------------------------------------------------------------------
      btJ1 = new Button(" J1 ");
      bt92 = new Button(" J2 ");
      bt93 = new Button(" J3 ");
      bt94 = new Button(" J4 ");
      bt95 = new Button(" J5 ");
      bt96 = new Button(" J6 ");
      bt97 = new Button(" J7 ");
      bt98 = new Button(" J8 ");
      bt99 = new Button(" J9 ");
      bt100 = new Button("J10");

      gridPane.add(btJ1,11,10);
      gridPane.add(bt92,11,15);
      gridPane.add(bt93,11,20);
      gridPane.add(bt94,11,25);
      gridPane.add(bt95,11,30);
      gridPane.add(bt96,11,35);
      gridPane.add(bt97,11,40);
      gridPane.add(bt98,11,45);
      gridPane.add(bt99,11,50);
      gridPane.add(bt100,11,55);

      gridPane.setHalignment(btJ1,HPos.RIGHT);
      gridPane.setHalignment(bt92,HPos.RIGHT);
      gridPane.setHalignment(bt93,HPos.RIGHT);
      gridPane.setHalignment(bt94,HPos.RIGHT);
      gridPane.setHalignment(bt95,HPos.RIGHT);
      gridPane.setHalignment(bt96,HPos.RIGHT);
      gridPane.setHalignment(bt97,HPos.RIGHT);
      gridPane.setHalignment(bt98,HPos.RIGHT);
      gridPane.setHalignment(bt99,HPos.RIGHT);
      gridPane.setHalignment(bt100,HPos.RIGHT);

      //-------------------------SCREEN-------------------------------------------
      gridPane.add(lblInfo, 5, 0);
      bt111=new Button("SCREEN");
      gridPane.add(bt111,5,2);
      gridPane.setHalignment(bt111,HPos.CENTER);

      Button btBack = new Button("Back");

      btBack.setOnMouseClicked(e -> {
          Controller2 controller2 = new Controller2();
          btBack.getScene().setRoot(controller2.getContent());
      });

      Button btPayment = new Button("Payment");

      HBox hBox = new HBox(225);
      hBox.getChildren().add(btBack);
      hBox.getChildren().add(btPayment);
      hBox.setAlignment(Pos.CENTER);

      btPayment.setOnAction(event -> {
          Controller4 controller4 = new Controller4();
          controller4.lblInfo.setText(movieInfo.get(0) + " (" + movieInfo.get(1) +
                                      ")\n" + movieInfo.get(2) + ", Theatre No. " +
                                       movieInfo.get(3));
          controller4.lblSeats.setText("Seats: " + Arrays.toString(seatNum.toArray()));
          controller4.lblTotalSeats.setText("Total No. Seats: " + seatNum.size());
          btPayment.getScene().setRoot(controller4.getContent());
      });

      root = new VBox (gridPane, hBox);
      root.setAlignment(Pos.CENTER);
      //---------------------END OF SCREEN----------------------------------------

      //---------------------------ACTION CATCHERS--------------------------------


    btA1.setOnAction(this::handle);   btA2.setOnAction(this::handle);
    btA3.setOnAction(this::handle);   btA4.setOnAction(this::handle);
    btA5.setOnAction(this::handle);   btA6.setOnAction(this::handle);
    btA7.setOnAction(this::handle);   btA8.setOnAction(this::handle);
    btA9.setOnAction(this::handle);   btA10.setOnAction(this::handle);
    btB1.setOnAction(this::handle);  btB2.setOnAction(this::handle);
    btB3.setOnAction(this::handle);  btB4.setOnAction(this::handle);
    bt15.setOnAction(this::handle);  bt16.setOnAction(this::handle);
    bt17.setOnAction(this::handle);  bt18.setOnAction(this::handle);
    bt19.setOnAction(this::handle);  bt20.setOnAction(this::handle);
    btC1.setOnAction(this::handle);  bt22.setOnAction(this::handle);
    bt23.setOnAction(this::handle);  bt24.setOnAction(this::handle);
    bt25.setOnAction(this::handle);  bt26.setOnAction(this::handle);
    bt27.setOnAction(this::handle);  bt28.setOnAction(this::handle);
    bt29.setOnAction(this::handle);  bt30.setOnAction(this::handle);
    btD1.setOnAction(this::handle);  bt32.setOnAction(this::handle);
    bt33.setOnAction(this::handle);  bt34.setOnAction(this::handle);
    bt35.setOnAction(this::handle);  bt36.setOnAction(this::handle);
    bt37.setOnAction(this::handle);  bt38.setOnAction(this::handle);
    bt39.setOnAction(this::handle);  bt40.setOnAction(this::handle);
    btE1.setOnAction(this::handle);  bt42.setOnAction(this::handle);
    bt43.setOnAction(this::handle);  bt44.setOnAction(this::handle);
    bt45.setOnAction(this::handle);  bt46.setOnAction(this::handle);
    bt47.setOnAction(this::handle);  bt48.setOnAction(this::handle);
    bt49.setOnAction(this::handle);  bt50.setOnAction(this::handle);
    btF1.setOnAction(this::handle);  bt52.setOnAction(this::handle);
    bt53.setOnAction(this::handle);  bt54.setOnAction(this::handle);
    bt55.setOnAction(this::handle);  bt56.setOnAction(this::handle);
    bt57.setOnAction(this::handle);  bt58.setOnAction(this::handle);
    bt59.setOnAction(this::handle);  bt60.setOnAction(this::handle);
    btG1.setOnAction(this::handle);  bt62.setOnAction(this::handle);
    bt63.setOnAction(this::handle);  bt64.setOnAction(this::handle);
    bt65.setOnAction(this::handle);  bt66.setOnAction(this::handle);
    bt67.setOnAction(this::handle);  bt68.setOnAction(this::handle);
    bt69.setOnAction(this::handle);  bt70.setOnAction(this::handle);
    btH1.setOnAction(this::handle);  bt72.setOnAction(this::handle);
    bt73.setOnAction(this::handle);  bt74.setOnAction(this::handle);
    bt75.setOnAction(this::handle);  bt76.setOnAction(this::handle);
    bt77.setOnAction(this::handle);  bt78.setOnAction(this::handle);
    bt79.setOnAction(this::handle);  bt80.setOnAction(this::handle);
    btI1.setOnAction(this::handle);  bt82.setOnAction(this::handle);
    bt83.setOnAction(this::handle);  bt84.setOnAction(this::handle);
    bt85.setOnAction(this::handle);  bt86.setOnAction(this::handle);
    bt87.setOnAction(this::handle);  bt88.setOnAction(this::handle);
    bt89.setOnAction(this::handle);  bt90.setOnAction(this::handle);
    btJ1.setOnAction(this::handle);  bt92.setOnAction(this::handle);
    bt93.setOnAction(this::handle);  bt94.setOnAction(this::handle);
    bt95.setOnAction(this::handle);  bt96.setOnAction(this::handle);
    bt97.setOnAction(this::handle);  bt98.setOnAction(this::handle);
    bt99.setOnAction(this::handle);  bt100.setOnAction(this::handle);

    //------------------------END OF ACTION CATCHERS
    //scene.getStylesheets().add("style.css");


  }//---------------------END OF START------------------
  /*---------------------------BUTTON HANDLER-----------------------------------*/
  public void handle(ActionEvent event){
    if(event.getSource()==btA1 & condition==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat A1 selected");
      condition=false;
      seatNum.add("A1");
    }else if(event.getSource()==btA1 & condition==false){
      System.out.println("Seat A1 deselected");
      condition=true;
      seatNum.remove("A1");
    }

    if(event.getSource()==btA2 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 selected");
      condition=false;
      seatNum.add("A2");
    }else if(event.getSource()==btA2 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 deselected");
      condition=true;
      seatNum.remove("A2");
    }
    if(event.getSource()==btA3 & condition==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat A3 selected");
      condition=false;
      seatNum.add("A3");
    }else if(event.getSource()==btA3 & condition==false){
      System.out.println("Seat A3 deselected");
      condition=true;
      seatNum.remove("A3");
    }

    if (event.getSource()==btA4 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A4 selected");
      condition=false;
      seatNum.add("A4");
    }else if(event.getSource()==btA4 & condition==false){
      System.out.println("Seat A4 deselected");
      condition=true;
      seatNum.remove("A4");
    }

    if(event.getSource()==btA5 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 selected");
      condition=false;
      seatNum.add("A5");
    }else if(event.getSource()==btA5 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 deselected");
      condition=true;
      seatNum.remove("A5");
    }

    if(event.getSource()==btA6 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 selected");
      condition=false;
      seatNum.add("A6");
    }else if(event.getSource()==btA6 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 deselected");
      condition=true;
      seatNum.remove("A6");
    }

    if(event.getSource()==btA7 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 selected");
      condition=false;
      seatNum.add("A7");
    }else if(event.getSource()==btA7 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 deselected");
      condition=true;
      seatNum.remove("A7");
    }

    if(event.getSource()==btA8 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 selected");
      condition=false;
      seatNum.add("A8");
    }else if(event.getSource()==btA8 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 deselected");
      condition=true;
      seatNum.remove("A8");
    }

    if(event.getSource()==btA9 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 selected");
      condition=false;
      seatNum.add("A9");
    }else if(event.getSource()==btA9 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 deselected");
      condition=true;
      seatNum.remove("A9");
    }

    if(event.getSource()==btA10 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 selected");
      condition=false;
      seatNum.add("A10");
    }else if(event.getSource()==btA10 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 deselected");
      condition=true;
      seatNum.remove("A10");
    }

    if(event.getSource()==btB1 & condition==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat B1 selected");
      condition=false;
      seatNum.add("B1");
    }else if(event.getSource()==btB1 & condition==false){
      System.out.println("Seat B1 deselected");
      condition=true;
      seatNum.remove("B1");
    }

    if(event.getSource()==btB2 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B2 selected");
      condition=false;
      seatNum.add("B2");
    }else if(event.getSource()==btB2 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B2 deselected");
      condition=true;
      seatNum.remove("B2");
    }
    if(event.getSource()==btB3 & condition==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat B3 selected");
      condition=false;
      seatNum.add("B3");
    }else if(event.getSource()==btB3 & condition==false){
      System.out.println("Seat B3 deselected");
      condition=true;
      seatNum.remove("B3");
    }

    if (event.getSource()==btB4 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B4 selected");
      condition=false;
      seatNum.add("B4");
    }else if(event.getSource()==btB4 & condition==false){
      System.out.println("Seat B4 deselected");
      condition=true;
      seatNum.remove("B4");
    }

    if(event.getSource()==bt15 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B5 selected");
      condition=false;
      seatNum.add("B5");
    }else if(event.getSource()==bt15 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B5 deselected");
      condition=true;
      seatNum.remove("B5");
    }

    if(event.getSource()==bt16 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B6 selected");
      condition=false;
      seatNum.add("B6");
    }else if(event.getSource()==bt16 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B6 deselected");
      condition=true;
      seatNum.remove("B6");
    }

    if(event.getSource()==bt17 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B7 selected");
      condition=false;
      seatNum.add("B7");
    }else if(event.getSource()==bt17 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B7 deselected");
      condition=true;
      seatNum.remove("B7");
    }

    if(event.getSource()==bt18 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B8 selected");
      condition=false;
      seatNum.add("B8");
    }else if(event.getSource()==bt18 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B8 deselected");
      condition=true;
      seatNum.remove("B8");
    }

    if(event.getSource()==bt19 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B9 selected");
      condition=false;
      seatNum.add("B9");
    }else if(event.getSource()==bt19 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B9 deselected");
      condition=true;
      seatNum.remove("B8");
    }

    if(event.getSource()==bt20 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B10 selected");
      condition=false;
      seatNum.add("B10");
    }else if(event.getSource()==bt20 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B10 deselected");
      condition=true;
      seatNum.remove("B10");
    }

    if(event.getSource()==btC1 & condition==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat C1 selected");
      condition=false;
      seatNum.add("C1");
    }else if(event.getSource()==btC1 & condition==false){
      System.out.println("Seat C1 deselected");
      condition=true;
      seatNum.remove("C1");
    }

    if(event.getSource()==bt22 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C2 selected");
      condition=false;
      seatNum.add("C2");
    }else if(event.getSource()==bt22 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C2 deselected");
      condition=true;
      seatNum.remove("C2");
    }
    if(event.getSource()==bt23 & condition==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat C3 selected");
      condition=false;
      seatNum.add("C3");
    }else if(event.getSource()==bt23 & condition==false){
      System.out.println("Seat C3 deselected");
      condition=true;
      seatNum.remove("C3");
    }

    if (event.getSource()==bt24 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C4 selected");
      condition=false;
      seatNum.add("C4");
    }else if(event.getSource()==bt24 & condition==false){
      System.out.println("Seat C4 deselected");
      condition=true;
      seatNum.remove("C4");
    }

    if(event.getSource()==bt25 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C5 selected");
      condition=false;
      seatNum.add("C5");
    }else if(event.getSource()==bt25 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C5 deselected");
      condition=true;
      seatNum.remove("C5");
    }

    if(event.getSource()==bt26 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C6 selected");
      condition=false;
      seatNum.add("C6");
    }else if(event.getSource()==bt26 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C6 deselected");
      condition=true;
      seatNum.remove("C6");
    }

    if(event.getSource()==bt27 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C7 selected");
      condition=false;
      seatNum.add("C7");
    }else if(event.getSource()==bt27 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C7 deselected");
      condition=true;
      seatNum.remove("C7");
    }

    if(event.getSource()==bt28 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C8 selected");
      condition=false;
      seatNum.add("C8");
    }else if(event.getSource()==bt28 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C8 deselected");
      condition=true;
      seatNum.remove("C8");
    }

    if(event.getSource()==bt29 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C9 selected");
      condition=false;
      seatNum.add("C9");
    }else if(event.getSource()==bt29 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C9 deselected");
      condition=true;
      seatNum.remove("C9");
    }

    if(event.getSource()==bt30 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C10 selected");
      condition=false;
      seatNum.add("C10");
    }else if(event.getSource()==bt30 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C10 deselected");
      condition=true;
      seatNum.remove("C10");
    }

    if(event.getSource()==btD1 & condition==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat D1 selected");
      condition=false;
      seatNum.add("D1");
    }else if(event.getSource()==btD1 & condition==false){
      System.out.println("Seat D1 deselected");
      condition=true;
      seatNum.remove("D1");
    }

    if(event.getSource()==bt32 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D2 selected");
      condition=false;
      seatNum.add("D2");
    }else if(event.getSource()==bt32 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D2 deselected");
      condition=true;
      seatNum.remove("D2");
    }
    if(event.getSource()==bt33 & condition==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat D3 selected");
      condition=false;
      seatNum.add("D3");
    }else if(event.getSource()==bt33 & condition==false){
      System.out.println("Seat D3 deselected");
      condition=true;
      seatNum.remove("D3");
    }

    if (event.getSource()==bt34 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D4 selected");
      condition=false;
      seatNum.add("D4");
    }else if(event.getSource()==bt34 & condition==false){
      System.out.println("Seat D4 deselected");
      condition=true;
      seatNum.remove("D4");
    }

    if(event.getSource()==bt35 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D5 selected");
      condition=false;
      seatNum.add("D5");
    }else if(event.getSource()==bt35 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D5 deselected");
      condition=true;
      seatNum.remove("D5");
    }

    if(event.getSource()==bt36 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D6 selected");
      condition=false;
      seatNum.add("D6");
    }else if(event.getSource()==bt36 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D6 deselected");
      condition=true;
      seatNum.remove("D6");
    }

    if(event.getSource()==bt37 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D7 selected");
      condition=false;
      seatNum.add("D7");
    }else if(event.getSource()==bt37 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D7 deselected");
      condition=true;
      seatNum.remove("D7");

    }

    if(event.getSource()==bt38 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D8 selected");
      condition=false;
      seatNum.add("D8");
    }else if(event.getSource()==bt38 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D8 deselected");
      condition=true;
      seatNum.remove("D8");    }

    if(event.getSource()==bt39 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D9 selected");
      condition=false;
      seatNum.add("D9");
    }else if(event.getSource()==bt39 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D9 deselected");
      condition=true;
      seatNum.remove("D9");
    }

    if(event.getSource()==bt40 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D10 selected");
      condition=false;
      seatNum.add("D10");
    }else if(event.getSource()==bt40 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D10 deselected");
      condition=true;
      seatNum.remove("D10");
    }

    if(event.getSource()==btE1 & condition==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat E1 selected");
      condition=false;
      seatNum.add("E1");
    }else if(event.getSource()==btE1 & condition==false){
      System.out.println("Seat E1 deselected");
      condition=true;
      seatNum.remove("E1");
    }

    if(event.getSource()==bt42 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E2 selected");
      condition=false;
      seatNum.add("E2");
    }else if(event.getSource()==bt42 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E2 deselected");
      condition=true;
      seatNum.remove("E2");
    }
    if(event.getSource()==bt43 & condition==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat E3 selected");
      condition=false;
      seatNum.add("E3");
    }else if(event.getSource()==bt43 & condition==false){
      System.out.println("Seat E3 deselected");
      condition=true;      seatNum.remove("D10");
      seatNum.remove("E3");
    }

    if (event.getSource()==bt44 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E4 selected");
      condition=false;
      seatNum.add("E4");
    }else if(event.getSource()==bt44 & condition==false){
      System.out.println("Seat E4 deselected");
      condition=true;
      seatNum.remove("E4");
    }

    if(event.getSource()==bt45 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E5 selected");
      condition=false;
      seatNum.add("E5");
    }else if(event.getSource()==bt45 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E5 deselected");
      condition=true;
      seatNum.remove("E5");
    }

    if(event.getSource()==bt46 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E6 selected");
      condition=false;
      seatNum.add("E6");
    }else if(event.getSource()==bt46 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E6 deselected");
      seatNum.remove("E6");

    }

    if(event.getSource()==bt47 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E7 selected");
      condition=false;
      seatNum.add("E7");
    }else if(event.getSource()==bt47 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E7 deselected");
      condition=true;
      seatNum.remove("E7");
    }

    if(event.getSource()==bt48 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E8 selected");
      condition=false;
      seatNum.add("E8");
    }else if(event.getSource()==bt48 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E8 deselected");
      condition=true;
      seatNum.remove("E8");
    }

    if(event.getSource()==bt49 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E9 selected");
      condition=false;
      seatNum.add("E9");
    }else if(event.getSource()==bt49 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E9 deselected");
      condition=true;
      seatNum.remove("E9");

    }

    if(event.getSource()==bt50 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E10 selected");
      condition=false;
      seatNum.add("E10");

    }else if(event.getSource()==bt50 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E10 deselected");
      condition=true;
      seatNum.remove("E10");
    }

    if(event.getSource()==btF1 & condition==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat F1 selected");
      condition=false;
      seatNum.add("F1");
    }else if(event.getSource()==btF1 & condition==false){
      System.out.println("Seat F1 deselected");
      condition=true;
      seatNum.remove("F1");
    }

    if(event.getSource()==bt52 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F2 selected");
      condition=false;
      seatNum.add("F2");
    }else if(event.getSource()==bt52 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F2 deselected");
      condition=true;
      seatNum.remove("F2");
    }

    if(event.getSource()==bt53 & condition==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat F3 selected");
      condition=false;
      seatNum.add("F3");
    }else if(event.getSource()==bt53 & condition==false){
      System.out.println("Seat F3 deselected");
      condition=true;
      seatNum.remove("F3");
    }

    if (event.getSource()==bt54 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F4 selected");
      condition=false;
      seatNum.add("F4");
    }else if(event.getSource()==bt54 & condition==false){
      System.out.println("Seat F4 deselected");
      condition=true;
      seatNum.remove("F4");
    }

    if(event.getSource()==bt55 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F5 selected");
      condition=false;
      seatNum.add("F5");
    }else if(event.getSource()==bt55 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F5 deselected");
      condition=true;
      seatNum.remove("F5");
    }

    if(event.getSource()==bt56 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F6 selected");
      condition=false;
      seatNum.add("F6");
    }else if(event.getSource()==bt56 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F6 deselected");
      condition=true;
      seatNum.remove("F6");
    }

    if(event.getSource()==bt57 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F7 selected");
      condition=false;
      seatNum.add("F7");
    }else if(event.getSource()==bt57 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F7 deselected");
      condition=true;
      seatNum.remove("F7");
    }

    if(event.getSource()==bt58 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F8 selected");
      condition=false;
      seatNum.add("F8");
    }else if(event.getSource()==bt58 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F8 deselected");
      condition=true;
      seatNum.remove("F8");
    }

    if(event.getSource()==bt59 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F9 selected");
      condition=false;
      seatNum.add("F9");
    }else if(event.getSource()==bt59 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F9 deselected");
      condition=true;
      seatNum.remove("F9");
    }

    if(event.getSource()==bt60 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F10 selected");
      condition=false;
      seatNum.add("F10");
    }else if(event.getSource()==bt60 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F10 deselected");
      condition=true;
      seatNum.remove("F10");
    }

    if(event.getSource()==btG1 & condition==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat G1 selected");
      condition=false;
      seatNum.add("G1");
    }else if(event.getSource()==btG1 & condition==false){
      System.out.println("Seat G1 deselected");
      condition=true;
      seatNum.remove("G1");
    }

    if(event.getSource()==bt62 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G2 selected");
      condition=false;
      seatNum.add("G2");
    }else if(event.getSource()==bt62 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G2 deselected");
      condition=true;
      seatNum.remove("G2");
    }

    if(event.getSource()==bt63 & condition==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat G3 selected");
      condition=false;
      seatNum.add("G3");
    }else if(event.getSource()==bt63 & condition==false){
      System.out.println("Seat G3 deselected");
      condition=true;
      seatNum.remove("G3");
    }

    if (event.getSource()==bt64 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G4 selected");
      condition=false;
      seatNum.add("G4");
    }else if(event.getSource()==bt64 & condition==false){
      System.out.println("Seat G4 deselected");
      condition=true;
      seatNum.remove("G4");
    }

    if(event.getSource()==bt65 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G5 selected");
      condition=false;
      seatNum.add("G5");
    }else if(event.getSource()==bt65 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G5 deselected");
      condition=true;
      seatNum.remove("G5");
    }

    if(event.getSource()==bt66 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G6 selected");
      condition=false;
      seatNum.add("G6");
    }else if(event.getSource()==bt66 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G6 deselected");
      condition=true;
      seatNum.remove("G6");
    }

    if(event.getSource()==bt67 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G7 selected");
      condition=false;
      seatNum.add("G7");
    }else if(event.getSource()==bt67 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G7 deselected");
      condition=true;
      seatNum.remove("G7");
    }

    if(event.getSource()==bt68 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G8 selected");
      condition=false;
      seatNum.add("G8");
    }else if(event.getSource()==bt68 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G8 deselected");
      condition=true;
      seatNum.remove("G8");
    }

    if(event.getSource()==bt69 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G9 selected");
      condition=false;
      seatNum.add("G9");
    }else if(event.getSource()==bt69 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G9 deselected");
      condition=true;
      seatNum.remove("G9");
    }

    if(event.getSource()==bt70 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G10 selected");
      condition=false;
      seatNum.add("G10");
    }else if(event.getSource()==bt70 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G10 deselected");
      condition=true;
      seatNum.remove("G10");
    }

    if(event.getSource()==btH1 & condition==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat H1 selected");
      condition=false;
      seatNum.add("H1");
    }else if(event.getSource()==btH1 & condition==false){
      System.out.println("Seat H1 deselected");
      condition=true;
      seatNum.remove("H1");
    }

    if(event.getSource()==bt72 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H2 selected");
      condition=false;
      seatNum.add("H2");
    }else if(event.getSource()==bt72 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H2 deselected");
      condition=true;
      seatNum.remove("H2");
    }
    if(event.getSource()==bt73 & condition==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat H3 selected");
      condition=false;
      seatNum.add("H3");
    }else if(event.getSource()==bt73 & condition==false){
      System.out.println("Seat H3 deselected");
      condition=true;
      seatNum.remove("H3");
    }

    if (event.getSource()==bt74 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H4 selected");
      condition=false;
      seatNum.add("H4");
    }else if(event.getSource()==bt74 & condition==false){
      System.out.println("Seat H4 deselected");
      condition=true;
      seatNum.remove("H4");
    }

    if(event.getSource()==bt75 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H5 selected");
      condition=false;
      seatNum.add("H5");
    }else if(event.getSource()==bt75 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H5 deselected");
      condition=true;
      seatNum.remove("H5");
    }

    if(event.getSource()==bt76 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H6 selected");
      condition=false;
      seatNum.add("H6");
    }else if(event.getSource()==bt76 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H6 deselected");
      condition=true;
      seatNum.remove("H6");
    }

    if(event.getSource()==bt77 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H7 selected");
      condition=false;
      seatNum.add("H7");
    }else if(event.getSource()==bt77 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H7 deselected");
      condition=true;
      seatNum.remove("H7");
    }

    if(event.getSource()==bt78 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H8 selected");
      condition=false;
      seatNum.add("H8");
    }else if(event.getSource()==bt78 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H8 deselected");
      condition=true;
      seatNum.remove("H8");
    }

    if(event.getSource()==bt79 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H9 selected");
      condition=false;
      seatNum.add("H9");
    }else if(event.getSource()==bt79 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H9 deselected");
      condition=true;
      seatNum.remove("H9");
    }

    if(event.getSource()==bt80 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H10 selected");
      condition=false;
      seatNum.add("H10");
    }else if(event.getSource()==bt80 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H10 deselected");
      condition=true;
      seatNum.remove("H10");
    }

    if(event.getSource()==btI1 & condition==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat I1 selected");
      condition=false;
      seatNum.add("I1");
    }else if(event.getSource()==btI1 & condition==false){
      System.out.println("Seat I1 deselected");
      condition=true;
      seatNum.remove("I1");
    }

    if(event.getSource()==bt82 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I2 selected");
      condition=false;
      seatNum.add("I2");
    }else if(event.getSource()==bt82 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I2 deselected");
      condition=true;
      seatNum.remove("I2");
    }
    if(event.getSource()==bt83 & condition==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat I3 selected");
      condition=false;
      seatNum.add("I3");
    }else if(event.getSource()==bt83 & condition==false){
      System.out.println("Seat I3 deselected");
      condition=true;
      seatNum.remove("I3");
    }

    if (event.getSource()==bt84 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I4 selected");
      condition=false;
      seatNum.add("I4");
    }else if(event.getSource()==bt84 & condition==false){
      System.out.println("Seat I4 deselected");
      condition=true;
      seatNum.remove("I4");
    }

    if(event.getSource()==bt85 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I5 selected");
      condition=false;
      seatNum.add("I5");
    }else if(event.getSource()==bt85 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I5 deselected");
      condition=true;
      seatNum.remove("I5");
    }

    if(event.getSource()==bt86 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I6 selected");
      condition=false;
      seatNum.add("I6");
    }else if(event.getSource()==bt86 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I6 deselected");
      condition=true;
      seatNum.remove("I6");
    }

    if(event.getSource()==bt87 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I7 selected");
      condition=false;
      seatNum.add("I7");
    }else if(event.getSource()==bt87 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I7 deselected");
      condition=true;
      seatNum.remove("I7");
    }

    if(event.getSource()==bt88 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I8 selected");
      condition=false;
      seatNum.add("I8");
    }else if(event.getSource()==bt88 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I8 deselected");
      condition=true;
      seatNum.remove("I8");
    }

    if(event.getSource()==bt89 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I9 selected");
      condition=false;
      seatNum.add("I9");
    }else if(event.getSource()==bt89 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I9 deselected");
      condition=true;
      seatNum.remove("I9");
    }

    if(event.getSource()==bt90 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I10 selected");
      condition=false;
      seatNum.add("I10");
    }else if(event.getSource()==bt90 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I10 deselected");
      condition=true;
      seatNum.remove("I10");
    }

    if(event.getSource()==btJ1 & condition==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat J1 selected");
      condition=false;
      seatNum.add("J1");
    }else if(event.getSource()==btJ1 & condition==false){
      System.out.println("Seat J1 deselected");
      condition=true;
      seatNum.remove("J1");
    }

    if(event.getSource()==bt92 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J2 selected");
      condition=false;
      seatNum.add("J2");
    }else if(event.getSource()==bt92 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J2 deselected");
      condition=true;
      seatNum.remove("J2");
    }
    if(event.getSource()==bt93 & condition==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat J3 selected");
      condition=false;
      seatNum.add("J3");
    }else if(event.getSource()==bt93 & condition==false){
      System.out.println("Seat J3 deselected");
      condition=true;
      seatNum.remove("J3");
    }

    if (event.getSource()==bt94 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J4 selected");
      condition=false;
      seatNum.add("J4");
    }else if(event.getSource()==bt94 & condition==false){
      System.out.println("Seat J4 deselected");
      condition=true;
      seatNum.remove("J4");
    }

    if(event.getSource()==bt95 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J5 selected");
      condition=false;
      seatNum.add("J5");
    }else if(event.getSource()==bt95 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J5 deselected");
      condition=true;
      seatNum.remove("J5");
    }

    if(event.getSource()==bt96 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J6 selected");
      condition=false;
      seatNum.add("J6");
    }else if(event.getSource()==bt96 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J6 deselected");
      condition=true;
      seatNum.remove("J6");
    }

    if(event.getSource()==bt97 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J7 selected");
      condition=false;
      seatNum.add("J7");
    }else if(event.getSource()==bt97 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J7 deselected");
      condition=true;
      seatNum.remove("J7");
    }

    if(event.getSource()==bt98 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J8 selected");
      condition=false;
      seatNum.add("J8");
    }else if(event.getSource()==bt98 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J8 deselected");
      condition=true;
      seatNum.remove("J8");
    }

    if(event.getSource()==bt99 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J9 selected");
      condition=false;
      seatNum.add("J9");
    }else if(event.getSource()==bt99 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J9 deselected");
      condition=true;
      seatNum.remove("J9");
    }

    if(event.getSource()==bt100 & condition==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J10 selected");
      condition=false;
      seatNum.add("J10");
    }else if(event.getSource()==bt100 & condition==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J10 deselected");
      condition=true;
      seatNum.remove("J10");
    }

  }/*-------------------------END OF BUTTON HANDLER-----------------------------*/



    @Override
    public Parent getContent() {
        return root;
    }
}
