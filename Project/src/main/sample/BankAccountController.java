package main.sample;

        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class BankAccountController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField bankaccount_idperson_textfield;

    @FXML
    private TextField bankaccount_accountnumber_textfield;

    @FXML
    private TextField bankaccount_subgroup_textfield;

    @FXML
    private Button bankaccount_add_button;

    @FXML
    private TextField bankaccount_group_textfield;

    @FXML
    private TextField bankaccount_subnumber_textfield;

    @FXML
    private TextField bankaccount_amountof_textfield;

    @FXML
    void initialize() {
        assert bankaccount_idperson_textfield != null : "fx:id=\"bankaccount_idperson_textfield\" was not injected: check your FXML file 'bank_account.fxml'.";
        assert bankaccount_accountnumber_textfield != null : "fx:id=\"bankaccount_accountnumber_textfield\" was not injected: check your FXML file 'bank_account.fxml'.";
        assert bankaccount_subgroup_textfield != null : "fx:id=\"bankaccount_subgroup_textfield\" was not injected: check your FXML file 'bank_account.fxml'.";
        assert bankaccount_add_button != null : "fx:id=\"bankaccount_add_button\" was not injected: check your FXML file 'bank_account.fxml'.";
        assert bankaccount_group_textfield != null : "fx:id=\"bankaccount_group_textfield\" was not injected: check your FXML file 'bank_account.fxml'.";
        assert bankaccount_subnumber_textfield != null : "fx:id=\"bankaccount_subnumber_textfield\" was not injected: check your FXML file 'bank_account.fxml'.";
        assert bankaccount_amountof_textfield != null : "fx:id=\"bankaccount_amountof_textfield\" was not injected: check your FXML file 'bank_account.fxml'.";

    }
}

