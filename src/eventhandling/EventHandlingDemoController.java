package eventhandling;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class EventHandlingDemoController {
	
	@FXML
	TextField xTextField;
	@FXML
	TextField yTextField;
	@FXML
	Label resultLabel;
	
	@FXML
	public void sum() {
		int x = Integer.parseInt(xTextField.getText());
		int y = Integer.parseInt(yTextField.getText());
		int sum = x+y;
		resultLabel.setText("Result of sum: "+sum);
	}
	
	@FXML
	public void clear() {
		xTextField.clear();
		yTextField.clear();
		resultLabel.setText("");
	}
	
}
