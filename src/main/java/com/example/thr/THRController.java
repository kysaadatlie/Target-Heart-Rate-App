package com.example.thr;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class THRController {
    double maxHR;
    double r1, r2;

    @FXML
    private TextField ageTextField;

    @FXML
    private TextField maxHRTextField;

    @FXML
    private TextField thrRangeTextField;

    @FXML
    void calculateButtonPressed(ActionEvent event) {
        try{
            double age = Double.parseDouble(ageTextField.getText());
            maxHR = 220 - age;
            r1 = 0.5 * maxHR;
            r2 = 0.85 * maxHR;
            maxHRTextField.setText(String.valueOf(maxHR));
            thrRangeTextField.setText(String.valueOf(r1) + " - " + String.valueOf(r2));
        }
        catch (Exception ex){
            ageTextField.setText("Enter amount");
            ageTextField.selectAll();
            ageTextField.requestFocus();
        }
    }

}
