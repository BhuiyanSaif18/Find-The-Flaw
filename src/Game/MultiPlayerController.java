/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Saif
 */
public class MultiPlayerController implements Initializable {
    static int score1=0, score2=0;
    @FXML public AnchorPane pane1;
    @FXML public AnchorPane pane2;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public  void loadMultiPlayer() throws IOException{
        AnchorPane pane =FXMLLoader.load(getClass().getClassLoader().getResource("Game/Multiplayer.fxml"));
        Group  grp1 = new Group(); 
        grp1.getChildren().add(pane1);
        Group  grp2 = new Group(); 
        grp2.getChildren().add(pane2);
        Label lbl1 = new Label();
        Label lbl2 = new Label();
        lbl1.setText(score1+"Score");
        lbl2.setText("Score"+score2);
        lbl1.setLayoutX(600);
        lbl1.setLayoutY(60);
        lbl2.setLayoutX(700);
        lbl2.setLayoutY(60);
        grp1.getChildren().add(lbl1);
        grp2.getChildren().add(lbl2);
        
    }
    
}
