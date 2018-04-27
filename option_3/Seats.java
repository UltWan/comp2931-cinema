import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

import javafx.geometry.Insets;
import javafx.geometry.HPos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;




public class Seats extends Application implements EventHandler<ActionEvent> {

  Stage window;
  Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10;
  Button button11,button12,button13,button14,button15,button16,button17,button18,button19,button20;
  Button button21,button22,button23,button24,button25,button26,button27,button28,button29,button30;
  Button button31,button32,button33,button34,button35,button36,button37,button38,button39,button40;
  Button button41,button42,button43,button44,button45,button46,button47,button48,button49,button50;
  Button button51,button52,button53,button54,button55,button56,button57,button58,button59,button60;
  Button button61,button62,button63,button64,button65,button66,button67,button68,button69,button70;
  Button button71,button72,button73,button74,button75,button76,button77,button78,button79,button80;
  Button button81,button82,button83,button84,button85,button86,button87,button88,button89,button90;
  Button button91,button92,button93,button94,button95,button96,button97,button98,button99,button100;
  Button button101,button102,button103,button104,button105,button106,button107,button108,button109,button110,button111;
  int[] arrAvailability=new int[110];

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    window = primaryStage;
    window.setTitle("Seat Selection");

    GridPane gridPane = new GridPane();
    gridPane.setAlignment(Pos.CENTER);
    gridPane.setHgap(5);
    gridPane.setVgap(5);
    gridPane.setPadding(new Insets(15, 15, 15, 15));

    button1 = new Button("A1");
    button2 = new Button("A2");
    button3 = new Button("A3");
    button4 = new Button("A4");
    button5 = new Button("A5");
    button6 = new Button("A6");
    button7 = new Button("A7");
    button8 = new Button("A8");
    button9 = new Button("A9");
    button10 = new Button("A10");

    gridPane.add(button1,0,10);
    gridPane.add(button2,0,15);
    gridPane.add(button3,0,20);
    gridPane.add(button4,0,25);
    gridPane.add(button5,0,30);
    gridPane.add(button6,0,35);
    gridPane.add(button7,0,40);
    gridPane.add(button8,0,45);
    gridPane.add(button9,0,50);
    gridPane.add(button10,0,55);

    gridPane.setHalignment(button1,HPos.RIGHT);
    gridPane.setHalignment(button2,HPos.RIGHT);
    gridPane.setHalignment(button3,HPos.RIGHT);
    gridPane.setHalignment(button4,HPos.RIGHT);
    gridPane.setHalignment(button5,HPos.RIGHT);
    gridPane.setHalignment(button6,HPos.RIGHT);
    gridPane.setHalignment(button7,HPos.RIGHT);
    gridPane.setHalignment(button8,HPos.RIGHT);
    gridPane.setHalignment(button9,HPos.RIGHT);
    gridPane.setHalignment(button10,HPos.RIGHT);

    //  button1.setAction(e->set.UserAgentStylesheet(STYLESHEET_CASPIAN));
    //---------------------------------1ST ROW END-------------------------------------------
    // gridPane.setHalignment(button1,HPos.RIGHT);
    // gridPane.setHalignment(button2,HPos.LEFT);

    button11 = new Button("B1");
    button12 = new Button("B2");
    button13 = new Button("B3");
    button14 = new Button("B4");
    button15 = new Button("B5");
    button16 = new Button("B6");
    button17 = new Button("B7");
    button18 = new Button("B8");
    button19 = new Button("B9");
    button20 = new Button("B10");

    gridPane.add(button11,1,10);
    gridPane.add(button12,1,15);
    gridPane.add(button13,1,20);
    gridPane.add(button14,1,25);
    gridPane.add(button15,1,30);
    gridPane.add(button16,1,35);
    gridPane.add(button17,1,40);
    gridPane.add(button18,1,45);
    gridPane.add(button19,1,50);
    gridPane.add(button20,1,55);

