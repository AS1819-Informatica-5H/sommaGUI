/**
 * Sample Skeleton for 'SommaView.fxml' Controller Class
 */

package Somma.GUI;

import java.net.URL;
import java.util.ResourceBundle;

import Somma.Model.Somma;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SommaController {
	
	private Somma model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtNumero1"
    private TextField txtNumero1; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumero2"
    private TextField txtNumero2; // Value injected by FXMLLoader

    @FXML // fx:id="btnCacola"
    private Button btnCacola; // Value injected by FXMLLoader

    @FXML // fx:id="txtRisultato"
    private TextField txtRisultato; // Value injected by FXMLLoader

    @FXML
    void onCalcola(ActionEvent event) {
    	model.setNumero1(Integer.parseInt(txtNumero1.getText()));
    	model.setNumero2(Integer.parseInt(txtNumero2.getText()));
    	txtRisultato.setText(String.format("%d",model.GetSomma()));
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtNumero1 != null : "fx:id=\"txtNumero1\" was not injected: check your FXML file 'SommaView.fxml'.";
        assert txtNumero2 != null : "fx:id=\"txtNumero2\" was not injected: check your FXML file 'SommaView.fxml'.";
        assert btnCacola != null : "fx:id=\"btnCacola\" was not injected: check your FXML file 'SommaView.fxml'.";
        assert txtRisultato != null : "fx:id=\"txtRisultato\" was not injected: check your FXML file 'SommaView.fxml'.";

    }

	public void setModel(Somma model) {
		this.model = model;
	}
    
    
}
