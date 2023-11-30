/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ottprojectf;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class ContentUploadController implements Initializable {

    @FXML
    private Button file_selection;
    @FXML
    private ComboBox<String> privacy;
    @FXML
    private Button upload_content;
    @FXML
    private ComboBox<Integer> ageselection;
    @FXML
    private ComboBox<String> categorySelection;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        privacy.getItems().addAll("Private", "Public");
        ageselection.getItems().addAll(17,18);
        categorySelection.getItems().addAll("Movies","TV Show","Documentaries","Anime","Comedy","Horror","Thriller","Sci-Fi","Romantic");
    }    
    
}