    gridPane.setHalignment(button11,HPos.RIGHT);
    gridPane.setHalignment(button12,HPos.RIGHT);
    gridPane.setHalignment(button13,HPos.RIGHT);
    gridPane.setHalignment(button14,HPos.RIGHT);
    gridPane.setHalignment(button15,HPos.RIGHT);
    gridPane.setHalignment(button16,HPos.RIGHT);
    gridPane.setHalignment(button17,HPos.RIGHT);
    gridPane.setHalignment(button18,HPos.RIGHT);
    gridPane.setHalignment(button19,HPos.RIGHT);
    gridPane.setHalignment(button20,HPos.RIGHT);

    //-----------------------------------------------------------------------------

    button21 = new Button("C1");
    button22 = new Button("C2");
    button23 = new Button("C3");
    button24 = new Button("C4");
    button25 = new Button("C5");
    button26 = new Button("C6");
    button27 = new Button("C7");
    button28 = new Button("C8");
    button29 = new Button("C9");
    button30 = new Button("C10");

    gridPane.add(button21,2,10);
    gridPane.add(button22,2,15);
    gridPane.add(button23,2,20);
    gridPane.add(button24,2,25);
    gridPane.add(button25,2,30);
    gridPane.add(button26,2,35);
    gridPane.add(button27,2,40);
    gridPane.add(button28,2,45);
    gridPane.add(button29,2,50);
    gridPane.add(button30,2,55);

    gridPane.setHalignment(button21,HPos.RIGHT);
    gridPane.setHalignment(button22,HPos.RIGHT);
    gridPane.setHalignment(button23,HPos.RIGHT);
    gridPane.setHalignment(button24,HPos.RIGHT);
    gridPane.setHalignment(button25,HPos.RIGHT);
    gridPane.setHalignment(button26,HPos.RIGHT);
    gridPane.setHalignment(button27,HPos.RIGHT);
    gridPane.setHalignment(button28,HPos.RIGHT);
    gridPane.setHalignment(button29,HPos.RIGHT);
    gridPane.setHalignment(button30,HPos.RIGHT);

    //------------------------------------------------------------------------

    button31 = new Button("D1");
    button32 = new Button("D2");
    button33 = new Button("D3");
    button34 = new Button("D4");
    button35 = new Button("D5");
    button36 = new Button("D6");
    button37 = new Button("D7");
    button38 = new Button("D8");
    button39 = new Button("D9");
    button40 = new Button("D10");

    gridPane.add(button31,3,10);
    gridPane.add(button32,3,15);
    gridPane.add(button33,3,20);
    gridPane.add(button34,3,25);
    gridPane.add(button35,3,30);
    gridPane.add(button36,3,35);
    gridPane.add(button37,3,40);
    gridPane.add(button38,3,45);
    gridPane.add(button39,3,50);
    gridPane.add(button40,3,55);

    gridPane.setHalignment(button31,HPos.RIGHT);
    gridPane.setHalignment(button32,HPos.RIGHT);
    gridPane.setHalignment(button33,HPos.RIGHT);
    gridPane.setHalignment(button34,HPos.RIGHT);
    gridPane.setHalignment(button35,HPos.RIGHT);
    gridPane.setHalignment(button36,HPos.RIGHT);
    gridPane.setHalignment(button37,HPos.RIGHT);
    gridPane.setHalignment(button38,HPos.RIGHT);
    gridPane.setHalignment(button39,HPos.RIGHT);
    gridPane.setHalignment(button40,HPos.RIGHT);
    //----------------------------------------------------------------------------
    button41 = new Button("E1");
    button42 = new Button("E2");
    button43 = new Button("E3");
    button44 = new Button("E4");
    button45 = new Button("E5");
    button46 = new Button("E6");
    button47 = new Button("E7");
    button48 = new Button("E8");
    button49 = new Button("E9");
    button50 = new Button("E10");

    gridPane.add(button41,4,10);
    gridPane.add(button42,4,15);
    gridPane.add(button43,4,20);
    gridPane.add(button44,4,25);
    gridPane.add(button45,4,30);
    gridPane.add(button46,4,35);
    gridPane.add(button47,4,40);
    gridPane.add(button48,4,45);
    gridPane.add(button49,4,50);
    gridPane.add(button50,4,55);

