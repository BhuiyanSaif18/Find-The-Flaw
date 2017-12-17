/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;
import static Game.Menu2Controller.score;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author Saif
 */
public class LevelFailedController implements Initializable {
    @FXML
    public AnchorPane pane;
    @FXML
    public Button tryagain;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void loadSceneFailed() throws IOException{
       
        score=0;
        AnchorPane pane3 =FXMLLoader.load(getClass().getClassLoader().getResource("Game/Menu2.fxml"));
        pane.getChildren().setAll(pane3);
        
    }
    
}
