package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Cont implements Initializable{
	
	//Scores
	static int xScore=0, oScore=0, draws=0, timesPlayed=0;
	
	
	//PANES
	@FXML AnchorPane PaneTiles;
	@FXML AnchorPane PaneOver;
	
	
	
	//String value = "X";
	int value = 0;
	boolean gameWon=false;
	boolean draw=false;
	
	
	@FXML Label LabelLog;
	@FXML Label LabelScore;
	@FXML Label LabelScore1;
	
	@FXML Button b1;
	@FXML Button b2;
	@FXML Button b3;
	@FXML Button b4;
	@FXML Button b5;
	@FXML Button b6;
	@FXML Button b7;
	@FXML Button b8;
	@FXML Button b9;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
		
	}
	
	@FXML 
	
	public void buttonAction(ActionEvent e){
		
		if (gameWon==false ){
	Button ch = (Button) e.getSource();
	
	if(value==0 && ch.getText().isEmpty()){
		ch.setText("X");
		value=1;
	}
	
	else if(value==1 && ch.getText().isEmpty()){
		ch.setText("O");
		value=0;
	}
	
	//checkWin();
	if(!b1.getText().isEmpty() && !b2.getText().isEmpty()   && !b3.getText().isEmpty()  && !b4.getText().isEmpty()   && !b5.getText().isEmpty()  && !b6.getText().isEmpty()   && !b7.getText().isEmpty()  && !b8.getText().isEmpty()   && !b9.getText().isEmpty() && gameWon==false){
		System.out.println("Draw");
		draw=true;
		draws++;
		
		//timesPlayed++;
	}
	
	if(checkWin()==true || draw==true){
		
		System.out.println("Won");
		String winner=value==0?"X":"0";
		if (value==0 && gameWon==true && draw==false){
			oScore++;
			winner="X";
		}else if(value==1 && gameWon==true && draw==false){
			xScore++;
			winner="O";
		}
		
		
		else{
			System.out.println("NoBody Won");
		}
		timesPlayed++;
		LabelLog.setText(gameWon?winner + " PLAYS FIRST":winner+ " PLAYS FIRST");
		LabelScore.setText("SCORE:"+"    X= "+xScore+"    O= "+oScore);
		LabelScore1.setText("DRAWS: "+ draws + " TIMES PLAYED: " + timesPlayed);
		PaneOver.toFront();
	}
	
	}}
	
	public boolean checkWin(){
		
		
		///x part///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		if(b1.getText().contains("X") && b2.getText().contains("X") && b3.getText().contains("X") ){
			
			System.out.println("X has Won");
			gameWon=true;
		}
		
	if(b1.getText().contains("X") && b4.getText().contains("X") && b7.getText().contains("X") ){
			
			System.out.println("X has Won");
			gameWon=true;
		}
	
	if(b1.getText().contains("X") && b5.getText().contains("X") && b9.getText().contains("X") ){
		
		System.out.println("X has Won"); gameWon=true;
	}
	
	if(b4.getText().contains("X") && b5.getText().contains("X") && b6.getText().contains("X") ){
		
		System.out.println("X has Won"); gameWon=true;
	}
	if(b7.getText().contains("X") && b8.getText().contains("X") && b9.getText().contains("X") ){
		
		System.out.println("X has Won"); gameWon=true;
	}
	if(b3.getText().contains("X") && b5.getText().contains("X") && b7.getText().contains("X") ){
		
		System.out.println("X has Won"); gameWon=true;
	}
	
	if(b2.getText().contains("X") && b5.getText().contains("X") && b8.getText().contains("X") ){
		
		System.out.println("X has Won"); gameWon=true;
	}
	
	if(b3.getText().contains("X") && b6.getText().contains("X") && b9.getText().contains("X") ){
		
		System.out.println("X has Won"); gameWon=true;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	
	
	////////////O part
	
	
		if(b1.getText().contains("O") && b2.getText().contains("O") && b3.getText().contains("O") ){
			
			System.out.println("O has Won");
			gameWon=true;
		}
		
	if(b1.getText().contains("O") && b4.getText().contains("O") && b7.getText().contains("O") ){
			
			System.out.println("O has Won");
			gameWon=true;
		}
	
	if(b1.getText().contains("O") && b5.getText().contains("O") && b9.getText().contains("O") ){
		
		System.out.println("O has Won"); gameWon=true;
	}
	
	if(b4.getText().contains("O") && b5.getText().contains("O") && b6.getText().contains("O") ){
		
		System.out.println("O has Won"); gameWon=true;
	}
	if(b7.getText().contains("O") && b8.getText().contains("O") && b9.getText().contains("O") ){
		
		System.out.println("O has Won"); gameWon=true;
	}
	if(b3.getText().contains("O") && b5.getText().contains("O") && b7.getText().contains("O") ){
		
		System.out.println("O has Won"); gameWon=true;
	}
	
	if(b2.getText().contains("O") && b5.getText().contains("O") && b8.getText().contains("O") ){
		
		System.out.println("O has Won"); gameWon=true;
	}
	
	if(b3.getText().contains("O") && b6.getText().contains("O") && b9.getText().contains("O") ){
		
		System.out.println("O has Won"); gameWon=true;
	}
	
	
	
	return gameWon;
	}

	@FXML
	public void playAgain(ActionEvent e){
		
		resetButtons();
		PaneTiles.toFront();
		gameWon=false;	
		draw=false;
			
	
	}
	@FXML
	
	public void resetGame(ActionEvent e){
		
		xScore=0;
		oScore=0;
		gameWon=false;
		draws=0;
		timesPlayed=0;
		LabelScore.setText("SCORE:"+"    X= "+xScore+"    O= "+oScore);
		LabelScore1.setText("DRAWS: "+ draws + " TIMES PLAYED: " + timesPlayed);
	}
	
	public void resetButtons(){
		b1.setText("");
		
		
		b2.setText("");
		b3.setText("");			
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
	}
}
