package layout.GridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneLayout extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane root = new GridPane();
		root.setPadding(new Insets(10));
		root.setHgap(10);
		root.setVgap(10);
		Label emaiLabel = new Label("Email");
		root.add(emaiLabel, 0, 0);
		TextField emaiTextField = new TextField();
		root.add(emaiTextField, 1, 0);
		Label passwordLabel = new Label("Password");
		root.add(passwordLabel, 0, 1);
		PasswordField passwordField = new PasswordField();
		root.add(passwordField, 1, 1);
		
		Button submitButton = new Button("Submit");
		root.add(submitButton, 0, 2);
		Button cancelButton = new Button("Cancel");
		root.add(cancelButton, 1, 2);
		
		Scene scene = new Scene(root, 250,  200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
