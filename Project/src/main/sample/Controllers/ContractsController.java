package main.sample.Controllers;

        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class ContractsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button contracts_add_button;

    @FXML
    private TextField contracts_conclusion_textfield;

    @FXML
    private TextField contracts_iddeposit_textfield;

    @FXML
    private TextField contracts_idperson_textfield;

    @FXML
    private TextField contracts_expiration_textfield;

    @FXML
    private TextField contracts_idcontract_textfield;

    @FXML
    private TextField contracts_accountnumber_textfield;

    @FXML
    private TextField contracts_amount_textfield;

    @FXML
    void initialize() {
        assert contracts_add_button != null : "fx:id=\"contracts_add_button\" was not injected: check your FXML file 'contracts.fxml'.";
        assert contracts_conclusion_textfield != null : "fx:id=\"contracts_conclusion_textfield\" was not injected: check your FXML file 'contracts.fxml'.";
        assert contracts_iddeposit_textfield != null : "fx:id=\"contracts_iddeposit_textfield\" was not injected: check your FXML file 'contracts.fxml'.";
        assert contracts_idperson_textfield != null : "fx:id=\"contracts_idperson_textfield\" was not injected: check your FXML file 'contracts.fxml'.";
        assert contracts_expiration_textfield != null : "fx:id=\"contracts_expiration_textfield\" was not injected: check your FXML file 'contracts.fxml'.";
        assert contracts_idcontract_textfield != null : "fx:id=\"contracts_idcontract_textfield\" was not injected: check your FXML file 'contracts.fxml'.";
        assert contracts_accountnumber_textfield != null : "fx:id=\"contracts_accountnumber_textfield\" was not injected: check your FXML file 'contracts.fxml'.";
        assert contracts_amount_textfield != null : "fx:id=\"contracts_amount_textfield\" was not injected: check your FXML file 'contracts.fxml'.";

    }
}

