package javafx_css;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Demo1 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox root = new HBox();
		root.setPadding(new Insets(10));
		root.setSpacing(10);
		
		Button addButton = new Button("ADD");
//		addButton.setStyle("-fx-background-color:green;-fx-text-fill:white");
		addButton.setId("add-button");
		addButton.getStyleClass().add("my-button");
		Button closeButton = new Button("CLOSE");
		closeButton.getStyleClass().add("my-button");
		
		root.getChildren().addAll(addButton,closeButton);
		
		Scene scene = new Scene(root, 200, 100);
		scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Demo CSS");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
