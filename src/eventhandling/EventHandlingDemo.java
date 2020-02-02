package eventhandling;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EventHandlingDemo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
//		GridPane root = new GridPane();
//		root.setPadding(new Insets(10));
//		root.setHgap(10);
//		root.setVgap(10);
//		Label xLabel = new Label("X:");
//		root.add(xLabel, 0, 0);
//		TextField xTextField = new TextField();
//		root.add(xTextField, 1, 0);
//		Label yLabel = new Label("Y:");
//		root.add(yLabel, 0, 1);
//		TextField yTextField = new TextField();
//		root.add(yTextField, 1, 1);
//		Button sumButton = new Button("Sum");
//		root.add(sumButton, 0, 2);
//		Button clearButton = new Button("Clear");
//		root.add(clearButton, 1, 2);
//		Label resultLabel = new Label();
//		GridPane.setHalignment(resultLabel, HPos.CENTER);
//		root.add(resultLabel, 0, 3, 2, 1);
//		
//		EventHandler<MouseEvent> sumEventHandler = new EventHandler<MouseEvent>() {
//			@Override
//			public void handle(MouseEvent event) {
//				// TODO Auto-generated method stub
//				int x = Integer.parseInt(xTextField.getText());
//				int y = Integer.parseInt(yTextField.getText());
//				int sum = x+y;
//				resultLabel.setText("Result of sum:"+sum);
//			}
//		};
//		sumButton.addEventHandler(MouseEvent.MOUSE_CLICKED, sumEventHandler);
//		
//		clearButton.addEventHandler(MouseEvent.MOUSE_CLICKED, e -> {
//			xTextField.clear();
//			yTextField.clear();
//			resultLabel.setText("");
//		});
//		
		Parent root = FXMLLoader.load(getClass().getResource("EventHandlingDemo.fxml"));
		
		Scene scene = new Scene(root, 250, 230);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Event Handling Demo");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
