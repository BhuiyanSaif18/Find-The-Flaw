/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Saif
 */
public class AboutController implements Initializable {
    @FXML public AnchorPane about;
    @FXML public Button back;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    public void loadScene(ActionEvent event) throws IOException {
        AnchorPane pane =FXMLLoader.load(getClass().getClassLoader().getResource("Game/Menu2.fxml"));
        about.getChildren().setAll(pane);
    }    
    
}
