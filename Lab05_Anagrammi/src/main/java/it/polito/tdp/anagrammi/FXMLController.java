package it.polito.tdp.anagrammi;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	private Model model;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnCalcola;

    @FXML
    private TextArea txtAC;

    @FXML
    private TextArea txtAE;

    @FXML
    private Button btnReset;

    @FXML
    void doCalcola(ActionEvent event) {
    	String parola = txtParola.getText();
    	this.model.anagrammi(parola);
    	for(String s : this.model.getSoluzione()) {
    		txtAC.appendText(s+"\n");
    	}
    	for(String s : this.model.getSbagliati()) {
    		txtAE.appendText(s+"\n");
    	}
    }

    @FXML
    void doReset(ActionEvent event) {
    	txtParola.clear();
    	txtAC.clear();
    	txtAE.clear();
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAC != null : "fx:id=\"txtAC\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtAE != null : "fx:id=\"txtAE\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

    }
    
    public void setModel(Model model) {
    	this.model = model;
    }
    
}
