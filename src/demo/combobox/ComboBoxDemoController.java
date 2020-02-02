package demo.combobox;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class ComboBoxDemoController implements Initializable {
	
	@FXML
	ComboBox<String> coursesComboBox;
	
	String courses[] = {"Java", "iOS", "Android"};
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		ObservableList<String> courseList = FXCollections.observableArrayList(courses);
		coursesComboBox.setItems(courseList);
		
		coursesComboBox.getSelectionModel().select(0);
	}
	
	@FXML
	void submit() {
		String txt = coursesComboBox.getSelectionModel().getSelectedItem();
		System.out.println(txt);
	}

}
