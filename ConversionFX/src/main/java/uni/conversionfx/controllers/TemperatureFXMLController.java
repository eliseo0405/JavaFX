/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.conversionfx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import uni.conversionfx.App;

/**
 * FXML Controller class
 *
 * @author Sistemas-12
 */
public class TemperatureFXMLController implements Initializable {
    @FXML
    public TextField txtCelcius;
    @FXML
    public TextField txtFha;
    @FXML
    public Button btnCompute;
    @FXML
    public Button btnClean;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void btnComputeAction(){
        
    }
    public void btnCleanAction(){
        
    }
    
}