    gridPane.setHalignment(button41,HPos.RIGHT);
    gridPane.setHalignment(button42,HPos.RIGHT);
    gridPane.setHalignment(button43,HPos.RIGHT);
    gridPane.setHalignment(button44,HPos.RIGHT);
    gridPane.setHalignment(button45,HPos.RIGHT);
    gridPane.setHalignment(button46,HPos.RIGHT);
    gridPane.setHalignment(button47,HPos.RIGHT);
    gridPane.setHalignment(button48,HPos.RIGHT);
    gridPane.setHalignment(button49,HPos.RIGHT);
    gridPane.setHalignment(button50,HPos.RIGHT);
    //-------------------------------------------------------------------------
    button51 = new Button("F1");
    button52 = new Button("F2");
    button53 = new Button("F3");
    button54 = new Button("F4");
    button55 = new Button("F5");
    button56 = new Button("F6");
    button57 = new Button("F7");
    button58 = new Button("F8");
    button59 = new Button("F9");
    button60 = new Button("F10");

    gridPane.add(button51,5,10);
    gridPane.add(button52,5,15);
    gridPane.add(button53,5,20);
    gridPane.add(button54,5,25);
    gridPane.add(button55,5,30);
    gridPane.add(button56,5,35);
    gridPane.add(button57,5,40);
    gridPane.add(button58,5,45);
    gridPane.add(button59,5,50);
    gridPane.add(button60,5,55);

    gridPane.setHalignment(button51,HPos.RIGHT);
    gridPane.setHalignment(button52,HPos.RIGHT);
    gridPane.setHalignment(button53,HPos.RIGHT);
    gridPane.setHalignment(button54,HPos.RIGHT);
    gridPane.setHalignment(button55,HPos.RIGHT);
    gridPane.setHalignment(button56,HPos.RIGHT);
    gridPane.setHalignment(button57,HPos.RIGHT);
    gridPane.setHalignment(button58,HPos.RIGHT);
    gridPane.setHalignment(button59,HPos.RIGHT);
    gridPane.setHalignment(button60,HPos.RIGHT);
    //--------------------------------------------------------------------------
    button61 = new Button("G1");
    button62 = new Button("G2");
    button63 = new Button("G3");
    button64 = new Button("G4");
    button65 = new Button("G5");
    button66 = new Button("G6");
    button67 = new Button("G7");
    button68 = new Button("G8");
    button69 = new Button("G9");
    button70 = new Button("G10");

    gridPane.add(button61,6,10);
    gridPane.add(button62,6,15);
    gridPane.add(button63,6,20);
    gridPane.add(button64,6,25);
    gridPane.add(button65,6,30);
    gridPane.add(button66,6,35);
    gridPane.add(button67,6,40);
    gridPane.add(button68,6,45);
    gridPane.add(button69,6,50);
    gridPane.add(button70,6,55);

    gridPane.setHalignment(button61,HPos.RIGHT);
    gridPane.setHalignment(button62,HPos.RIGHT);
    gridPane.setHalignment(button63,HPos.RIGHT);
    gridPane.setHalignment(button64,HPos.RIGHT);
    gridPane.setHalignment(button65,HPos.RIGHT);
    gridPane.setHalignment(button66,HPos.RIGHT);
    gridPane.setHalignment(button67,HPos.RIGHT);
    gridPane.setHalignment(button68,HPos.RIGHT);
    gridPane.setHalignment(button69,HPos.RIGHT);
    gridPane.setHalignment(button70,HPos.RIGHT);

    //-------------------------------------------------------------------------
    button71 = new Button("H1");
    button72 = new Button("H2");
    button73 = new Button("H3");
    button74 = new Button("H4");
    button75 = new Button("H5");
    button76 = new Button("H6");
    button77 = new Button("H7");
    button78 = new Button("H8");
    button79 = new Button("H9");
    button80 = new Button("H10");

    gridPane.add(button71,7,10);
    gridPane.add(button72,7,15);
    gridPane.add(button73,7,20);
    gridPane.add(button74,7,25);
    gridPane.add(button75,7,30);
    gridPane.add(button76,7,35);
    gridPane.add(button77,7,40);
    gridPane.add(button78,7,45);
    gridPane.add(button79,7,50);
    gridPane.add(button80,7,55);

