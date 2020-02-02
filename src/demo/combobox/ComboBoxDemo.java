package demo.combobox;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Skin;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application{
	
	String[] courses = {"Java", "iOS", "Android"};
	
	@Override
	public void start(Stage primaryStage) throws Exception {
//		Label txt = new Label("Select course:");
//		ObservableList<String> items = FXCollections.observableArrayList(courses);
//		ComboBox<String> comboBox = new ComboBox<>(items);
//		comboBox.getSelectionModel().select(0);
//		
//		Button submit = new Button("Submit");
//		submit.setOnAction(EventHandler -> {
//			String course = comboBox.getSelectionModel().getSelectedItem();
//			System.out.println(course);
//		});
//		
//		FlowPane root = new FlowPane();
//		root.setPadding(new Insets(10));
//		root.setHgap(10);
//		root.getChildren().addAll(txt,comboBox,submit);
		
		Parent root = FXMLLoader.load(getClass().getResource("ComboBoxDemo.fxml"));
		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
