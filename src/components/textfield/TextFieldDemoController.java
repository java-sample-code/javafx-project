package components.textfield;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class TextFieldDemoController {
	@FXML
	TextField usernameTextField;
	@FXML
	PasswordField passwordField;
	
	@FXML 
	public void Login() {
		String username = usernameTextField.getText();
		String pwd = passwordField.getText();
		System.out.println(username +" "+pwd);
	}
}
