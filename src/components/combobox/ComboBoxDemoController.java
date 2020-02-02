package components.combobox;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class ComboBoxDemoController implements Initializable{
	@FXML
	ComboBox<String> coursesComboBox;
	String[] course = {"Java", "iOS", "Android", "WEB"};
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<String> courseList = FXCollections.observableArrayList(course);
		coursesComboBox.setItems(courseList);
		coursesComboBox.getSelectionModel().select(0);
	}
	
	@FXML
	void selectCourse() {
		String course = coursesComboBox.getSelectionModel().getSelectedItem();
		System.out.println(course);
	}
}
