package layout.borderpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneLayoutDemo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
//			BorderPane root = new BorderPane();
//			Label textLabel = new Label("Center");
//			root.setCenter(textLabel);
//			
//			Label topText = new Label();
//			topText.setText("Top");
//			root.setTop(topText);
//			BorderPane.setAlignment(topText, Pos.CENTER);
			
			Parent root = FXMLLoader.load(getClass().getResource("BorderPaneLayout.fxml"));
			
			Scene scene = new Scene(root, 300, 300);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Border pane layout");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
