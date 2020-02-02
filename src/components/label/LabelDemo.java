package components.label;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LabelDemo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		Label text = new Label();
		text.setText("Label Demo");
		text.setFont(Font.font("Times", 30));
		text.setTextFill(Color.RED);
		
		text.setOnMouseEntered(e -> {
			text.setRotate(45);
			text.setTextFill(Color.AQUAMARINE);
		});
		
		BorderPane root = new BorderPane(text);
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Label Demo");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
