package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Calculator {
	@FXML
    private TextField textfieldCalc;

    @FXML
    private Text savedNumbers;

    private String firstNumber = "";

    private String currentNumber = "";

    private String calculationType;

    @FXML
    void addAction(ActionEvent event) {
        calculationSetup("+");
    }

    @FXML
    void minusAction(ActionEvent event) {
        calculationSetup("-");
    }

    @FXML
    void divideAction(ActionEvent event) {
        calculationSetup("/");
    }

    @FXML
    void multiplicationAction(ActionEvent event) {
        calculationSetup("*");
    }

    public void calculationSetup(String calculationType){
        this.calculationType = calculationType;
        firstNumber = currentNumber;
        currentNumber = "";
        savedNumbers.setText(firstNumber + " " + calculationType);
    }

    @FXML
    void calculate(ActionEvent event) {
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(currentNumber);

        switch (calculationType) {
            case "+" -> {
                int calculatedNumber = firstNumberInt + secondNumberInt;
                savedNumbers.setText(firstNumber + " + " + currentNumber + " = " + calculatedNumber);
                textfieldCalc.setText(String.valueOf(calculatedNumber));
            }
            case "-" -> {
                int calculatedNumber = firstNumberInt - secondNumberInt;
                savedNumbers.setText(firstNumber + " - " + currentNumber + " = " + calculatedNumber);
                textfieldCalc.setText(String.valueOf(calculatedNumber));
            }
            case "/" -> {
                double calculatedNumber = firstNumberInt / (double)secondNumberInt;
                savedNumbers.setText(firstNumber + " / " + currentNumber + " = " + calculatedNumber);
                textfieldCalc.setText(String.valueOf(calculatedNumber));
            }
            case "*" -> {
                int calculatedNumber = firstNumberInt * secondNumberInt;
                savedNumbers.setText(firstNumber + " * " + currentNumber + " = " + calculatedNumber);
                textfieldCalc.setText(String.valueOf(calculatedNumber));
            }
        }
    }

    @FXML
    void cleartextfieldCalc(ActionEvent event) {
        currentNumber = "";
        textfieldCalc.setText("");
        savedNumbers.setText("");
    }

    @FXML
    void button0Clicked(ActionEvent event) {
        if(!currentNumber.equals("")){
            addNumber("0");
        }
    }

    @FXML
    void button1Clicked(ActionEvent event) {
        addNumber("1");
    }

    @FXML
    void button2Clicked(ActionEvent event) {
        addNumber("2");
    }

    @FXML
    void button3Clicked(ActionEvent event) {
        addNumber("3");
    }

    @FXML
    void button4Clicked(ActionEvent event) {
        addNumber("4");
    }

    @FXML
    void button5Clicked(ActionEvent event) {
        addNumber("5");
    }

    @FXML
    void button6Clicked(ActionEvent event) {
        addNumber("6");
    }

    @FXML
    void button7Clicked(ActionEvent event) {
        addNumber("7");
    }

    @FXML
    void button8Clicked(ActionEvent event) {
        addNumber("8");
    }

    @FXML
    void button9Clicked(ActionEvent event) {
        addNumber("9");
    }

    public void updatetextfieldCalc(){
        textfieldCalc.setText(currentNumber);
    }

    public void addNumber(String number){
        currentNumber += number;
        updatetextfieldCalc();
    }
}

