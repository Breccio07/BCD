package it.edu.iisgubbio;

import java.util.Hashtable;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BCD extends Application{

	TextField tNumero= new TextField();
	
	Label lRisultato= new Label();
	public void start(Stage finestra){

		GridPane griglia= new GridPane();
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		Scene scena = new Scene(griglia, 300, 250);
		
		finestra.setScene(scena);
		finestra.setTitle("BCD");
		finestra.show();
		
		Label lNumero= new Label("Inserire numero");
		Label lBCD= new Label("numero in BCD");
		
		Button pConverti= new Button("CONVERTI");
		
		griglia.add(lNumero, 0, 0);
		griglia.add(tNumero, 0, 1);
		griglia.add(pConverti, 0, 2);
		griglia.add(lBCD, 0, 3);
		griglia.add(lRisultato, 0, 4);
		
		pConverti.setOnAction(e -> Converti());

	}

		private void Converti() {
		
		String vS[]= tNumero.getText().split(""), BCD="";
		
		Hashtable <String,String> converti =  new Hashtable <String,String>();
		
		converti.put("0", "0000");
		converti.put("1", "0001");
		converti.put("2", "0010");
		converti.put("3", "0011");
		converti.put("4", "0100");
		converti.put("5", "0101");
		converti.put("6", "0110");
		converti.put("7", "0111");
		converti.put("8", "1000");
		converti.put("9", "1001");
		
		for(int i=0; i < vS.length; i++) {
			
			BCD += converti.get(vS[i]);			
		}
		lRisultato.setText(BCD);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