    gridPane.setHalignment(button71,HPos.RIGHT);
    gridPane.setHalignment(button72,HPos.RIGHT);
    gridPane.setHalignment(button73,HPos.RIGHT);
    gridPane.setHalignment(button74,HPos.RIGHT);
    gridPane.setHalignment(button75,HPos.RIGHT);
    gridPane.setHalignment(button76,HPos.RIGHT);
    gridPane.setHalignment(button77,HPos.RIGHT);
    gridPane.setHalignment(button78,HPos.RIGHT);
    gridPane.setHalignment(button79,HPos.RIGHT);
    gridPane.setHalignment(button80,HPos.RIGHT);
    //-------------------------------------------------------------------------
    button81 = new Button("I1");
    button82 = new Button("I2");
    button83 = new Button("I3");
    button84 = new Button("I4");
    button85 = new Button("I5");
    button86 = new Button("I6");
    button87 = new Button("I7");
    button88 = new Button("I8");
    button89 = new Button("I9");
    button90 = new Button("I10");

    gridPane.add(button81,8,10);
    gridPane.add(button82,8,15);
    gridPane.add(button83,8,20);
    gridPane.add(button84,8,25);
    gridPane.add(button85,8,30);
    gridPane.add(button86,8,35);
    gridPane.add(button87,8,40);
    gridPane.add(button88,8,45);
    gridPane.add(button89,8,50);
    gridPane.add(button90,8,55);

    gridPane.setHalignment(button81,HPos.RIGHT);
    gridPane.setHalignment(button82,HPos.RIGHT);
    gridPane.setHalignment(button83,HPos.RIGHT);
    gridPane.setHalignment(button84,HPos.RIGHT);
    gridPane.setHalignment(button85,HPos.RIGHT);
    gridPane.setHalignment(button86,HPos.RIGHT);
    gridPane.setHalignment(button87,HPos.RIGHT);
    gridPane.setHalignment(button88,HPos.RIGHT);
    gridPane.setHalignment(button89,HPos.RIGHT);
    gridPane.setHalignment(button90,HPos.RIGHT);
    //-------------------------------------------------------------------------
    button91 = new Button("J1");
    button92 = new Button("J2");
    button93 = new Button("J3");
    button94 = new Button("J4");
    button95 = new Button("J5");
    button96 = new Button("J6");
    button97 = new Button("J7");
    button98 = new Button("J8");
    button99 = new Button("J9");
    button100 = new Button("J10");

    gridPane.add(button91,9,10);
    gridPane.add(button92,9,15);
    gridPane.add(button93,9,20);
    gridPane.add(button94,9,25);
    gridPane.add(button95,9,30);
    gridPane.add(button96,9,35);
    gridPane.add(button97,9,40);
    gridPane.add(button98,9,45);
    gridPane.add(button99,9,50);
    gridPane.add(button100,9,55);

    gridPane.setHalignment(button91,HPos.RIGHT);
    gridPane.setHalignment(button92,HPos.RIGHT);
    gridPane.setHalignment(button93,HPos.RIGHT);
    gridPane.setHalignment(button94,HPos.RIGHT);
    gridPane.setHalignment(button95,HPos.RIGHT);
    gridPane.setHalignment(button96,HPos.RIGHT);
    gridPane.setHalignment(button97,HPos.RIGHT);
    gridPane.setHalignment(button98,HPos.RIGHT);
    gridPane.setHalignment(button99,HPos.RIGHT);
    gridPane.setHalignment(button100,HPos.RIGHT);

    //-------------------------SCREEN-------------------------------------------
    button111=new Button("S C R E E N ");
    gridPane.add(button111,4,0);
    gridPane.setHalignment(button111,HPos.CENTER);
    //---------------------END OF SCREEN----------------------------------------

    //---------------------------ACTION CATCHERS--------------------------------


