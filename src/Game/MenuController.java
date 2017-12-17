/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Game.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

/**
 *
 * @author Saif
 */
public class MenuController implements Initializable {
    @FXML public AnchorPane menuPane;
    @FXML public Button Menu;
    @FXML public Button Exit;
    @Override
    public void initialize(URL location, ResourceBundle resources) { 
        Exit.setOnAction((ActionEvent e) -> {
            Stage stage = (Stage) Exit.getScene().getWindow();
            stage.close();
        }); 
    }
    @FXML
    public void loadScene(ActionEvent event) throws IOException {
        AnchorPane pane =FXMLLoader.load(getClass().getClassLoader().getResource("Game/Menu2.fxml"));
        menuPane.getChildren().setAll(pane);
    }
}
