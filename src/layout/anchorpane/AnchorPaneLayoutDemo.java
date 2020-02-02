package layout.anchorpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneLayoutDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root = new AnchorPane();
		Label txt = new Label("Anchor Pane Demo");
		AnchorPane.setTopAnchor(txt, 20.0);
		AnchorPane.setLeftAnchor(txt, 100.0);
		root.getChildren().add(txt);
		Label txt1 = new Label("Welcome to Anchor Pane");
		root.getChildren().add(txt1);
		
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("AnchorPane layout");
		primaryStage.show();
	
	}
	public static void main(String[] args) {
		launch(args);
	}
}
