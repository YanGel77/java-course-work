package main.sample;

        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class SettlementsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button settlements_add_button;

    @FXML
    private TextField settlements_name_textfield;

    @FXML
    private TextField settlements_id_textfield;

    @FXML
    void initialize() {
        assert settlements_add_button != null : "fx:id=\"settlements_add_button\" was not injected: check your FXML file 'settlements.fxml'.";
        assert settlements_name_textfield != null : "fx:id=\"settlements_name_textfield\" was not injected: check your FXML file 'settlements.fxml'.";
        assert settlements_id_textfield != null : "fx:id=\"settlements_id_textfield\" was not injected: check your FXML file 'settlements.fxml'.";

    }
}
