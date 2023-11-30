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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author Asif
 */
public class SubscriptionSceneController implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private RadioButton annualOneRadioButton;
    @FXML
    private RadioButton annualTwoRadioButton;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField passwordTextField;
    
    private ToggleGroup tg;
    @FXML
    private TextField confirmPasswordTextField;
    @FXML
    private Button createAccountButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tg= new ToggleGroup();
        annualOneRadioButton.setToggleGroup(tg);
        annualTwoRadioButton.setToggleGroup(tg);
        //createAccountButton.setDisable(true);
    }    

    @FXML
    private void createAccountButtonOnClicked(ActionEvent event){
        String mail=emailTextField.getText();
        String password=passwordTextField.getText();
        String confirmPassword= confirmPasswordTextField.getText();
        Subscriber newSub=new Subscriber(mail,password);
        
    }

    private void showAlert(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
    @FXML
    private void backButtonOnClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CommonScene.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