  button1.setOnAction(this::handle);   button2.setOnAction(this::handle);
  button3.setOnAction(this::handle);   button4.setOnAction(this::handle);
  button5.setOnAction(this::handle);   button6.setOnAction(this::handle);
  button7.setOnAction(this::handle);   button8.setOnAction(this::handle);
  button9.setOnAction(this::handle);   button10.setOnAction(this::handle);
  button11.setOnAction(this::handle);  button12.setOnAction(this::handle);
  button13.setOnAction(this::handle);  button14.setOnAction(this::handle);
  button15.setOnAction(this::handle);  button16.setOnAction(this::handle);
  button17.setOnAction(this::handle);  button18.setOnAction(this::handle);
  button19.setOnAction(this::handle);  button20.setOnAction(this::handle);
  button21.setOnAction(this::handle);  button22.setOnAction(this::handle);
  button23.setOnAction(this::handle);  button24.setOnAction(this::handle);
  button25.setOnAction(this::handle);  button26.setOnAction(this::handle);
  button27.setOnAction(this::handle);  button28.setOnAction(this::handle);
  button29.setOnAction(this::handle);  button30.setOnAction(this::handle);
  button31.setOnAction(this::handle);  button32.setOnAction(this::handle);
  button33.setOnAction(this::handle);  button34.setOnAction(this::handle);
  button35.setOnAction(this::handle);  button36.setOnAction(this::handle);
  button37.setOnAction(this::handle);  button38.setOnAction(this::handle);
  button39.setOnAction(this::handle);  button40.setOnAction(this::handle);
  button41.setOnAction(this::handle);  button42.setOnAction(this::handle);
  button43.setOnAction(this::handle);  button44.setOnAction(this::handle);
  button45.setOnAction(this::handle);  button46.setOnAction(this::handle);
  button47.setOnAction(this::handle);  button48.setOnAction(this::handle);
  button49.setOnAction(this::handle);  button50.setOnAction(this::handle);
  button51.setOnAction(this::handle);  button52.setOnAction(this::handle);
  button53.setOnAction(this::handle);  button54.setOnAction(this::handle);
  button55.setOnAction(this::handle);  button56.setOnAction(this::handle);
  button57.setOnAction(this::handle);  button58.setOnAction(this::handle);
  button59.setOnAction(this::handle);  button60.setOnAction(this::handle);
  button61.setOnAction(this::handle);  button62.setOnAction(this::handle);
  button63.setOnAction(this::handle);  button64.setOnAction(this::handle);
  button65.setOnAction(this::handle);  button66.setOnAction(this::handle);
  button67.setOnAction(this::handle);  button68.setOnAction(this::handle);
  button69.setOnAction(this::handle);  button70.setOnAction(this::handle);
  button71.setOnAction(this::handle);  button72.setOnAction(this::handle);
  button73.setOnAction(this::handle);  button74.setOnAction(this::handle);
  button75.setOnAction(this::handle);  button76.setOnAction(this::handle);
  button77.setOnAction(this::handle);  button78.setOnAction(this::handle);
  button79.setOnAction(this::handle);  button80.setOnAction(this::handle);
  button81.setOnAction(this::handle);  button82.setOnAction(this::handle);
  button83.setOnAction(this::handle);  button84.setOnAction(this::handle);
  button85.setOnAction(this::handle);  button86.setOnAction(this::handle);
  button87.setOnAction(this::handle);  button88.setOnAction(this::handle);
  button89.setOnAction(this::handle);  button90.setOnAction(this::handle);
  button91.setOnAction(this::handle);  button92.setOnAction(this::handle);
  button93.setOnAction(this::handle);  button94.setOnAction(this::handle);
  button95.setOnAction(this::handle);  button96.setOnAction(this::handle);
  button97.setOnAction(this::handle);  button98.setOnAction(this::handle);
  button99.setOnAction(this::handle);  button100.setOnAction(this::handle);
  button11.setOnAction(this::handle);


  //------------------------END OF ACTION CATCHERS
  Scene scene = new Scene(gridPane, 750, 750);//size do window
  scene.getStylesheets().add("style.css");

  primaryStage.setScene(scene);

