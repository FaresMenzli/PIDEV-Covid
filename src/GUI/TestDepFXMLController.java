/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import com.esprit.utils.* ;
import com.esprit.Service.ServiceQuestion;

import com.esprit.utils.DataBase;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventType;
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
//    
       private Connection con = DataBase.getInstance().getConnection();
    private Statement ste;

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
    
     
     
     
      
   String Qu ;
     
    int score =0 ;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        rep1_1.setToggleGroup(group);
        rep1_2.setToggleGroup(group);
        rep1_3.setToggleGroup(group);
     
//          try {
//           ResultSet rs = ste.executeQuery("select * from Question where Q_id=1 ;")  ;
//          while (rs.next()){
//            Qu = rs.getString(2);}
//       } catch (SQLException ex) {
//           System.out.println(ex);}
        // TODO
        
       ServiceQuestion ser=new ServiceQuestion();
       
        Question1.setText(ser.afficheQuestion()); 
        if (rep1_1.isSelected()) score +=5;
        else if (rep1_2.isSelected())score+=3;
        else if (rep1_3.isSelected())score+=0;
        
        
        System.out.println(score);
       
           
        btnsuivant.setOnAction(e ->{
            Question1.setText(ser.afficheQuestion2());
            if (rep1_1.isSelected()) score +=5;
        else if (rep1_2.isSelected())score+=3;
        else if (rep1_3.isSelected())score+=0;
             System.out.println(score);
            
             
        }
            
            );
        
            
            
        
        
    
    }
    }    

    

