/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.fcys.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import ni.edu.uni.fcys.programacion2.conversionfx.core.TemperatureConversion;

/**
 * FXML Controller class
 *
 * @author Sistemas-05
 */
public class TemperatureFXMLController implements Initializable {
    public TextField txtCelsius;
    @FXML
    public TextField txtFha;
    @FXML
    public Button btnCompute;
    @FXML
    public Button btnClean;
    @FXML
    public RadioButton rbtnCelsius;
    @FXML
    public RadioButton rbtnFha;
    @FXML
    public ToggleGroup temperature;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void btnComputeAction(){
        float value = 0, result = 0;
        if(rbtnCelsius.isSelected()){
            value = Float.parseFloat(txtCelsius.getText());
            result = TemperatureConversion.fromCtoF(value);
            txtFha.setText(String.valueOf(result));
        }else if(rbtnFha.isSelected()){
            value = Float.parseFloat(txtFha.getText());
            result = TemperatureConversion.fromFtoC(value);
            txtCelsius.setText(String.valueOf(result));
        }
    }

    @FXML
    public void txtCelsiusAction(ActionEvent event) {
    }

    @FXML
    public void txtFhaAction(ActionEvent event) {
    }

    @FXML
    public void rbtnCelsiusAction(ActionEvent event) {
        activateTextFields();
    }

    @FXML
    public void rbtnFhaAction(ActionEvent event) {
        activateTextFields();
    }

    @FXML
    public void btnCleanAction(ActionEvent event) {
        
    }
    
    public void activateTextFields(){
        if(rbtnCelsius.isSelected()){
            txtCelsius.setEditable(true);
            txtFha.setEditable(false);
            
            txtCelsius.requestFocus();
            
        }else if(rbtnFha.isSelected()){
            txtCelsius.setEditable(false);
            txtFha.setEditable(true);
            txtFha.requestFocus();
        }
        
        cleanTextField();
    }

    public void cleanTextField() {
        txtCelsius.setText("");
        txtFha.setText("");
    }
    
}
