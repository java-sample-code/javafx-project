package demo.passwordfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class PasswordFieldDemo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane root = new FlowPane();
		PasswordField passwordField = new PasswordField();
		passwordField.setPromptText("Input your password");
		root.getChildren().add(passwordField);
		Scene scene = new Scene(root, 150,250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Demo");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