  window.setScene(scene);//create a scene
  window.show();//display window

}//---------------------END OF START------------------
/*---------------------------BUTTON HANDLER-----------------------------------*/
@Override
public void handle(ActionEvent event){
    if(event.getSource()==button1){//IF Any SEAT IS SELECTED
      System.out.println("Seat A1 Has been selected");
    }
    if(event.getSource()==button2){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 Has been selected");
    }if(event.getSource()==button3){//IF Any SEAT IS SELECTED
      System.out.println("Seat A3 Has been selected");
    }if(event.getSource()==button4){//IF Any SEAT IS SELECTED
      System.out.println("Seat A4 Has been selected");
    }if(event.getSource()==button5){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 Has been selected");
    }if(event.getSource()==button6){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 Has been selected");
    }if(event.getSource()==button7){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 Has been selected");
    }if(event.getSource()==button8){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 Has been selected");
    }if(event.getSource()==button9){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 Has been selected");
    }if(event.getSource()==button10){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 Has been selected");
    }

    if(event.getSource()==button11){//IF Any SEAT IS SELECTED
      System.out.println("Seat 11 Has been selected");
    }
    if(event.getSource()==button12){//IF Any SEAT IS SELECTED
      System.out.println("Seat 12 Has been selected");
    }if(event.getSource()==button3){//IF Any SEAT IS SELECTED
      System.out.println("Seat A3 Has been selected");
    }if(event.getSource()==button4){//IF Any SEAT IS SELECTED
      System.out.println("Seat A4 Has been selected");
    }if(event.getSource()==button5){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 Has been selected");
    }if(event.getSource()==button6){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 Has been selected");
    }if(event.getSource()==button7){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 Has been selected");
    }if(event.getSource()==button8){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 Has been selected");
    }if(event.getSource()==button9){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 Has been selected");
    }if(event.getSource()==button10){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 Has been selected");
    }

    if(event.getSource()==button1){//IF Any SEAT IS SELECTED
      System.out.println("Seat A1 Has been selected");
    }
    if(event.getSource()==button2){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 Has been selected");
    }if(event.getSource()==button3){//IF Any SEAT IS SELECTED
      System.out.println("Seat A3 Has been selected");
    }if(event.getSource()==button4){//IF Any SEAT IS SELECTED
      System.out.println("Seat A4 Has been selected");
    }if(event.getSource()==button5){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 Has been selected");
    }if(event.getSource()==button6){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 Has been selected");
    }if(event.getSource()==button7){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 Has been selected");
    }if(event.getSource()==button8){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 Has been selected");
    }if(event.getSource()==button9){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 Has been selected");
    }if(event.getSource()==button10){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 Has been selected");
    }

    if(event.getSource()==button1){//IF Any SEAT IS SELECTED
      System.out.println("Seat A1 Has been selected");
    }
    if(event.getSource()==button2){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 Has been selected");
    }if(event.getSource()==button3){//IF Any SEAT IS SELECTED
      System.out.println("Seat A3 Has been selected");
    }if(event.getSource()==button4){//IF Any SEAT IS SELECTED
      System.out.println("Seat A4 Has been selected");
    }if(event.getSource()==button5){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 Has been selected");
    }if(event.getSource()==button6){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 Has been selected");
    }if(event.getSource()==button7){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 Has been selected");
    }if(event.getSource()==button8){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 Has been selected");
    }if(event.getSource()==button9){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 Has been selected");
    }if(event.getSource()==button10){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 Has been selected");
    }

    if(event.getSource()==button1){//IF Any SEAT IS SELECTED
      System.out.println("Seat A1 Has been selected");
    }
    if(event.getSource()==button2){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 Has been selected");
    }if(event.getSource()==button3){//IF Any SEAT IS SELECTED
      System.out.println("Seat A3 Has been selected");
    }if(event.getSource()==button4){//IF Any SEAT IS SELECTED
      System.out.println("Seat A4 Has been selected");
    }if(event.getSource()==button5){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 Has been selected");
    }if(event.getSource()==button6){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 Has been selected");
    }if(event.getSource()==button7){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 Has been selected");
    }if(event.getSource()==button8){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 Has been selected");
    }if(event.getSource()==button9){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 Has been selected");
    }if(event.getSource()==button10){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 Has been selected");
    }

    if(event.getSource()==button1){//IF Any SEAT IS SELECTED
      System.out.println("Seat A1 Has been selected");
    }
    if(event.getSource()==button2){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 Has been selected");
    }if(event.getSource()==button3){//IF Any SEAT IS SELECTED
      System.out.println("Seat A3 Has been selected");
    }if(event.getSource()==button4){//IF Any SEAT IS SELECTED
      System.out.println("Seat A4 Has been selected");
    }if(event.getSource()==button5){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 Has been selected");
    }if(event.getSource()==button6){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 Has been selected");
    }if(event.getSource()==button7){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 Has been selected");
    }if(event.getSource()==button8){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 Has been selected");
    }if(event.getSource()==button9){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 Has been selected");
    }if(event.getSource()==button10){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 Has been selected");
    }

    if(event.getSource()==button1){//IF Any SEAT IS SELECTED
      System.out.println("Seat A1 Has been selected");
    }
    if(event.getSource()==button2){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 Has been selected");
    }if(event.getSource()==button3){//IF Any SEAT IS SELECTED
      System.out.println("Seat A3 Has been selected");
    }if(event.getSource()==button4){//IF Any SEAT IS SELECTED
      System.out.println("Seat A4 Has been selected");
    }if(event.getSource()==button5){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 Has been selected");
    }if(event.getSource()==button6){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 Has been selected");
    }if(event.getSource()==button7){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 Has been selected");
    }if(event.getSource()==button8){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 Has been selected");
    }if(event.getSource()==button9){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 Has been selected");
    }if(event.getSource()==button10){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 Has been selected");
    }

    if(event.getSource()==button1){//IF Any SEAT IS SELECTED
      System.out.println("Seat A1 Has been selected");
    }
    if(event.getSource()==button2){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 Has been selected");
    }if(event.getSource()==button3){//IF Any SEAT IS SELECTED
      System.out.println("Seat A3 Has been selected");
    }if(event.getSource()==button4){//IF Any SEAT IS SELECTED
      System.out.println("Seat A4 Has been selected");
    }if(event.getSource()==button5){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 Has been selected");
    }if(event.getSource()==button6){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 Has been selected");
    }if(event.getSource()==button7){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 Has been selected");
    }if(event.getSource()==button8){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 Has been selected");
    }if(event.getSource()==button9){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 Has been selected");
    }if(event.getSource()==button10){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 Has been selected");
    }

    if(event.getSource()==button1){//IF Any SEAT IS SELECTED
      System.out.println("Seat A1 Has been selected");
    }
    if(event.getSource()==button2){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 Has been selected");
    }if(event.getSource()==button3){//IF Any SEAT IS SELECTED
      System.out.println("Seat A3 Has been selected");
    }if(event.getSource()==button4){//IF Any SEAT IS SELECTED
      System.out.println("Seat A4 Has been selected");
    }if(event.getSource()==button5){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 Has been selected");
    }if(event.getSource()==button6){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 Has been selected");
    }if(event.getSource()==button7){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 Has been selected");
    }if(event.getSource()==button8){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 Has been selected");
    }if(event.getSource()==button9){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 Has been selected");
    }if(event.getSource()==button10){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 Has been selected");
    }

    if(event.getSource()==button1){//IF Any SEAT IS SELECTED
      System.out.println("Seat A1 Has been selected");
    }
    if(event.getSource()==button2){//IF Any SEAT IS SELECTED
      System.out.println("Seat A2 Has been selected");
    }if(event.getSource()==button3){//IF Any SEAT IS SELECTED
      System.out.println("Seat A3 Has been selected");
    }if(event.getSource()==button4){//IF Any SEAT IS SELECTED
      System.out.println("Seat A4 Has been selected");
    }if(event.getSource()==button5){//IF Any SEAT IS SELECTED
      System.out.println("Seat A5 Has been selected");
    }if(event.getSource()==button6){//IF Any SEAT IS SELECTED
      System.out.println("Seat A6 Has been selected");
    }if(event.getSource()==button7){//IF Any SEAT IS SELECTED
      System.out.println("Seat A7 Has been selected");
    }if(event.getSource()==button8){//IF Any SEAT IS SELECTED
      System.out.println("Seat A8 Has been selected");
    }if(event.getSource()==button9){//IF Any SEAT IS SELECTED
      System.out.println("Seat A9 Has been selected");
    }if(event.getSource()==button10){//IF Any SEAT IS SELECTED
      System.out.println("Seat A10 Has been selected");
    }
}/*-------------------------END OF BUTTON HANDLER-----------------------------*/


}
