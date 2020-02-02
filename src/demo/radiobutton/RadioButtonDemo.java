package demo.radiobutton;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class RadioButtonDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
//		Label txt = new Label("Choose your gender:");
//	
//		ToggleGroup group = new ToggleGroup();
//		RadioButton male = new RadioButton("Male");
//		male.setToggleGroup(group);
//		RadioButton female = new RadioButton("Female");
//		female.setToggleGroup(group);
//		
//		FlowPane root = new FlowPane();
//		root.setPadding(new Insets(10));
//		root.setHgap(10);
//		root.getChildren().addAll(txt, male, female);
		Parent root = FXMLLoader.load(getClass().getResource("RadioButtonDemo.fxml"));
		
		Scene scene = new Scene(root, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("RadioButton");
		primaryStage.show();
		
//		group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
//			@Override
//			public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
//				// TODO Auto-generated method stub
//				if(group.getSelectedToggle() != null) {
//					RadioButton radioButton = (RadioButton) group.getSelectedToggle();
//					System.out.println(radioButton.getText());
//				}
//			}
//		});
	}
	public static void main(String[] args) {
		launch(args);
	}
}
