package components.button;

import java.io.InputStream;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ButtonDemo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		InputStream imageStream = getClass().getResourceAsStream("/resources/emoji.png");
		Image image = new Image(imageStream);
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(18);
		imageView.setFitWidth(18);
		Button myButton = new Button();
		myButton.setGraphic(imageView);
		myButton.setContentDisplay(ContentDisplay.RIGHT);
		
		BorderPane root = new BorderPane(myButton);
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Button");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
