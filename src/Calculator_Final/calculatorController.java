package Calculator_Final;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.lang.Math;

/**
 *This code controls what happens when the buttons are pressed
 */
public class calculatorController{

    Float data = 0f;
    int operation = -1;

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
    @FXML
    private Button buttonNeg;



    @FXML
    private Button buttonEqu;
    @FXML
    private Button buttonCE;
    @FXML
    private Button buttonClear;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == button1) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == button2) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == button3) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == button4) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == button5) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == button6) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == button7) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == button8) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == button9) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == button0) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == buttonClear) {
            display.setText("");
        } else if (event.getSource() == buttonAdd) {
            data = Float.parseFloat(display.getText());
            operation = 1; //Addition
            display.setText("");
        } else if (event.getSource() == buttonSub) {
            data = Float.parseFloat(display.getText());
            operation = 2; //Substraction
            display.setText("");
        } else if (event.getSource() == buttonMult) {
            data = Float.parseFloat(display.getText());
            operation = 3; //Mul
            display.setText("");
        } else if (event.getSource() == buttonDiv) {
            data = Float.parseFloat(display.getText());
            operation = 4; //Division
            display.setText("");
        } else if (event.getSource() == buttonSquare) {
            data = Float.parseFloat(display.getText());
            Float ans = data * data;
            display.setText(String.valueOf(ans));
        } else if (event.getSource() == buttonRoot) {
            data = Float.parseFloat(display.getText());
            double ans = Math.sqrt(data);
            display.setText(String.valueOf(ans));
        } else if (event.getSource() == buttonDec) {
            display.setText(display.getText() + ".");
        } else if (event.getSource() == buttonCE) {
            String str = display.getText();
            display.setText(str.substring(0,str.length()-2));
        } else if (event.getSource() == buttonEqu) {
            Float secondOperand = Float.parseFloat(display.getText());
            switch (operation) {
                case 1: //Addition
                    Float ans = data + secondOperand;
                    display.setText(String.valueOf(ans));break;
                case 2: //Subtraction
                    ans = data - secondOperand;
                    display.setText(String.valueOf(ans));break;
                case 3: //Mul
                    ans = data * secondOperand;
                    display.setText(String.valueOf(ans));break;
                case 4: //Div
                    ans = 0f;
                    try {
                        ans = data / secondOperand;
                    }catch(Exception e){display.setText("Error");}
                    display.setText(String.valueOf(ans));break;
            }
        }
    }

}