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
		
		
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
