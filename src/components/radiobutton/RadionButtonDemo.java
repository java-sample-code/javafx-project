package components.radiobutton;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RadionButtonDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
//		Label txt = new Label("Select your gender:");
//		RadioButton female = new RadioButton("Female");
//		RadioButton male = new RadioButton("Male");
//		ToggleGroup group = new ToggleGroup();
//		female.setSelected(true);
//		female.setToggleGroup(group);
//		male.setToggleGroup(group);
//		Button select = new Button("Select");
//		select.setOnAction(e -> {
//			if(female.isSelected()) {
//				System.out.println(female.getText());
//			}else if(male.isSelected()){
//				System.out.println(male.getText());
//			}
//		});
//		
//		FlowPane root = new FlowPane();
//		root.setPadding(new Insets(10));
//		root.setHgap(10);
//		root.setVgap(10);
//		root.getChildren().addAll(txt,female,male,select);
		
		Parent root = FXMLLoader.load(getClass().getResource("RadioButtonDemo.fxml"));
		
		Scene scene = new Scene(root, 300, 270);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Radio Button");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
