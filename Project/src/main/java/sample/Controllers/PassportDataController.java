package sample.Controllers;

import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class PassportDataController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField passport_identificatonnumber_textfield;

    @FXML
    private Button passport_add_button;

    @FXML
    private TextField passport_name_textfield;

    @FXML
    private TextField passport_series_textfield;

    @FXML
    private TextField passport_number_textfield;

    @FXML
    private TextField passport_middlename_textfield;

    @FXML
    private TextField passport_lastname_textfield;

    @FXML
    void initialize() {
        assert passport_identificatonnumber_textfield != null : "fx:id=\"passport_identificatonnumber_textfield\" was not injected: check your FXML file 'passport_data.fxml'.";
        assert passport_add_button != null : "fx:id=\"passport_add_button\" was not injected: check your FXML file 'passport_data.fxml'.";
        assert passport_name_textfield != null : "fx:id=\"passport_name_textfield\" was not injected: check your FXML file 'passport_data.fxml'.";
        assert passport_series_textfield != null : "fx:id=\"passport_series_textfield\" was not injected: check your FXML file 'passport_data.fxml'.";
        assert passport_number_textfield != null : "fx:id=\"passport_number_textfield\" was not injected: check your FXML file 'passport_data.fxml'.";
        assert passport_middlename_textfield != null : "fx:id=\"passport_middlename_textfield\" was not injected: check your FXML file 'passport_data.fxml'.";
        assert passport_lastname_textfield != null : "fx:id=\"passport_lastname_textfield\" was not injected: check your FXML file 'passport_data.fxml'.";

    }
}
