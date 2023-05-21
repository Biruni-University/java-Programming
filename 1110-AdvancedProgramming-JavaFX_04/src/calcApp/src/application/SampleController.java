package application;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SampleController  {
	
	@FXML
	TextField firstNum, secondNum, result;
	@FXML
	Button addButton, clearButton, exitButton;
	
	public void add() {
		int res = Integer.parseInt(firstNum.getText()) + Integer.parseInt(secondNum.getText());
		result.setText(res+"");
	}
	
	public void clear() {
		firstNum.setText("");
		secondNum.setText("");
		result.setText("");
	}
	
	public void exit() {
		Platform.exit();
	}
	

}
