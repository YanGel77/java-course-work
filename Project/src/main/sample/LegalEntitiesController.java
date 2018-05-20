package main.sample;

        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class LegalEntitiesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField legalentities_idperson_textfield;

    @FXML
    private TextField legalentities_vat_textfield;

    @FXML
    private Button legalentities_add_button;

    @FXML
    private TextField legalentities_codeedrpou_textfield;

    @FXML
    private TextField legalentities_name_textfield;

    @FXML
    void initialize() {
        assert legalentities_idperson_textfield != null : "fx:id=\"legalentities_idperson_textfield\" was not injected: check your FXML file 'legal_entities.fxml'.";
        assert legalentities_vat_textfield != null : "fx:id=\"legalentities_vat_textfield\" was not injected: check your FXML file 'legal_entities.fxml'.";
        assert legalentities_add_button != null : "fx:id=\"legalentities_add_button\" was not injected: check your FXML file 'legal_entities.fxml'.";
        assert legalentities_codeedrpou_textfield != null : "fx:id=\"legalentities_codeedrpou_textfield\" was not injected: check your FXML file 'legal_entities.fxml'.";
        assert legalentities_name_textfield != null : "fx:id=\"legalentities_name_textfield\" was not injected: check your FXML file 'legal_entities.fxml'.";

    }
}
