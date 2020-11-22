package Calculator_Final;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *This code controls what happens when the buttons are pressed
 */
public class calculatorController implements KeyListener {



    //Float data = 0f;
    Double Value1 = null;
    Double Value2 = null;
    String Operand = null;
    boolean Negative = false;


    @FXML
    private TextField display;
    //@FXML
    //private Slider slidervalue;
    //<Slider fx:id="slidervalue" prefHeight="98.0" prefWidth="434.0"/> //this should be on the fxml page
    //JSlider slider = new JSlider(JSlider.VERTICAL, 0, 100, 0);

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
        } //done

        else if (event.getSource() == buttonAdd) {
            if (Value1 == null) {
                Value1 = 0.0;
            }
            else if (Value2 == null){
                if (Negative){
                    Value1 = Value1 * -1;
                    Negative = false;
                }
                Operand = "+"; //Addition
                display.setText(display.getText() + "+");
            }
            else if (Operand != null) {
                equals();
            }
        }
        else if (event.getSource() == buttonSub) {
            if (Value1 == null) {
                Negative = true;
                display.setText("-");
            }
            else if (Value1 == null && Negative) {
                Value1 = 0.0;
            }
            else if (Value2 == null && Operand == null){
                if (Negative){
                    Value1 = Value1 * -1;
                    Negative = false;
                }
                Operand = "-"; //Subtraction
                display.setText(display.getText() + "-");
            }
            else if (Value2 == null && Operand != null){
                Negative = true;
                display.setText(display.getText() + "-");
            }
            else if (Operand != null) {
                equals();
            }
        } //negative stuff has been accounted for
        else if (event.getSource() == buttonMult) {
            if (Value1 == null) {
                Value1 = 0.0;
            }
            else if (Value2 == null){
                if (Negative){
                    Value1 = Value1 * -1;
                    Negative = false;
                }
                Operand = "*"; //Multiplication
                display.setText(display.getText() + "*");
            }
            else if (Operand != null) {
                equals();
            }
        }
        else if (event.getSource() == buttonDiv) {
            if (Value1 == null) {
                Value1 = 0.0;
            }
            else if (Value2 == null){
                if (Negative){
                    Value1 = Value1 * -1;
                    Negative = false;
                }
                Operand = "/"; //Division
                display.setText(display.getText() + "/");
            }
            else if (Operand != null) {
                equals();
            }
        } //base math has been adjusted to allow for pseudo multinary math

        else if (event.getSource() == buttonSquare) { //TODO
            double ans = Value1 * Value1;
            display.setText(String.valueOf(ans));
        }

        else if (event.getSource() == buttonRoot) { //TODO
            double ans = Math.sqrt(Value1);
            display.setText(String.valueOf(ans));
        }

        else if (event.getSource() == buttonDec) { //TODO
            Value1 = 5.0;
            Value2 = 5.0;
            Operand = "+";
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
                display.setText(Value1 + Operand);
            }
        } //most likely probably fine


        else if (event.getSource() == buttonEqu) {
            equals();
        } //moved to equals function
    }

    // a function that mimics your original equals function
    void equals() {
        double ans = 0.0;
        if (nullcheck()) {
            if (Negative){
                Value2 = Value2 * -1;
                Negative = false;
            }
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
                        display.setText("Cannot Divide By Zero"); //does a weird thing here where it only shows an amount of letters equal to how many digits were already out, if you click it though and use an arrow key, you can see the whole message
                    } else {
                        ans = Value1 / Value2;
                        display.setText(String.valueOf(ans));
                    }
                    break;
            }
            reset();
            Value1 = ans;
        }
        //return ans;
    }

    //handy function for returning everything to its beginning
    void reset() {
        Value1 = null;
        Value2 = null;
        Operand = null;
        Negative = false;
    }

    boolean nullcheck() {
        return !(Value1 == null) || (Value2 == null) || (Operand == null);
    } //returns true if nothing is null, false if anyone of them is - seems to not be working



    //doesn't work, but its got all the stuff for working, so whatever
    @Override
    public void keyTyped(KeyEvent e) {
        switch (String.valueOf(e)) {
            case "0":
                if (Operand == null) {
                    if (Value1 == null) {
                        Value1 = 0.0;
                    } else {
                        Value1 = (Value1 * 10);
                    }
                } else {
                    if (Value2 == null) {
                        Value2 = 0.0;
                    } else {
                        Value2 = (Value2 * 10);
                    }
                }
                display.setText(display.getText() + "0");
                break;
            case "1":
                if (Operand == null) {
                    if (Value1 == null) {
                        Value1 = 1.0;
                    } else {
                        Value1 = (Value1 * 10) + 1;
                    }
                } else {
                    if (Value2 == null) {
                        Value2 = 1.0;
                    } else {
                        Value2 = (Value2 * 10) + 1;
                    }
                }
                display.setText(display.getText() + "1");
                break;
            case "2":
                if (Operand == null) {
                    if (Value1 == null) {
                        Value1 = 2.0;
                    } else {
                        Value1 = (Value1 * 10) + 2;
                    }
                } else {
                    if (Value2 == null) {
                        Value2 = 2.0;
                    } else {
                        Value2 = (Value2 * 10) + 2;
                    }
                }
                display.setText(display.getText() + "2");
                break;
            case "3":
                if (Operand == null) {
                    if (Value1 == null) {
                        Value1 = 3.0;
                    } else {
                        Value1 = (Value1 * 10) + 3;
                    }
                } else {
                    if (Value2 == null) {
                        Value2 = 3.0;
                    } else {
                        Value2 = (Value2 * 10) + 3;
                    }
                }
                display.setText(display.getText() + "3");
                break;
            case "4":
                if (Operand == null) {
                    if (Value1 == null) {
                        Value1 = 4.0;
                    } else {
                        Value1 = (Value1 * 10) + 4;
                    }
                } else {
                    if (Value2 == null) {
                        Value2 = 4.0;
                    } else {
                        Value2 = (Value2 * 10) + 4;
                    }
                }
                display.setText(display.getText() + "4");
                break;
            case "5":
                if (Operand == null) {
                    if (Value1 == null) {
                        Value1 = 5.0;
                    } else {
                        Value1 = (Value1 * 10) + 5;
                    }
                } else {
                    if (Value2 == null) {
                        Value2 = 5.0;
                    } else {
                        Value2 = (Value2 * 10) + 5;
                    }
                }
                display.setText(display.getText() + "5");
                break;
            case "6":
                if (Operand == null) {
                    if (Value1 == null) {
                        Value1 = 6.0;
                    } else {
                        Value1 = (Value1 * 10) + 6;
                    }
                } else {
                    if (Value2 == null) {
                        Value2 = 6.0;
                    } else {
                        Value2 = (Value2 * 10) + 6;
                    }
                }
                display.setText(display.getText() + "6");
                break;
            case "7":
                if (Operand == null) {
                    if (Value1 == null) {
                        Value1 = 7.0;
                    } else {
                        Value1 = (Value1 * 10) + 7;
                    }
                } else {
                    if (Value2 == null) {
                        Value2 = 7.0;
                    } else {
                        Value2 = (Value2 * 10) + 7;
                    }
                }
                display.setText(display.getText() + "7");
                break;
            case "8":
                if (Operand == null) {
                    if (Value1 == null) {
                        Value1 = 8.0;
                    } else {
                        Value1 = (Value1 * 10) + 8;
                    }
                } else {
                    if (Value2 == null) {
                        Value2 = 8.0;
                    } else {
                        Value2 = (Value2 * 10) + 8;
                    }
                }
                display.setText(display.getText() + "8");
                break;
            case "9":
                if (Operand == null) {
                    if (Value1 == null) {
                        Value1 = 9.0;
                    } else {
                        Value1 = (Value1 * 10) + 9;
                    }
                } else {
                    if (Value2 == null) {
                        Value2 = 9.0;
                    } else {
                        Value2 = (Value2 * 10) + 9;
                    }
                }
                display.setText(display.getText() + "9");
                break;

        }

    }

    //don't actually need these two
    @Override
    public void keyPressed(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}