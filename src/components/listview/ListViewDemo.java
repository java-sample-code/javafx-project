package components.listview;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewDemo extends Application {
	
	ArrayList<String> courses = new ArrayList<>();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setPadding(new Insets(10));
		root.setSpacing(10);
		
		TextField courseTextField = new TextField();
		courseTextField.setPromptText("enter new course");
		Button addButton = new Button("Add new course");
		ListView<String> listView = new ListView<>();
		root.getChildren().addAll(courseTextField, addButton, listView);
		
		addButton.setOnAction(e -> {
			String course = courseTextField.getText();
			courses.add(course);
			ObservableList<String> courseList = FXCollections.observableArrayList(courses);
			listView.setItems(courseList);
			courseTextField.clear();
		});
		
		listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				String selectItem = listView.getSelectionModel().getSelectedItem();
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setHeaderText(null);
				alert.setContentText(selectItem);
				alert.show();
				
			}
		});
		
		Scene scene = new Scene(root, 250, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("ListView Demo");
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
