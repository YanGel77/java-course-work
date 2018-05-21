package main.sample.Controllers;

        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class DepositsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField deposits_possibilitytoreplenish_textfield;

    @FXML
    private TextField deposits_iddeposits_textfield;

    @FXML
    private TextField deposits_currency_textfield;

    @FXML
    private TextField deposits_interestrateonearly_textfield;

    @FXML
    private TextField deposits_conditions_textfield;

    @FXML
    private TextField deposits_expiration_textfield;

    @FXML
    private TextField deposits_interest_textfield;

    @FXML
    private TextField deposits_minimumperiod_textfield;

    @FXML
    private TextField deposits_start_textfield;

    @FXML
    private Button deposits_add_button;

    @FXML
    private TextField deposits_minimum_textfield;

    @FXML
    private TextField deposits_possibilityofearly_textfield;

    @FXML
    void initialize() {
        assert deposits_possibilitytoreplenish_textfield != null : "fx:id=\"deposits_possibilitytoreplenish_textfield\" was not injected: check your FXML file 'deposits.fxml'.";
        assert deposits_iddeposits_textfield != null : "fx:id=\"deposits_iddeposits_textfield\" was not injected: check your FXML file 'deposits.fxml'.";
        assert deposits_currency_textfield != null : "fx:id=\"deposits_currency_textfield\" was not injected: check your FXML file 'deposits.fxml'.";
        assert deposits_interestrateonearly_textfield != null : "fx:id=\"deposits_interestrateonearly_textfield\" was not injected: check your FXML file 'deposits.fxml'.";
        assert deposits_conditions_textfield != null : "fx:id=\"deposits_conditions_textfield\" was not injected: check your FXML file 'deposits.fxml'.";
        assert deposits_expiration_textfield != null : "fx:id=\"deposits_expiration_textfield\" was not injected: check your FXML file 'deposits.fxml'.";
        assert deposits_interest_textfield != null : "fx:id=\"deposits_interest_textfield\" was not injected: check your FXML file 'deposits.fxml'.";
        assert deposits_minimumperiod_textfield != null : "fx:id=\"deposits_minimumperiod_textfield\" was not injected: check your FXML file 'deposits.fxml'.";
        assert deposits_start_textfield != null : "fx:id=\"deposits_start_textfield\" was not injected: check your FXML file 'deposits.fxml'.";
        assert deposits_add_button != null : "fx:id=\"deposits_add_button\" was not injected: check your FXML file 'deposits.fxml'.";
        assert deposits_minimum_textfield != null : "fx:id=\"deposits_minimum_textfield\" was not injected: check your FXML file 'deposits.fxml'.";
        assert deposits_possibilityofearly_textfield != null : "fx:id=\"deposits_possibilityofearly_textfield\" was not injected: check your FXML file 'deposits.fxml'.";

    }
}
