package layout.stackpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPaneDemo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		StackPane root = new StackPane();
		Label label1 = new Label("This is apple.");
		Label label2 = new Label("This is Elephant.");
		Label label3 = new Label("This is key.");
		Label label4 = new Label("This is macbook pro 2020.");
		root.getChildren().addAll(label1, label2, label3, label4);
		
		Scene scene = new Scene(root, 200, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("StackPane Layout");
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
