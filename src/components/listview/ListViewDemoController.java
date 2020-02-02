package components.listview;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ListViewDemoController implements Initializable {
	
	@FXML
	TextField courseTextField;
	@FXML
	ListView<String> courseListView;
	
	ArrayList<String> list = new ArrayList<>();
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		courseListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
			@Override
			public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setHeaderText("Course Info");
				alert.setTitle("Info");
				String course = courseListView.getSelectionModel().getSelectedItem();
				alert.setContentText(course);
				alert.show();
			}
		
		});
		
	}
	
	
	@FXML
	public void addCourse() {
		String course = courseTextField.getText();
		list.add(course);
		
		ObservableList<String> observableList = FXCollections.observableArrayList(list);
		courseListView.setItems(observableList);
		courseTextField.clear();
		courseTextField.requestFocus();
	}
}
