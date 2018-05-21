package main.sample.Controllers;

        import java.net.URL;
        import java.util.ResourceBundle;
        import javafx.fxml.FXML;
        import javafx.scene.control.Button;
        import javafx.scene.control.TextField;

public class DepositOperationsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField depositoperation_idcontract_textfield;

    @FXML
    private Button depositoperation_add_button;

    @FXML
    private TextField depositoperation_amount_textfield;

    @FXML
    private TextField depositoperation_dataofoperation_textfield;

    @FXML
    private TextField depositoperation_typeoftransaction_textfield;

    @FXML
    private TextField depositoperation_idoperation_textfield;

    @FXML
    void initialize() {
        assert depositoperation_idcontract_textfield != null : "fx:id=\"depositoperation_idcontract_textfield\" was not injected: check your FXML file 'deposit_operations.fxml'.";
        assert depositoperation_add_button != null : "fx:id=\"depositoperation_add_button\" was not injected: check your FXML file 'deposit_operations.fxml'.";
        assert depositoperation_amount_textfield != null : "fx:id=\"depositoperation_amount_textfield\" was not injected: check your FXML file 'deposit_operations.fxml'.";
        assert depositoperation_dataofoperation_textfield != null : "fx:id=\"depositoperation_dataofoperation_textfield\" was not injected: check your FXML file 'deposit_operations.fxml'.";
        assert depositoperation_typeoftransaction_textfield != null : "fx:id=\"depositoperation_typeoftransaction_textfield\" was not injected: check your FXML file 'deposit_operations.fxml'.";
        assert depositoperation_idoperation_textfield != null : "fx:id=\"depositoperation_idoperation_textfield\" was not injected: check your FXML file 'deposit_operations.fxml'.";

    }
}
