import java.util.*;
import javafx.scene.Parent;
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
    public List<String> movieInfo = new ArrayList<String>();
    public Collection<String> seatNum = new TreeSet<String>();
    public Label lblInfo = new Label();
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10;
    Button bt11,bt12,bt13,bt14,bt15,bt16,bt17,bt18,bt19,bt20;
    Button bt21,bt22,bt23,bt24,bt25,bt26,bt27,bt28,bt29,bt30;
    Button bt31,bt32,bt33,bt34,bt35,bt36,bt37,bt38,bt39,bt40;
    Button bt41,bt42,bt43,bt44,bt45,bt46,bt47,bt48,bt49,bt50;
    Button bt51,bt52,bt53,bt54,bt55,bt56,bt57,bt58,bt59,bt60;
    Button bt61,bt62,bt63,bt64,bt65,bt66,bt67,bt68,bt69,bt70;
    Button bt71,bt72,bt73,bt74,bt75,bt76,bt77,bt78,bt79,bt80;
    Button bt81,bt82,bt83,bt84,bt85,bt86,bt87,bt88,bt89,bt90;
    Button bt91,bt92,bt93,bt94,bt95,bt96,bt97,bt98,bt99,bt100;
    Button bt101,bt102,bt103,bt104,bt105,bt106,bt107,bt108,bt109,bt110,bt111;

    boolean condition1=true; boolean condition2=true; boolean condition3=true;
    boolean condition4=true; boolean condition5=true; boolean condition6=true;
    boolean condition7=true; boolean condition8=true; boolean condition9=true;
    boolean condition10=true;boolean condition11=true;boolean condition12=true;
    boolean condition13=true;boolean condition14=true;boolean condition15=true;
    boolean condition16=true;boolean condition17=true;boolean condition18=true;
    boolean condition19=true;boolean condition20=true;boolean condition21=true;
    boolean condition22=true;boolean condition23=true;boolean condition24=true;
    boolean condition25=true;boolean condition26=true;boolean condition27=true;
    boolean condition28=true;boolean condition29=true;boolean condition30=true;
    boolean condition31=true;boolean condition32=true;boolean condition33=true;
    boolean condition34=true;boolean condition35=true;boolean condition36=true;
    boolean condition37=true;boolean condition38=true;boolean condition39=true;
    boolean condition40=true;boolean condition41=true;boolean condition42=true;
    boolean condition43=true;boolean condition44=true;boolean condition45=true;
    boolean condition46=true;boolean condition47=true;boolean condition48=true;
    boolean condition49=true;boolean condition50=true;boolean condition51=true;
    boolean condition52=true;boolean condition53=true;boolean condition54=true;
    boolean condition55=true;boolean condition56=true;boolean condition57=true;
    boolean condition58=true;boolean condition59=true;boolean condition60=true;
    boolean condition61=true;boolean condition62=true;boolean condition63=true;
    boolean condition64=true;boolean condition65=true;boolean condition66=true;
    boolean condition67=true;boolean condition68=true;boolean condition69=true;
    boolean condition70=true;boolean condition71=true;boolean condition72=true;
    boolean condition73=true;boolean condition74=true;boolean condition75=true;
    boolean condition76=true;boolean condition77=true;boolean condition78=true;
    boolean condition79=true;boolean condition80=true;boolean condition81=true;
    boolean condition82=true;boolean condition83=true;boolean condition84=true;
    boolean condition85=true;boolean condition86=true;boolean condition87=true;
    boolean condition88=true;boolean condition89=true;boolean condition90=true;
    boolean condition91=true;boolean condition92=true;boolean condition93=true;
    boolean condition94=true;boolean condition95=true;boolean condition96=true;
    boolean condition97=true;boolean condition98=true;boolean condition99=true;
    boolean condition100=true;

    public Controller3() {
      GridPane gridPane = new GridPane();
      gridPane.setAlignment(Pos.CENTER);
      gridPane.setHgap(5);
      gridPane.setVgap(5);
      gridPane.setPadding(new Insets(15, 15, 15, 15));

      bt1 = new Button(" A1 ");
      bt2 = new Button(" A2 ");
      bt3 = new Button(" A3 ");
      bt4 = new Button(" A4 ");
      bt5 = new Button(" A5 ");
      bt6 = new Button(" A6 ");
      bt7 = new Button(" A7 ");
      bt8 = new Button(" A8 ");
      bt9 = new Button(" A9 ");
      bt10 = new Button("A10");

      gridPane.add(bt1,0,10);
      gridPane.add(bt2,0,15);
      gridPane.add(bt3,0,20);
      gridPane.add(bt4,0,25);
      gridPane.add(bt5,0,30);
      gridPane.add(bt6,0,35);
      gridPane.add(bt7,0,40);
      gridPane.add(bt8,0,45);
      gridPane.add(bt9,0,50);
      gridPane.add(bt10,0,55);

      gridPane.setHalignment(bt1,HPos.RIGHT);
      gridPane.setHalignment(bt2,HPos.RIGHT);
      gridPane.setHalignment(bt3,HPos.RIGHT);
      gridPane.setHalignment(bt4,HPos.RIGHT);
      gridPane.setHalignment(bt5,HPos.RIGHT);
      gridPane.setHalignment(bt6,HPos.RIGHT);
      gridPane.setHalignment(bt7,HPos.RIGHT);
      gridPane.setHalignment(bt8,HPos.RIGHT);
      gridPane.setHalignment(bt9,HPos.RIGHT);
      gridPane.setHalignment(bt10,HPos.RIGHT);

      //---------------------------------1ST ROW END-------------------------------------------

      bt11 = new Button(" B1 ");
      bt12 = new Button(" B2 ");
      bt13 = new Button(" B3 ");
      bt14 = new Button(" B4 ");
      bt15 = new Button(" B5 ");
      bt16 = new Button(" B6 ");
      bt17 = new Button(" B7 ");
      bt18 = new Button(" B8 ");
      bt19 = new Button(" B9 ");
      bt20 = new Button("B10");

      gridPane.add(bt11,1,10);
      gridPane.add(bt12,1,15);
      gridPane.add(bt13,1,20);
      gridPane.add(bt14,1,25);
      gridPane.add(bt15,1,30);
      gridPane.add(bt16,1,35);
      gridPane.add(bt17,1,40);
      gridPane.add(bt18,1,45);
      gridPane.add(bt19,1,50);
      gridPane.add(bt20,1,55);

      gridPane.setHalignment(bt11,HPos.RIGHT);
      gridPane.setHalignment(bt12,HPos.RIGHT);
      gridPane.setHalignment(bt13,HPos.RIGHT);
      gridPane.setHalignment(bt14,HPos.RIGHT);
      gridPane.setHalignment(bt15,HPos.RIGHT);
      gridPane.setHalignment(bt16,HPos.RIGHT);
      gridPane.setHalignment(bt17,HPos.RIGHT);
      gridPane.setHalignment(bt18,HPos.RIGHT);
      gridPane.setHalignment(bt19,HPos.RIGHT);
      gridPane.setHalignment(bt20,HPos.RIGHT);

      //-----------------------------------------------------------------------------

      bt21 = new Button(" C1 ");
      bt22 = new Button(" C2 ");
      bt23 = new Button(" C3 ");
      bt24 = new Button(" C4 ");
      bt25 = new Button(" C5 ");
      bt26 = new Button(" C6 ");
      bt27 = new Button(" C7 ");
      bt28 = new Button(" C8 ");
      bt29 = new Button(" C9 ");
      bt30 = new Button("C10");

      gridPane.add(bt21,2,10);
      gridPane.add(bt22,2,15);
      gridPane.add(bt23,2,20);
      gridPane.add(bt24,2,25);
      gridPane.add(bt25,2,30);
      gridPane.add(bt26,2,35);
      gridPane.add(bt27,2,40);
      gridPane.add(bt28,2,45);
      gridPane.add(bt29,2,50);
      gridPane.add(bt30,2,55);

      gridPane.setHalignment(bt21,HPos.RIGHT);
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

      bt31 = new Button(" D1 ");
      bt32 = new Button(" D2 ");
      bt33 = new Button(" D3 ");
      bt34 = new Button(" D4 ");
      bt35 = new Button(" D5 ");
      bt36 = new Button(" D6 ");
      bt37 = new Button(" D7 ");
      bt38 = new Button(" D8 ");
      bt39 = new Button(" D9 ");
      bt40 = new Button("D10");

      gridPane.add(bt31,3,10);
      gridPane.add(bt32,3,15);
      gridPane.add(bt33,3,20);
      gridPane.add(bt34,3,25);
      gridPane.add(bt35,3,30);
      gridPane.add(bt36,3,35);
      gridPane.add(bt37,3,40);
      gridPane.add(bt38,3,45);
      gridPane.add(bt39,3,50);
      gridPane.add(bt40,3,55);

      gridPane.setHalignment(bt31,HPos.RIGHT);
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
      bt41 = new Button(" E1 ");
      bt42 = new Button(" E2 ");
      bt43 = new Button(" E3 ");
      bt44 = new Button(" E4 ");
      bt45 = new Button(" E5 ");
      bt46 = new Button(" E6 ");
      bt47 = new Button(" E7 ");
      bt48 = new Button(" E8 ");
      bt49 = new Button(" E9 ");
      bt50 = new Button("E10");

      gridPane.add(bt41,4,10);
      gridPane.add(bt42,4,15);
      gridPane.add(bt43,4,20);
      gridPane.add(bt44,4,25);
      gridPane.add(bt45,4,30);
      gridPane.add(bt46,4,35);
      gridPane.add(bt47,4,40);
      gridPane.add(bt48,4,45);
      gridPane.add(bt49,4,50);
      gridPane.add(bt50,4,55);

      gridPane.setHalignment(bt41,HPos.RIGHT);
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
      bt51 = new Button(" F1 ");
      bt52 = new Button(" F2 ");
      bt53 = new Button(" F3 ");
      bt54 = new Button(" F4 ");
      bt55 = new Button(" F5 ");
      bt56 = new Button(" F6 ");
      bt57 = new Button(" F7 ");
      bt58 = new Button(" F8 ");
      bt59 = new Button(" F9 ");
      bt60 = new Button("F10");

      gridPane.add(bt51,7,10);
      gridPane.add(bt52,7,15);
      gridPane.add(bt53,7,20);
      gridPane.add(bt54,7,25);
      gridPane.add(bt55,7,30);
      gridPane.add(bt56,7,35);
      gridPane.add(bt57,7,40);
      gridPane.add(bt58,7,45);
      gridPane.add(bt59,7,50);
      gridPane.add(bt60,7,55);

      gridPane.setHalignment(bt51,HPos.RIGHT);
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
      bt61 = new Button(" G1 ");
      bt62 = new Button(" G2 ");
      bt63 = new Button(" G3 ");
      bt64 = new Button(" G4 ");
      bt65 = new Button(" G5 ");
      bt66 = new Button(" G6 ");
      bt67 = new Button(" G7 ");
      bt68 = new Button(" G8 ");
      bt69 = new Button(" G9 ");
      bt70 = new Button("G10");

      gridPane.add(bt61,8,10);
      gridPane.add(bt62,8,15);
      gridPane.add(bt63,8,20);
      gridPane.add(bt64,8,25);
      gridPane.add(bt65,8,30);
      gridPane.add(bt66,8,35);
      gridPane.add(bt67,8,40);
      gridPane.add(bt68,8,45);
      gridPane.add(bt69,8,50);
      gridPane.add(bt70,8,55);

      gridPane.setHalignment(bt61,HPos.RIGHT);
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
      bt71 = new Button(" H1 ");
      bt72 = new Button(" H2 ");
      bt73 = new Button(" H3 ");
      bt74 = new Button(" H4 ");
      bt75 = new Button(" H5 ");
      bt76 = new Button(" H6 ");
      bt77 = new Button(" H7 ");
      bt78 = new Button(" H8 ");
      bt79 = new Button(" H9 ");
      bt80 = new Button("H10");

      gridPane.add(bt71,9,10);
      gridPane.add(bt72,9,15);
      gridPane.add(bt73,9,20);
      gridPane.add(bt74,9,25);
      gridPane.add(bt75,9,30);
      gridPane.add(bt76,9,35);
      gridPane.add(bt77,9,40);
      gridPane.add(bt78,9,45);
      gridPane.add(bt79,9,50);
      gridPane.add(bt80,9,55);

      gridPane.setHalignment(bt71,HPos.RIGHT);
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
      bt81 = new Button(" I1 ");
      bt82 = new Button(" I2 ");
      bt83 = new Button(" I3 ");
      bt84 = new Button(" I4 ");
      bt85 = new Button(" I5 ");
      bt86 = new Button(" I6 ");
      bt87 = new Button(" I7 ");
      bt88 = new Button(" I8 ");
      bt89 = new Button(" I9 ");
      bt90 = new Button("I10");

      gridPane.add(bt81,10,10);
      gridPane.add(bt82,10,15);
      gridPane.add(bt83,10,20);
      gridPane.add(bt84,10,25);
      gridPane.add(bt85,10,30);
      gridPane.add(bt86,10,35);
      gridPane.add(bt87,10,40);
      gridPane.add(bt88,10,45);
      gridPane.add(bt89,10,50);
      gridPane.add(bt90,10,55);

      gridPane.setHalignment(bt81,HPos.RIGHT);
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
      bt91 = new Button(" J1 ");
      bt92 = new Button(" J2 ");
      bt93 = new Button(" J3 ");
      bt94 = new Button(" J4 ");
      bt95 = new Button(" J5 ");
      bt96 = new Button(" J6 ");
      bt97 = new Button(" J7 ");
      bt98 = new Button(" J8 ");
      bt99 = new Button(" J9 ");
      bt100 = new Button("J10");

      gridPane.add(bt91,11,10);
      gridPane.add(bt92,11,15);
      gridPane.add(bt93,11,20);
      gridPane.add(bt94,11,25);
      gridPane.add(bt95,11,30);
      gridPane.add(bt96,11,35);
      gridPane.add(bt97,11,40);
      gridPane.add(bt98,11,45);
      gridPane.add(bt99,11,50);
      gridPane.add(bt100,11,55);

      gridPane.setHalignment(bt91,HPos.RIGHT);
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
          String title = movieInfo.get(0);
          String certificate = movieInfo.get(1);
          String time = movieInfo.get(2);
          String screen = movieInfo.get(3);

          Controller4 controller4 = new Controller4();
          controller4.movieInfo.add(title);
          controller4.movieInfo.add(certificate);
          controller4.movieInfo.add(time);
          controller4.movieInfo.add(screen);
          controller4.seatNum.addAll(seatNum);

          controller4.lblInfo.setText(title + " (" + certificate + ")\n" + time +
                                    ", Theatre No. " + screen);
          controller4.lblSeats.setText("Seats selected: " +
                                        Arrays.toString(seatNum.toArray())
                                        .replace("[", "")
                                        .replace("]", ""));
          controller4.lblTotalSeats.setText("Total No. Seats: " + seatNum.size());
          btPayment.getScene().setRoot(controller4.getContent());
      });

      root = new VBox (gridPane, hBox);
      root.setAlignment(Pos.CENTER);
      //---------------------END OF SCREEN----------------------------------------

      //---------------------------ACTION CATCHERS--------------------------------


    bt1.setOnAction(this::handle);   bt2.setOnAction(this::handle);
    bt3.setOnAction(this::handle);   bt4.setOnAction(this::handle);
    bt5.setOnAction(this::handle);   bt6.setOnAction(this::handle);
    bt7.setOnAction(this::handle);   bt8.setOnAction(this::handle);
    bt9.setOnAction(this::handle);   bt10.setOnAction(this::handle);
    bt11.setOnAction(this::handle);  bt12.setOnAction(this::handle);
    bt13.setOnAction(this::handle);  bt14.setOnAction(this::handle);
    bt15.setOnAction(this::handle);  bt16.setOnAction(this::handle);
    bt17.setOnAction(this::handle);  bt18.setOnAction(this::handle);
    bt19.setOnAction(this::handle);  bt20.setOnAction(this::handle);
    bt21.setOnAction(this::handle);  bt22.setOnAction(this::handle);
    bt23.setOnAction(this::handle);  bt24.setOnAction(this::handle);
    bt25.setOnAction(this::handle);  bt26.setOnAction(this::handle);
    bt27.setOnAction(this::handle);  bt28.setOnAction(this::handle);
    bt29.setOnAction(this::handle);  bt30.setOnAction(this::handle);
    bt31.setOnAction(this::handle);  bt32.setOnAction(this::handle);
    bt33.setOnAction(this::handle);  bt34.setOnAction(this::handle);
    bt35.setOnAction(this::handle);  bt36.setOnAction(this::handle);
    bt37.setOnAction(this::handle);  bt38.setOnAction(this::handle);
    bt39.setOnAction(this::handle);  bt40.setOnAction(this::handle);
    bt41.setOnAction(this::handle);  bt42.setOnAction(this::handle);
    bt43.setOnAction(this::handle);  bt44.setOnAction(this::handle);
    bt45.setOnAction(this::handle);  bt46.setOnAction(this::handle);
    bt47.setOnAction(this::handle);  bt48.setOnAction(this::handle);
    bt49.setOnAction(this::handle);  bt50.setOnAction(this::handle);
    bt51.setOnAction(this::handle);  bt52.setOnAction(this::handle);
    bt53.setOnAction(this::handle);  bt54.setOnAction(this::handle);
    bt55.setOnAction(this::handle);  bt56.setOnAction(this::handle);
    bt57.setOnAction(this::handle);  bt58.setOnAction(this::handle);
    bt59.setOnAction(this::handle);  bt60.setOnAction(this::handle);
    bt61.setOnAction(this::handle);  bt62.setOnAction(this::handle);
    bt63.setOnAction(this::handle);  bt64.setOnAction(this::handle);
    bt65.setOnAction(this::handle);  bt66.setOnAction(this::handle);
    bt67.setOnAction(this::handle);  bt68.setOnAction(this::handle);
    bt69.setOnAction(this::handle);  bt70.setOnAction(this::handle);
    bt71.setOnAction(this::handle);  bt72.setOnAction(this::handle);
    bt73.setOnAction(this::handle);  bt74.setOnAction(this::handle);
    bt75.setOnAction(this::handle);  bt76.setOnAction(this::handle);
    bt77.setOnAction(this::handle);  bt78.setOnAction(this::handle);
    bt79.setOnAction(this::handle);  bt80.setOnAction(this::handle);
    bt81.setOnAction(this::handle);  bt82.setOnAction(this::handle);
    bt83.setOnAction(this::handle);  bt84.setOnAction(this::handle);
    bt85.setOnAction(this::handle);  bt86.setOnAction(this::handle);
    bt87.setOnAction(this::handle);  bt88.setOnAction(this::handle);
    bt89.setOnAction(this::handle);  bt90.setOnAction(this::handle);
    bt91.setOnAction(this::handle);  bt92.setOnAction(this::handle);
    bt93.setOnAction(this::handle);  bt94.setOnAction(this::handle);
    bt95.setOnAction(this::handle);  bt96.setOnAction(this::handle);
    bt97.setOnAction(this::handle);  bt98.setOnAction(this::handle);
    bt99.setOnAction(this::handle);  bt100.setOnAction(this::handle);

    //------------------------END OF ACTION CATCHERS
    //scene.getStylesheets().add("style.css");


  }//---------------------END OF START------------------
  /*---------------------------BUTTON HANDLER-----------------------------------*/
  public void handle(ActionEvent event){
    if(event.getSource()==bt1 & condition1==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat A1 selected");
      condition1=false;
      seatNum.add("A1");
    }else if(event.getSource()==bt1 & condition1==false){
      System.out.println("Seat A1 deselected");
      condition1=true;
      seatNum.remove("A1");
    }

    if(event.getSource()==bt2 & condition2==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 selected");
      condition2=false;
      seatNum.add("A2");
    }else if(event.getSource()==bt2 & condition2==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 deselected");
      condition2=true;
      seatNum.remove("A2");
    }
    if(event.getSource()==bt3 & condition3==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat A3 selected");
      condition3=false;
      seatNum.add("A3");
    }else if(event.getSource()==bt3 & condition3==false){
      System.out.println("Seat A3 deselected");
      condition3=true;
      seatNum.remove("A3");
    }

    if (event.getSource()==bt4 & condition4==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A4 selected");
      condition4=false;
      seatNum.add("A4");
    }else if(event.getSource()==bt4 & condition4==false){
      System.out.println("Seat A4 deselected");
      condition4=true;
      seatNum.remove("A4");
    }

    if(event.getSource()==bt5 & condition5==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 selected");
      condition5=false;
      seatNum.add("A5");
    }else if(event.getSource()==bt5 & condition5==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 deselected");
      condition5=true;
      seatNum.remove("A5");
    }

    if(event.getSource()==bt6 & condition6==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 selected");
      condition6=false;
      seatNum.add("A6");
    }else if(event.getSource()==bt6 & condition6==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 deselected");
      condition6=true;
      seatNum.remove("A6");
    }

    if(event.getSource()==bt7 & condition7==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 selected");
      condition7=false;
      seatNum.add("A7");
    }else if(event.getSource()==bt7 & condition7==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 deselected");
      condition7=true;
      seatNum.remove("A7");
    }

    if(event.getSource()==bt8 & condition8==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 selected");
      condition8=false;
      seatNum.add("A8");
    }else if(event.getSource()==bt8 & condition8==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 deselected");
      condition8=true;
      seatNum.remove("A8");
    }

    if(event.getSource()==bt9 & condition9==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 selected");
      condition9=false;
      seatNum.add("A9");
    }else if(event.getSource()==bt9 & condition9==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 deselected");
      condition9=true;
      seatNum.remove("A9");
    }

    if(event.getSource()==bt10 & condition10==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 selected");
      condition10=false;
      seatNum.add("A10");
    }else if(event.getSource()==bt10 & condition10==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 deselected");
      condition10=true;
      seatNum.remove("A10");
    }

    if(event.getSource()==bt11 & condition11==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat B1 selected");
      condition11=false;
      seatNum.add("B1");
    }else if(event.getSource()==bt11 & condition11==false){
      System.out.println("Seat B1 deselected");
      condition11=true;
      seatNum.remove("B1");
    }

    if(event.getSource()==bt12 & condition12==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B2 selected");
      condition12=false;
      seatNum.add("B2");
    }else if(event.getSource()==bt12 & condition12==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B2 deselected");
      condition12=true;
      seatNum.remove("B2");
    }
    if(event.getSource()==bt13 & condition13==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat B3 selected");
      condition13=false;
      seatNum.add("B3");
    }else if(event.getSource()==bt13 & condition13==false){
      System.out.println("Seat B3 deselected");
      condition13=true;
      seatNum.remove("B3");
    }

    if (event.getSource()==bt14 & condition14==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B4 selected");
      condition14=false;
      seatNum.add("B4");
    }else if(event.getSource()==bt14 & condition14==false){
      System.out.println("Seat B4 deselected");
      condition14=true;
      seatNum.remove("B4");
    }

    if(event.getSource()==bt15 & condition15==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B5 selected");
      condition15=false;
      seatNum.add("B5");
    }else if(event.getSource()==bt15 & condition15==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B5 deselected");
      condition15=true;
      seatNum.remove("B5");
    }

    if(event.getSource()==bt16 & condition16==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B6 selected");
      condition16=false;
      seatNum.add("B6");
    }else if(event.getSource()==bt16 & condition16==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B6 deselected");
      condition16=true;
      seatNum.remove("B6");
    }

    if(event.getSource()==bt17 & condition17==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B7 selected");
      condition17=false;
      seatNum.add("B7");
    }else if(event.getSource()==bt17 & condition17==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B7 deselected");
      condition17=true;
      seatNum.remove("B7");
    }

    if(event.getSource()==bt18 & condition18==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B8 selected");
      condition18=false;
      seatNum.add("B8");
    }else if(event.getSource()==bt18 & condition18==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B8 deselected");
      condition18=true;
      seatNum.remove("B8");
    }

    if(event.getSource()==bt19 & condition19==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B9 selected");
      condition19=false;
      seatNum.add("B9");
    }else if(event.getSource()==bt19 & condition19==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B9 deselected");
      condition19=true;
      seatNum.remove("B9");
    }

    if(event.getSource()==bt20 & condition20==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat B10 selected");
      condition20=false;
      seatNum.add("B10");
    }else if(event.getSource()==bt20 & condition20==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat B10 deselected");
      condition20=true;
      seatNum.remove("B10");
    }

    if(event.getSource()==bt21 & condition21==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat C1 selected");
      condition21=false;
      seatNum.add("C1");
    }else if(event.getSource()==bt21 & condition21==false){
      System.out.println("Seat C1 deselected");
      condition21=true;
      seatNum.remove("C1");
    }

    if(event.getSource()==bt22 & condition22==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C2 selected");
      condition22=false;
      seatNum.add("C2");
    }else if(event.getSource()==bt22 & condition22==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C2 deselected");
      condition22=true;
      seatNum.remove("C2");
    }
    if(event.getSource()==bt23 & condition23==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat C3 selected");
      condition23=false;
      seatNum.add("C3");
    }else if(event.getSource()==bt23 & condition23==false){
      System.out.println("Seat C3 deselected");
      condition23=true;
      seatNum.remove("C3");
    }

    if (event.getSource()==bt24 & condition24==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C4 selected");
      condition24=false;
      seatNum.add("C4");
    }else if(event.getSource()==bt24 & condition24==false){
      System.out.println("Seat C4 deselected");
      condition24=true;
      seatNum.remove("C4");
    }

    if(event.getSource()==bt25 & condition25==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C5 selected");
      condition25=false;
      seatNum.add("C5");
    }else if(event.getSource()==bt25 & condition25==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C5 deselected");
      condition25=true;
      seatNum.remove("C5");
    }

    if(event.getSource()==bt26 & condition26==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C6 selected");
      condition26=false;
      seatNum.add("C6");
    }else if(event.getSource()==bt26 & condition26==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C6 deselected");
      condition26=true;
      seatNum.remove("C6");
    }

    if(event.getSource()==bt27 & condition27==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C7 selected");
      condition27=false;
      seatNum.add("C7");
    }else if(event.getSource()==bt27 & condition27==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C7 deselected");
      condition27=true;
      seatNum.remove("C7");
    }

    if(event.getSource()==bt28 & condition28==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C8 selected");
      condition28=false;
      seatNum.add("C8");
    }else if(event.getSource()==bt28 & condition28==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C8 deselected");
      condition28=true;
      seatNum.remove("C8");
    }

    if(event.getSource()==bt29 & condition29==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C9 selected");
      condition29=false;
      seatNum.add("C9");
    }else if(event.getSource()==bt29 & condition29==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C9 deselected");
      condition29=true;
      seatNum.remove("C9");
    }

    if(event.getSource()==bt30 & condition30==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat C10 selected");
      condition30=false;
      seatNum.add("C10");
    }else if(event.getSource()==bt30 & condition30==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat C10 deselected");
      condition30=true;
      seatNum.remove("C10");
    }

    if(event.getSource()==bt31 & condition31==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat D1 selected");
      condition31=false;
      seatNum.add("D1");
    }else if(event.getSource()==bt31 & condition31==false){
      System.out.println("Seat D1 deselected");
      condition31=true;
      seatNum.remove("D1");
    }

    if(event.getSource()==bt32 & condition32==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D2 selected");
      condition32=false;
      seatNum.add("D2");
    }else if(event.getSource()==bt32 & condition32==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D2 deselected");
      condition32=true;
      seatNum.remove("D2");
    }
    if(event.getSource()==bt33 & condition33==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat D3 selected");
      condition33=false;
      seatNum.add("D3");
    }else if(event.getSource()==bt33 & condition33==false){
      System.out.println("Seat D3 deselected");
      condition33=true;
      seatNum.remove("D3");
    }

    if (event.getSource()==bt34 & condition34==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D4 selected");
      condition34=false;
      seatNum.add("D4");
    }else if(event.getSource()==bt34 & condition34==false){
      System.out.println("Seat D4 deselected");
      condition34=true;
      seatNum.remove("D4");
    }

    if(event.getSource()==bt35 & condition35==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D5 selected");
      condition35=false;
      seatNum.add("D5");
    }else if(event.getSource()==bt35 & condition35==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D5 deselected");
      condition35=true;
      seatNum.remove("D5");
    }

    if(event.getSource()==bt36 & condition36==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D6 selected");
      condition36=false;
      seatNum.add("D6");
    }else if(event.getSource()==bt36 & condition36==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D6 deselected");
      condition36=true;
      seatNum.remove("D6");
    }

    if(event.getSource()==bt37 & condition37==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D7 selected");
      condition37=false;
      seatNum.add("D7");
    }else if(event.getSource()==bt37 & condition37==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D7 deselected");
      condition37=true;
      seatNum.remove("D7");

    }

    if(event.getSource()==bt38 & condition38==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D8 selected");
      condition38=false;
      seatNum.add("D8");
    }else if(event.getSource()==bt38 & condition38==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D8 deselected");
      condition38=true;
      seatNum.remove("D8");    }

    if(event.getSource()==bt39 & condition39==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D9 selected");
      condition39=false;
      seatNum.add("D9");
    }else if(event.getSource()==bt39 & condition39==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D9 deselected");
      condition39=true;
      seatNum.remove("D9");
    }

    if(event.getSource()==bt40 & condition40==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat D10 selected");
      condition40=false;
      seatNum.add("D10");
    }else if(event.getSource()==bt40 & condition40==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat D10 deselected");
      condition40=true;
      seatNum.remove("D10");
    }

    if(event.getSource()==bt41 & condition41==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat E1 selected");
      condition41=false;
      seatNum.add("E1");
    }else if(event.getSource()==bt41 & condition41==false){
      System.out.println("Seat E1 deselected");
      condition41=true;
      seatNum.remove("E1");
    }

    if(event.getSource()==bt42 & condition42==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E2 selected");
      condition42=false;
      seatNum.add("E2");
    }else if(event.getSource()==bt42 & condition42==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E2 deselected");
      condition42=true;
      seatNum.remove("E2");
    }
    if(event.getSource()==bt43 & condition43==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat E3 selected");
      condition43=false;
      seatNum.add("E3");
    }else if(event.getSource()==bt43 & condition43==false){
      System.out.println("Seat E3 deselected");
      condition43=true;      seatNum.remove("D10");
      seatNum.remove("E3");
    }

    if (event.getSource()==bt44 & condition44==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E4 selected");
      condition44=false;
      seatNum.add("E4");
    }else if(event.getSource()==bt44 & condition44==false){
      System.out.println("Seat E4 deselected");
      condition44=true;
      seatNum.remove("E4");
    }

    if(event.getSource()==bt45 & condition45==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E5 selected");
      condition45=false;
      seatNum.add("E5");
    }else if(event.getSource()==bt45 & condition45==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E5 deselected");
      condition45=true;
      seatNum.remove("E5");
    }

    if(event.getSource()==bt46 & condition46==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E6 selected");
      condition46=false;
      seatNum.add("E6");
    }else if(event.getSource()==bt46 & condition46==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E6 deselected");
      condition46=true;
      seatNum.remove("E6");

    }

    if(event.getSource()==bt47 & condition47==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E7 selected");
      condition47=false;
      seatNum.add("E7");
    }else if(event.getSource()==bt47 & condition47==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E7 deselected");
      condition47=true;
      seatNum.remove("E7");
    }

    if(event.getSource()==bt48 & condition48==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E8 selected");
      condition48=false;
      seatNum.add("E8");
    }else if(event.getSource()==bt48 & condition48==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E8 deselected");
      condition48=true;
      seatNum.remove("E8");
    }

    if(event.getSource()==bt49 & condition49==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E9 selected");
      condition49=false;
      seatNum.add("E9");
    }else if(event.getSource()==bt49 & condition49==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E9 deselected");
      condition49=true;
      seatNum.remove("E9");

    }

    if(event.getSource()==bt50 & condition50==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat E10 selected");
      condition50=false;
      seatNum.add("E10");

    }else if(event.getSource()==bt50 & condition50==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat E10 deselected");
      condition50=true;
      seatNum.remove("E10");
    }

    if(event.getSource()==bt51 & condition51==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat F1 selected");
      condition51=false;
      seatNum.add("F1");
    }else if(event.getSource()==bt51 & condition51==false){
      System.out.println("Seat F1 deselected");
      condition51=true;
      seatNum.remove("F1");
    }

    if(event.getSource()==bt52 & condition52==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F2 selected");
      condition52=false;
      seatNum.add("F2");
    }else if(event.getSource()==bt52 & condition52==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F2 deselected");
      condition52=true;
      seatNum.remove("F2");
    }

    if(event.getSource()==bt53 & condition53==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat F3 selected");
      condition53=false;
      seatNum.add("F3");
    }else if(event.getSource()==bt53 & condition53==false){
      System.out.println("Seat F3 deselected");
      condition53=true;
      seatNum.remove("F3");
    }

    if (event.getSource()==bt54 & condition54==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F4 selected");
      condition54=false;
      seatNum.add("F4");
    }else if(event.getSource()==bt54 & condition54==false){
      System.out.println("Seat F4 deselected");
      condition54=true;
      seatNum.remove("F4");
    }

    if(event.getSource()==bt55 & condition55==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F5 selected");
      condition55=false;
      seatNum.add("F5");
    }else if(event.getSource()==bt55 & condition55==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F5 deselected");
      condition55=true;
      seatNum.remove("F5");
    }

    if(event.getSource()==bt56 & condition56==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F6 selected");
      condition56=false;
      seatNum.add("F6");
    }else if(event.getSource()==bt56 & condition56==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F6 deselected");
      condition56=true;
      seatNum.remove("F6");
    }

    if(event.getSource()==bt57 & condition57==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F7 selected");
      condition57=false;
      seatNum.add("F7");
    }else if(event.getSource()==bt57 & condition57==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F7 deselected");
      condition57=true;
      seatNum.remove("F7");
    }

    if(event.getSource()==bt58 & condition58==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F8 selected");
      condition58=false;
      seatNum.add("F8");
    }else if(event.getSource()==bt58 & condition58==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F8 deselected");
      condition58=true;
      seatNum.remove("F8");
    }

    if(event.getSource()==bt59 & condition59==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F9 selected");
      condition59=false;
      seatNum.add("F9");
    }else if(event.getSource()==bt59 & condition59==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F9 deselected");
      condition59=true;
      seatNum.remove("F9");
    }

    if(event.getSource()==bt60 & condition60==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat F10 selected");
      condition60=false;
      seatNum.add("F10");
    }else if(event.getSource()==bt60 & condition60==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat F10 deselected");
      condition60=true;
      seatNum.remove("F10");
    }

    if(event.getSource()==bt61 & condition61==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat G1 selected");
      condition61=false;
      seatNum.add("G1");
    }else if(event.getSource()==bt61 & condition61==false){
      System.out.println("Seat G1 deselected");
      condition61=true;
      seatNum.remove("G1");
    }

    if(event.getSource()==bt62 & condition62==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G2 selected");
      condition62=false;
      seatNum.add("G2");
    }else if(event.getSource()==bt62 & condition62==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G2 deselected");
      condition62=true;
      seatNum.remove("G2");
    }

    if(event.getSource()==bt63 & condition63==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat G3 selected");
      condition63=false;
      seatNum.add("G3");
    }else if(event.getSource()==bt63 & condition63==false){
      System.out.println("Seat G3 deselected");
      condition63=true;
      seatNum.remove("G3");
    }

    if (event.getSource()==bt64 & condition64==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G4 selected");
      condition64=false;
      seatNum.add("G4");
    }else if(event.getSource()==bt64 & condition64==false){
      System.out.println("Seat G4 deselected");
      condition64=true;
      seatNum.remove("G4");
    }

    if(event.getSource()==bt65 & condition65==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G5 selected");
      condition65=false;
      seatNum.add("G5");
    }else if(event.getSource()==bt65 & condition65==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G5 deselected");
      condition65=true;
      seatNum.remove("G5");
    }

    if(event.getSource()==bt66 & condition66==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G6 selected");
      condition66=false;
      seatNum.add("G6");
    }else if(event.getSource()==bt66 & condition66==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G6 deselected");
      condition66=true;
      seatNum.remove("G6");
    }

    if(event.getSource()==bt67 & condition67==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G7 selected");
      condition67=false;
      seatNum.add("G7");
    }else if(event.getSource()==bt67 & condition67==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G7 deselected");
      condition67=true;
      seatNum.remove("G7");
    }

    if(event.getSource()==bt68 & condition68==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G8 selected");
      condition68=false;
      seatNum.add("G8");
    }else if(event.getSource()==bt68 & condition68==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G8 deselected");
      condition68=true;
      seatNum.remove("G8");
    }

    if(event.getSource()==bt69 & condition69==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G9 selected");
      condition69=false;
      seatNum.add("G9");
    }else if(event.getSource()==bt69 & condition69==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G9 deselected");
      condition69=true;
      seatNum.remove("G9");
    }

    if(event.getSource()==bt70 & condition70==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat G10 selected");
      condition70=false;
      seatNum.add("G10");
    }else if(event.getSource()==bt70 & condition70==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat G10 deselected");
      condition70=true;
      seatNum.remove("G10");
    }

    if(event.getSource()==bt71 & condition71==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat H1 selected");
      condition71=false;
      seatNum.add("H1");
    }else if(event.getSource()==bt71 & condition71==false){
      System.out.println("Seat H1 deselected");
      condition71=true;
      seatNum.remove("H1");
    }

    if(event.getSource()==bt72 & condition72==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H2 selected");
      condition72=false;
      seatNum.add("H2");
    }else if(event.getSource()==bt72 & condition72==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H2 deselected");
      condition72=true;
      seatNum.remove("H2");
    }
    if(event.getSource()==bt73 & condition73==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat H3 selected");
      condition73=false;
      seatNum.add("H3");
    }else if(event.getSource()==bt73 & condition73==false){
      System.out.println("Seat H3 deselected");
      condition73=true;
      seatNum.remove("H3");
    }

    if (event.getSource()==bt74 & condition74==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H4 selected");
      condition74=false;
      seatNum.add("H4");
    }else if(event.getSource()==bt74 & condition74==false){
      System.out.println("Seat H4 deselected");
      condition74=true;
      seatNum.remove("H4");
    }

    if(event.getSource()==bt75 & condition75==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H5 selected");
      condition75=false;
      seatNum.add("H5");
    }else if(event.getSource()==bt75 & condition75==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H5 deselected");
      condition75=true;
      seatNum.remove("H5");
    }

    if(event.getSource()==bt76 & condition76==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H6 selected");
      condition76=false;
      seatNum.add("H6");
    }else if(event.getSource()==bt76 & condition76==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H6 deselected");
      condition76=true;
      seatNum.remove("H6");
    }

    if(event.getSource()==bt77 & condition77==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H7 selected");
      condition77=false;
      seatNum.add("H7");
    }else if(event.getSource()==bt77 & condition77==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H7 deselected");
      condition77=true;
      seatNum.remove("H7");
    }

    if(event.getSource()==bt78 & condition78==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H8 selected");
      condition78=false;
      seatNum.add("H8");
    }else if(event.getSource()==bt78 & condition78==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H8 deselected");
      condition78=true;
      seatNum.remove("H8");
    }

    if(event.getSource()==bt79 & condition79==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H9 selected");
      condition79=false;
      seatNum.add("H9");
    }else if(event.getSource()==bt79 & condition79==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H9 deselected");
      condition79=true;
      seatNum.remove("H9");
    }

    if(event.getSource()==bt80 & condition80==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat H10 selected");
      condition80=false;
      seatNum.add("H10");
    }else if(event.getSource()==bt80 & condition80==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat H10 deselected");
      condition80=true;
      seatNum.remove("H10");
    }

    if(event.getSource()==bt81 & condition81==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat I1 selected");
      condition81=false;
      seatNum.add("I1");
    }else if(event.getSource()==bt81 & condition81==false){
      System.out.println("Seat I1 deselected");
      condition81=true;
      seatNum.remove("I1");
    }

    if(event.getSource()==bt82 & condition82==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I2 selected");
      condition82=false;
      seatNum.add("I2");
    }else if(event.getSource()==bt82 & condition82==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I2 deselected");
      condition82=true;
      seatNum.remove("I2");
    }
    if(event.getSource()==bt83 & condition83==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat I3 selected");
      condition83=false;
      seatNum.add("I3");
    }else if(event.getSource()==bt83 & condition83==false){
      System.out.println("Seat I3 deselected");
      condition83=true;
      seatNum.remove("I3");
    }

    if (event.getSource()==bt84 & condition84==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I4 selected");
      condition84=false;
      seatNum.add("I4");
    }else if(event.getSource()==bt84 & condition84==false){
      System.out.println("Seat I4 deselected");
      condition84=true;
      seatNum.remove("I4");
    }

    if(event.getSource()==bt85 & condition85==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I5 selected");
      condition85=false;
      seatNum.add("I5");
    }else if(event.getSource()==bt85 & condition85==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I5 deselected");
      condition85=true;
      seatNum.remove("I5");
    }

    if(event.getSource()==bt86 & condition86==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I6 selected");
      condition86=false;
      seatNum.add("I6");
    }else if(event.getSource()==bt86 & condition86==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I6 deselected");
      condition86=true;
      seatNum.remove("I6");
    }

    if(event.getSource()==bt87 & condition87==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I7 selected");
      condition87=false;
      seatNum.add("I7");
    }else if(event.getSource()==bt87 & condition87==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I7 deselected");
      condition87=true;
      seatNum.remove("I7");
    }

    if(event.getSource()==bt88 & condition88==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I8 selected");
      condition88=false;
      seatNum.add("I8");
    }else if(event.getSource()==bt88 & condition88==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I8 deselected");
      condition88=true;
      seatNum.remove("I8");
    }

    if(event.getSource()==bt89 & condition89==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I9 selected");
      condition89=false;
      seatNum.add("I9");
    }else if(event.getSource()==bt89 & condition89==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I9 deselected");
      condition89=true;
      seatNum.remove("I9");
    }

    if(event.getSource()==bt90 & condition90==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat I10 selected");
      condition90=false;
      seatNum.add("I10");
    }else if(event.getSource()==bt90 & condition90==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat I10 deselected");
      condition90=true;
      seatNum.remove("I10");
    }

    if(event.getSource()==bt91 & condition91==true ){//IF Any SEAT IS SELECTED
      System.out.println("Seat J1 selected");
      condition91=false;
      seatNum.add("J1");
    }else if(event.getSource()==bt91 & condition91==false){
      System.out.println("Seat J1 deselected");
      condition91=true;
      seatNum.remove("J1");
    }

    if(event.getSource()==bt92 & condition92==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J2 selected");
      condition92=false;
      seatNum.add("J2");
    }else if(event.getSource()==bt92 & condition92==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J2 deselected");
      condition92=true;
      seatNum.remove("J2");
    }
    if(event.getSource()==bt93 & condition93==true) {//IF Any SEAT IS SELECTED
      System.out.println("Seat J3 selected");
      condition93=false;
      seatNum.add("J3");
    }else if(event.getSource()==bt93 & condition93==false){
      System.out.println("Seat J3 deselected");
      condition93=true;
      seatNum.remove("J3");
    }

    if (event.getSource()==bt94 & condition94==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J4 selected");
      condition94=false;
      seatNum.add("J4");
    }else if(event.getSource()==bt94 & condition94==false){
      System.out.println("Seat J4 deselected");
      condition94=true;
      seatNum.remove("J4");
    }

    if(event.getSource()==bt95 & condition95==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J5 selected");
      condition95=false;
      seatNum.add("J5");
    }else if(event.getSource()==bt95 & condition95==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J5 deselected");
      condition95=true;
      seatNum.remove("J5");
    }

    if(event.getSource()==bt96 & condition96==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J6 selected");
      condition96=false;
      seatNum.add("J6");
    }else if(event.getSource()==bt96 & condition96==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J6 deselected");
      condition96=true;
      seatNum.remove("J6");
    }

    if(event.getSource()==bt97 & condition97==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J7 selected");
      condition97=false;
      seatNum.add("J7");
    }else if(event.getSource()==bt97 & condition97==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J7 deselected");
      condition97=true;
      seatNum.remove("J7");
    }

    if(event.getSource()==bt98 & condition98==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J8 selected");
      condition98=false;
      seatNum.add("J8");
    }else if(event.getSource()==bt98 & condition98==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J8 deselected");
      condition98=true;
      seatNum.remove("J8");
    }

    if(event.getSource()==bt99 & condition99==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J9 selected");
      condition99=false;
      seatNum.add("J9");
    }else if(event.getSource()==bt99 & condition99==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J9 deselected");
      condition99=true;
      seatNum.remove("J9");
    }

    if(event.getSource()==bt100 & condition100==true){//IF Any SEAT IS SELECTED
      System.out.println("Seat J10 selected");
      condition100=false;
      seatNum.add("J10");
    }else if(event.getSource()==bt100 & condition100==false){//IF Any SEAT IS SELECTED
      System.out.println("Seat J10 deselected");
      condition100=true;
      seatNum.remove("J10");
    }

  }/*-------------------------END OF BUTTON HANDLER-----------------------------*/



    @Override
    public Parent getContent() {
        return root;
    }
}
