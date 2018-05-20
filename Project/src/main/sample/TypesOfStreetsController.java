package main.sample;

        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class TypesOfStreetsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField typesofstreets_type_textfield;

    @FXML
    private TextField typesofstreets_id_textfield;

    @FXML
    private Button typesofstreets_add_button;

    @FXML
    void initialize() {
        assert typesofstreets_type_textfield != null : "fx:id=\"typesofstreets_type_textfield\" was not injected: check your FXML file 'types_of_streets.fxml'.";
        assert typesofstreets_id_textfield != null : "fx:id=\"typesofstreets_id_textfield\" was not injected: check your FXML file 'types_of_streets.fxml'.";
        assert typesofstreets_add_button != null : "fx:id=\"typesofstreets_add_button\" was not injected: check your FXML file 'types_of_streets.fxml'.";

    }
}

