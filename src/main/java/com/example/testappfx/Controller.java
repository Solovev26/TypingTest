package com.example.testappfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


public class Controller {
    long startTime = -1;

    @FXML
    private TextArea TextFl;

    @FXML
    private Label SPM;
    @FXML
    protected void onResetButtonClick() {
        startTime = -1;
        Spm.setC(0);
        TextFl.clear();
    }
    @FXML
    protected void onType() {
        Spm.adder();
        int spm;
        if(startTime == -1){
            startTime = System.currentTimeMillis()-1;
        }
        long stopTime = System.currentTimeMillis();
        if(Spm.getC()!=1) {
            spm = (int) (Spm.getC() / ((stopTime - startTime) / 1000.0) * 60);
        }
        else spm = 0;
        SPM.setText("SPM = "+Integer.toString(spm));
    }


}
