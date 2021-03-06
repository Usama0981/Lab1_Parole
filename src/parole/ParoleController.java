package parole;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import parole.model.Parole;

public class ParoleController{	
	Parole elenco;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtParola"
    private TextField txtParola; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader
    
    @FXML
    private Button btnCancella;
    
    @FXML
    private Button btnReset;
    

    @FXML // fx:id="btnInserisci"
    private Button btnInserisci; // Value injected by FXMLLoader

    @FXML
    void doCancella(ActionEvent event) {
    	if(!txtParola.getText().isEmpty()) {
    		elenco.Cancella(txtParola.getText());
    		txtResult.setText(elenco.getConvertedList());
    		txtParola.setText("");
    	}else {
    		txtResult.setText("Scrivi la parola da eliminare" + "\n\n" + "Elenco:\n" + elenco.getConvertedList());
    	}
    }
    
    @FXML
    void doInsert(ActionEvent event) {
    	if(!txtParola.getText().isEmpty()) {
    		elenco.addParola(txtParola.getText());
    		txtResult.setText(elenco.getConvertedList());
    		txtParola.setText("");
    	} else {
    		txtResult.setText("Scrivi la parola da aggiungere" + "\n\n" + "Elenco:\n" + elenco.getConvertedList());
    	}
    }
    
    @FXML
    void doReset(ActionEvent event) {
    	txtParola.setText("");
    	txtResult.setText("");
    	elenco.reset();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Parole.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Parole.fxml'.";
        assert btnCancella != null : "fx:id=\"btnCancella\" was not injected: check your FXML file 'Parole.fxml'.";
        elenco = new Parole() ;
        
    }
}
