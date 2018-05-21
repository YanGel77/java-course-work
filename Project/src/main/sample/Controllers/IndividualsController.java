package main.sample.Controllers;

        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class IndividualsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField individuals_identificationnumber_textfield;

    @FXML
    private TextField individuals_idperson_textfield;

    @FXML
    private Button individuals_add_button;

    @FXML
    void initialize() {
        assert individuals_identificationnumber_textfield != null : "fx:id=\"individuals_identificationnumber_textfield\" was not injected: check your FXML file 'individuals.fxml'.";
        assert individuals_idperson_textfield != null : "fx:id=\"individuals_idperson_textfield\" was not injected: check your FXML file 'individuals.fxml'.";
        assert individuals_add_button != null : "fx:id=\"individuals_add_button\" was not injected: check your FXML file 'individuals.fxml'.";

    }
}
