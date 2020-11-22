package Calculator_Final;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.lang.Math;

/**
 *This code controls what happens when the buttons are pressed
 */
public class calculatorController{

    //Float data = 0f;
    Double Value1 = null;
    Double Value2 = null;
    String Operand = null;
    boolean Negative = false;


    @FXML
    private TextField display;
    @FXML
    private Label label;

    @FXML
    private Button button0;
    @FXML
    private Button button1;
    @FXML
    private Button button2;
    @FXML
    private Button button3;
    @FXML
    private Button button4;
    @FXML
    private Button button5;
    @FXML
    private Button button6;
    @FXML
    private Button button7;
    @FXML
    private Button button8;
    @FXML
    private Button button9;

    @FXML
    private Button buttonAdd;
    @FXML
    private Button buttonSub;
    @FXML
    private Button buttonDiv;
    @FXML
    private Button buttonMult;
    @FXML
    private Button buttonSquare;
    @FXML
    private Button buttonRoot;

    @FXML
    private Button buttonDec;
    //@FXML
    //private Button buttonNeg; //gonna need to make this basically implement when clicking the minus button while before a value


    @FXML
    private Button buttonEqu;
    @FXML
    private Button buttonCE;
    @FXML
    private Button buttonClear;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == button1) {
            if (Operand == null){
                if (Value1 == null){
                    Value1 = 1.0;
                }
                else {
                    Value1 = (Value1 * 10) + 1;
                }
            }
            else {
                if (Value2 == null){
                    Value2 = 1.0;
                }
                else {
                    Value2 = (Value2 * 10) + 1;
                }
            }
            display.setText(display.getText() + "1");
        }
        else if (event.getSource() == button2) {
            if (Operand == null){
                if (Value1 == null){
                    Value1 = 2.0;
                }
                else {
                    Value1 = (Value1 * 10) + 2;
                }
            }
            else {
                if (Value2 == null){
                    Value2 = 2.0;
                }
                else {
                    Value2 = (Value2 * 10) + 2;
                }
            }
            display.setText(display.getText() + "2");
        }
        else if (event.getSource() == button3) {
            if (Operand == null){
                if (Value1 == null){
                    Value1 = 3.0;
                }
                else {
                    Value1 = (Value1 * 10) + 3;
                }
            }
            else {
                if (Value2 == null){
                    Value2 = 3.0;
                }
                else {
                    Value2 = (Value2 * 10) + 3;
                }
            }
            display.setText(display.getText() + "3");
        }
        else if (event.getSource() == button4) {
            if (Operand == null){
                if (Value1 == null){
                    Value1 = 4.0;
                }
                else {
                    Value1 = (Value1 * 10) + 4;
                }
            }
            else {
                if (Value2 == null){
                    Value2 = 4.0;
                }
                else {
                    Value2 = (Value2 * 10) + 4;
                }
            }
            display.setText(display.getText() + "4");
        }
        else if (event.getSource() == button5) {
            if (Operand == null){
                if (Value1 == null){
                    Value1 = 5.0;
                }
                else {
                    Value1 = (Value1 * 10) + 5;
                }
            }
            else {
                if (Value2 == null){
                    Value2 = 5.0;
                }
                else {
                    Value2 = (Value2 * 10) + 5;
                }
            }
            display.setText(display.getText() + "5");
        }
        else if (event.getSource() == button6) {
            if (Operand == null){
                if (Value1 == null){
                    Value1 = 6.0;
                }
                else {
                    Value1 = (Value1 * 10) + 6;
                }
            }
            else {
                if (Value2 == null){
                    Value2 = 6.0;
                }
                else {
                    Value2 = (Value2 * 10) + 6;
                }
            }
            display.setText(display.getText() + "6");
        }
        else if (event.getSource() == button7) {
            if (Operand == null){
                if (Value1 == null){
                    Value1 = 7.0;
                }
                else {
                    Value1 = (Value1 * 10) + 7;
                }
            }
            else {
                if (Value2 == null){
                    Value2 = 7.0;
                }
                else {
                    Value2 = (Value2 * 10) + 7;
                }
            }
            display.setText(display.getText() + "7");
        }
        else if (event.getSource() == button8) {
            if (Operand == null){
                if (Value1 == null){
                    Value1 = 8.0;
                }
                else {
                    Value1 = (Value1 * 10) + 8;
                }
            }
            else {
                if (Value2 == null){
                    Value2 = 8.0;
                }
                else {
                    Value2 = (Value2 * 10) + 8;
                }
            }
            display.setText(display.getText() + "8");
        }
        else if (event.getSource() == button9) {
            if (Operand == null){
                if (Value1 == null){
                    Value1 = 9.0;
                }
                else {
                    Value1 = (Value1 * 10) + 9;
                }
            }
            else {
                if (Value2 == null){
                    Value2 = 9.0;
                }
                else {
                    Value2 = (Value2 * 10) + 9;
                }
            }
            display.setText(display.getText() + "9");
        }
        else if (event.getSource() == button0) {
            if (Operand == null){
                if (Value1 == null){
                    Value1 = 0.0;
                }
                else {
                    Value1 = (Value1 * 10);
                }
            }
            else {
                if (Value2 == null){
                    Value2 = 0.0;
                }
                else {
                    Value2 = (Value2 * 10);
                }
            }
            display.setText(display.getText() + "0");
        } //number buttons have all been updated so that they update the values independent of the display


        else if (event.getSource() == buttonClear) {
            display.setText("");
            reset();
        }
        else if (event.getSource() == buttonAdd) {
            //data = Float.parseFloat(display.getText());
            Operand = "+"; //Addition
            display.setText(display.getText() + "+");
        }
        else if (event.getSource() == buttonSub) {
            //data = Float.parseFloat(display.getText());
            Operand = "-"; //Subtraction
            display.setText(display.getText() + "-");
        }
        else if (event.getSource() == buttonMult) {
            //data = Float.parseFloat(display.getText());
            Operand = "*"; //Mul
            display.setText(display.getText() + "*");
        }
        else if (event.getSource() == buttonDiv) {
            //data = Float.parseFloat(display.getText());
            Operand = "/"; //Division
            display.setText(display.getText() + "/");
        }
        else if (event.getSource() == buttonSquare) {
            //data = Float.parseFloat(display.getText());
            double ans = Value1 * Value1;
            display.setText(String.valueOf(ans));
        }

        else if (event.getSource() == buttonRoot) { //TODO
            //data = Float.parseFloat(display.getText());
            double ans = Math.sqrt(Value1);
            display.setText(String.valueOf(ans));
        }

        else if (event.getSource() == buttonDec) { //TODO
            display.setText(display.getText() + ".");
        }

        else if (event.getSource() == buttonCE) {
            if (Operand == null) {
                Value1 = null;
                display.setText("");
            }
            else if (Value2 == null) {
                Operand = null;
                display.setText(String.valueOf(Value1));
            }
            else {
                Value2 = null;
                display.setText(String.valueOf(Value1) + Operand);
            }
        } //probably done


        else if (event.getSource() == buttonEqu) {
            //Float secondOperand = Float.parseFloat(display.getText());
            equals();
        }
    }

    // a function that mimics your original equals function
    double equals() {
        double ans = 0.0;
        switch (Operand) {
            case "+": //Addition
                ans = Value1 + Value2;
                display.setText(String.valueOf(ans));
                break;
            case "-": //Subtraction
                ans = Value1 - Value2;
                display.setText(String.valueOf(ans));
                break;
            case "*": //Mul
                ans = Value1 * Value2;
                display.setText(String.valueOf(ans));
                break;
            case "/": //Div
                if (Value2 == 0) {
                    display.setText("Cannot Divide By Zero"); //does a weird thing here where it only shows the first 3 letters, if you click it though and use an arrow key, you can see the whole message
                }
                else {
                    ans = Value1 / Value2;
                    display.setText(String.valueOf(ans));
                }
                break;
        }
        return ans;
    }

    //handy function for returning everything to its beggining
    void reset() {
        Value1 = null;
        Value2 = null;
        Operand = null;
        Negative = false;
    }

    void stillnull() {
        //check if anything is still null - value 1 and 2, operand
    }

}