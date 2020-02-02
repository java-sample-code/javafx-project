package demo.label;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LabelDemo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label myLabel = new Label();
		myLabel.setText("My Label");
		myLabel.setFont(Font.font("Times", 30));
		myLabel.setTextFill(Color.BLUE);
		myLabel.setRotate(45);
		
		BorderPane root = new BorderPane(myLabel);
		Scene scene = new Scene(root,300,400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Label Demo");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
