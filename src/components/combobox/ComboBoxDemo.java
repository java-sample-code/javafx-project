package components.combobox;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ComboBoxDemo extends Application{
	
	String[] course = {"Java", "iOS", "Android", "Web"};
	
	@Override
	public void start(Stage primaryStage) throws Exception {
//		FlowPane root = new FlowPane();
//		root.setPadding(new Insets(10));
//		root.setHgap(10);
//		root.setVgap(10);
//		Label txtLabel = new Label("Choose course:");
//		ComboBox<String> coursesComboBox = new ComboBox<>();
//		ObservableList<String> courseList = FXCollections.observableArrayList(course);
//		coursesComboBox.setItems(courseList);
//		coursesComboBox.getSelectionModel().select(0);
//		
//		Button selectButton = new Button("Select");
//		selectButton.setOnAction(e -> {
//			String course = coursesComboBox.getSelectionModel().getSelectedItem();
//			System.out.println(course);
//		});
//		
//		root.getChildren().addAll(txtLabel,coursesComboBox,selectButton);
		
		Parent root = FXMLLoader.load(getClass().getResource("ComboBoxDemo.fxml"));
		Scene scene = new Scene(root, 300, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ComboBox Demo");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
