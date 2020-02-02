package layout.tilepane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneLayoutDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		TilePane root = new TilePane();
		Label txt1 = new Label("Monday");
		Label txt2 = new Label("Tuesday");
		Label txt3 = new Label("Wednesday");
		Label txt4 = new Label("Thursday");
		Label txt5 = new Label("Friday");
		Label txt6 = new Label("Saturday");
		Label txt7 = new Label("Sunday");
		root.getChildren().addAll(txt1,txt2,txt3,txt4,txt5,txt6,txt7);
		
		Scene scene = new Scene(root, 250, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TilePane Layout");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
