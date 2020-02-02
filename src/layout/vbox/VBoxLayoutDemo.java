package layout.vbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxLayoutDemo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
//		VBox vBox = new VBox();
////		vBox.setSpacing(20);
//		Label txt1 = new Label("Good morning");
//		txt1.setPadding(new Insets(10,0,10,0));
//		vBox.getChildren().add(txt1);
//		Label txt2 = new Label("Good Afternoon");
//		vBox.getChildren().add(txt2);
//		Label txt3 = new Label("Good evening");
////		vBox.getChildren().add(txt3);
		
		Parent vBox = FXMLLoader.load(getClass().getResource("VBoxDemoLayout.fxml"));
		
		Scene scene = new Scene(vBox);
		primaryStage.setScene(scene);
		primaryStage.setTitle("VBox Layout Demo");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
