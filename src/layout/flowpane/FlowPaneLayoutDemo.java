package layout.flowpane;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneLayoutDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane root = new FlowPane();
		root.setHgap(10);
		root.setVgap(10);
		root.setOrientation(Orientation.VERTICAL);
		Label txt1 = new Label("Today is sunday.");
		root.getChildren().add(txt1);
		Label txt2 = new Label("Today is sunday.");
		root.getChildren().add(txt2);
		Label txt3 = new Label("Today is sunday.");
		root.getChildren().add(txt3);
		Label txt4 = new Label("Today is sunday.");
		root.getChildren().add(txt4);
		
		Scene scene = new Scene(root, 250, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("FlowPane Demo");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
