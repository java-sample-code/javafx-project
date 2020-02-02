package components.colorpicker;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ColorPickerDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane root = new FlowPane();
		root.setPadding(new Insets(10));
		root.setHgap(10);
		
		Circle circle = new Circle(50);
		circle.setFill(Color.RED);
		
		ColorPicker colorPicker = new ColorPicker();
		colorPicker.setOnAction(e -> {
			Color color = colorPicker.getValue();
			circle.setFill(color);
		});
		
		root.getChildren().addAll(circle,colorPicker);
		Scene scene = new Scene(root, 300, 150);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ColorPicker Demo");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
