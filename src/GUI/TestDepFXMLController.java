/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author MKadmin
 */
public class TestDepFXMLController implements Initializable {

    @FXML
    private Button btnsuivant;
    
   

    /**
     * Initializes the controller class.
     */
   
    @FXML
    private RadioButton rep1_1;
    @FXML
    private RadioButton rep1_2;
    @FXML
    private RadioButton rep1_3;
     ToggleGroup group = new ToggleGroup();
    @FXML
    private Label Question1;
     
     
     
     
   
     
    
     
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        rep1_1.setToggleGroup(group);
        rep1_2.setToggleGroup(group);
        rep1_3.setToggleGroup(group);
       
        Question1.setText("kjne"); 
    }    

    
}
