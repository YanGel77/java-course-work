package main.sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AddressController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField address_idaddress_textfield;

    @FXML
    private TextField address_idstreets_textfield;

    @FXML
    private Button address_add_button;

    @FXML
    private TextField address_housenumber_textfield;

    @FXML
    private TextField address_apartmentnumber_textfield;

    @FXML
    void initialize() {
        assert address_idaddress_textfield != null : "fx:id=\"address_idaddress_textfield\" was not injected: check your FXML file 'address.fxml'.";
        assert address_idstreets_textfield != null : "fx:id=\"address_idstreets_textfield\" was not injected: check your FXML file 'address.fxml'.";
        assert address_add_button != null : "fx:id=\"address_add_button\" was not injected: check your FXML file 'address.fxml'.";
        assert address_housenumber_textfield != null : "fx:id=\"address_housenumber_textfield\" was not injected: check your FXML file 'address.fxml'.";
        assert address_apartmentnumber_textfield != null : "fx:id=\"address_apartmentnumber_textfield\" was not injected: check your FXML file 'address.fxml'.";

    }
}
