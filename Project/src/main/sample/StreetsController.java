package main.sample;

        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class StreetsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField streets_idsettlements_textfield;

    @FXML
    private TextField streets_name_textfield;

    @FXML
    private TextField streets_idstreets_textfield;

    @FXML
    private TextField streets_idtypesofstreets_textfield;

    @FXML
    private Button streets_add_button;

    @FXML
    void initialize() {
        assert streets_idsettlements_textfield != null : "fx:id=\"streets_idsettlements_textfield\" was not injected: check your FXML file 'streets.fxml'.";
        assert streets_name_textfield != null : "fx:id=\"streets_name_textfield\" was not injected: check your FXML file 'streets.fxml'.";
        assert streets_idstreets_textfield != null : "fx:id=\"streets_idstreets_textfield\" was not injected: check your FXML file 'streets.fxml'.";
        assert streets_idtypesofstreets_textfield != null : "fx:id=\"streets_idtypesofstreets_textfield\" was not injected: check your FXML file 'streets.fxml'.";
        assert streets_add_button != null : "fx:id=\"streets_add_button\" was not injected: check your FXML file 'streets.fxml'.";

    }
}
