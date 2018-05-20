package main.sample;

        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class PersonController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button person_add_button;

    @FXML
    private TextField person_email_textfield;

    @FXML
    private TextField person_idperson_textfield;

    @FXML
    private TextField person_idaddress_textfield;

    @FXML
    private TextField person_phonenumber_textfield;

    @FXML
    void initialize() {
        assert person_add_button != null : "fx:id=\"person_add_button\" was not injected: check your FXML file 'person.fxml'.";
        assert person_email_textfield != null : "fx:id=\"person_email_textfield\" was not injected: check your FXML file 'person.fxml'.";
        assert person_idperson_textfield != null : "fx:id=\"person_idperson_textfield\" was not injected: check your FXML file 'person.fxml'.";
        assert person_idaddress_textfield != null : "fx:id=\"person_idaddress_textfield\" was not injected: check your FXML file 'person.fxml'.";
        assert person_phonenumber_textfield != null : "fx:id=\"person_phonenumber_textfield\" was not injected: check your FXML file 'person.fxml'.";

    }
}
