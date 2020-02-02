package demo.css;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LoginScreen extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root = new AnchorPane();
		
		Image closeImage = new Image(getClass().getResourceAsStream("/resources/error.png"));
		ImageView closeImageView = new ImageView(closeImage);
		closeImageView.setFitHeight(15);
		closeImageView.setFitWidth(15);
		closeImageView.setOnMouseClicked(e -> {
			primaryStage.close();
		});
		AnchorPane.setTopAnchor(closeImageView, 10.0);
		AnchorPane.setRightAnchor(closeImageView,10.0);
		
		
		Image loginImage = new Image(getClass().getResourceAsStream("/resources/login.png"));
		ImageView loginImageView = new ImageView(loginImage);
		loginImageView.setFitHeight(100);
		loginImageView.setFitWidth(100);
		HBox box1 = new HBox(loginImageView);
		box1.setAlignment(Pos.CENTER);
		AnchorPane.setTopAnchor(box1, 10.0);
		AnchorPane.setLeftAnchor(box1, 0.0);
		AnchorPane.setRightAnchor(box1, 0.0);
		
		HBox box2 = new HBox();
		box2.setPadding(new Insets(8));
		box2.setSpacing(10);
		box2.setAlignment(Pos.CENTER);
		Label usernameLabel = new Label("Username:");
		TextField usernameTextField = new TextField();
		usernameTextField.setPromptText("Input username");
		box2.getChildren().addAll(usernameLabel,usernameTextField);
		HBox.setHgrow(usernameTextField, Priority.ALWAYS);
		AnchorPane.setTopAnchor(box2, 100.0);
		AnchorPane.setLeftAnchor(box2, 0.0);
		AnchorPane.setRightAnchor(box2, 0.0);
		
		HBox box3 = new HBox();
		box3.setPadding(new Insets(8));
		box3.setSpacing(10);
		box3.setAlignment(Pos.CENTER);
		Label passwordLabel = new Label("Password:");
		PasswordField passwordField = new PasswordField();
		passwordField.setPromptText("Input password");
		box3.getChildren().addAll(passwordLabel,passwordField);
		HBox.setHgrow(passwordField, Priority.ALWAYS);
		AnchorPane.setTopAnchor(box3, 140.0);
		AnchorPane.setLeftAnchor(box3, 0.0);
		AnchorPane.setRightAnchor(box3, 0.0);
		
		HBox box4 = new HBox();
		box4.setPadding(new Insets(8));
		box4.setSpacing(10);
		box4.setAlignment(Pos.CENTER);
		Button loginButton = new Button("Login");
		loginButton.setId("login-button");
		Button cancelButton = new Button("Cancel");
		cancelButton.setId("cancel-button");
		box4.getChildren().addAll(loginButton,cancelButton);
		AnchorPane.setTopAnchor(box4, 190.0);
		AnchorPane.setLeftAnchor(box4, 0.0);
		AnchorPane.setRightAnchor(box4, 0.0);
		
		root.getChildren().addAll(box1, box2, box3, box4,closeImageView);
		Scene scene = new Scene(root, 325, 250);
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Login Screen");
		primaryStage.initStyle(StageStyle.TRANSPARENT);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
