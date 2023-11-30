/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ottprojectf;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ContentCreatorController implements Initializable {

    @FXML
    private Button profileView;
    @FXML
    private Button startStreaming;
    @FXML
    private Button contentUploadation;
    @FXML
    private Button earnMoneny;

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void redirectToProfile(ActionEvent event) {
    }

    @FXML
    private void redirectsToStream(ActionEvent event) {
    }

    @FXML
    private void redirectsToUpload(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ContentUpload.fxml"));
        stage= (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void redirectsToEarn(ActionEvent event) {
    }
    
}
