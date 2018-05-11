/**
 * Sample Skeleton for 'PowerOutages.fxml' Controller Class
 */

package it.polito.tdp.poweroutages;

import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.poweroutages.model.Model;
import it.polito.tdp.poweroutages.model.Nerc;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PowerOutagesController {
	private Model model;
	private List<Nerc> nerc;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="cmbNerc"
    private ComboBox<Nerc> cmbNerc; // Value injected by FXMLLoader

    @FXML // fx:id="txtYears"
    private TextField txtYears; // Value injected by FXMLLoader

    @FXML // fx:id="txtHours"
    private TextField txtHours; // Value injected by FXMLLoader

    @FXML
    void doRun(ActionEvent event) {

    }
	
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'PowerOutages.fxml'.";
        assert cmbNerc != null : "fx:id=\"cmbNerc\" was not injected: check your FXML file 'PowerOutages.fxml'.";
        assert txtYears != null : "fx:id=\"txtYears\" was not injected: check your FXML file 'PowerOutages.fxml'.";
        assert txtHours != null : "fx:id=\"txtHours\" was not injected: check your FXML file 'PowerOutages.fxml'.";
   }
	public void setModel(Model model) {
		// TODO Auto-generated method stub
		this.model=model;
		System.out.println("ddddddddddddddddddd");
    	setComboItems();
    	System.out.println("aaaaaaaaaaaaaaaaaa");
	}

	private void setComboItems() {
		// TODO Auto-generated method stub
		// Ottieni tutti i corsi dal model
		nerc=model.getNercList();
		// Aggiungi tutti i corsi alla ComboBox
	System.out.println("aaaaaaaaaaaaaaaaaa");
		Collections.sort(nerc);
		cmbNerc.getItems().addAll(nerc);
	}
}
