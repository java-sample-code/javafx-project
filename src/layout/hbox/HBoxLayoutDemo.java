package layout.hbox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxLayoutDemo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		HBox root = new HBox();
		root.setSpacing(15);
		Label lb1 = new Label("Hello");
		Label lb2 = new Label("Hello");
		Label lb3 = new Label("Hello");
		Label lb4 = new Label("Hello");
		Label lb5 = new Label("Hello");
		Label lb6 = new Label("Hello");
		root.getChildren().addAll(lb1,lb2,lb3,lb4,lb5,lb6);
		
		Scene scene = new Scene(root, 300, 150);
		primaryStage.setScene(scene);
		primaryStage.setTitle("HBox Layout Demo");
		primaryStage.show();
	}
		
	public static void main(String[] args) {
		launch(args);
	}
}
