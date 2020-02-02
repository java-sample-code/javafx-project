package components.textfield;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TextFeildDemo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
//		GridPane root = new GridPane();
//		root.setPadding(new Insets(10));
//		root.setVgap(5);
//		root.setHgap(10);
//		
//		Label usernameLabel = new Label("Username:");
//		root.add(usernameLabel, 0, 0);
//		TextField usernameTextField = new TextField();
//		usernameTextField.setPromptText("Enter username");
//		root.add(usernameTextField, 1, 0);
//		Label passwordLabel = new Label("Password:");
//		root.add(passwordLabel, 0, 1);
//		PasswordField passwordField = new PasswordField();
//		passwordField.setPromptText("Enter password");
//		root.add(passwordField, 1, 1);
//		Button loginButton = new Button("Login");
//		root.add(loginButton, 0, 2, 2, 1);
//		GridPane.setHalignment(loginButton, HPos.CENTER);
//		
//		loginButton.setOnAction(e ->{
//			String username = usernameTextField.getText();
//			String pwd = passwordField.getText();
//			System.out.println(username +" "+pwd);
//			
//		});
		
		
		Parent root = FXMLLoader.load(getClass().getResource("TextFieldDemo.fxml"));;
		
		Scene scene = new Scene(root, 270, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Tf & Pf Demo");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
