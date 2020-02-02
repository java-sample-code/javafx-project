package demo.listview;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ListViewDemo extends Application{

	ArrayList<String> list = new ArrayList<>();
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setPadding(new Insets(10));
		root.setSpacing(5);
		TextField courseTextField = new TextField();
		courseTextField.setPromptText("input course name");
		Button addButton = new Button("Add New Course");
		ListView<String> listView = new ListView<>();
		root.getChildren().addAll(courseTextField, addButton, listView);
		
		addButton.setOnAction(e -> {
			String txt = courseTextField.getText();
			list.add(txt);
			ObservableList<String> courseList = FXCollections.observableArrayList(list);
			listView.setItems(courseList);
			courseTextField.clear();
			courseTextField.requestFocus();
		});
		
		listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setHeaderText(null);
				alert.setContentText(listView.getSelectionModel().getSelectedItem());
				alert.show();
			}
		});
		
		Scene scene = new Scene(root, 250, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Demo");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
