package demo.radiobutton;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class RadioButtonController implements Initializable  {
	
	@FXML
	RadioButton female;
	@FXML
	RadioButton male;
	@FXML
	ToggleGroup group;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
//		group.selectedToggleProperty().addListener(e -> {
//			RadioButton radioButton = (RadioButton) group.getSelectedToggle();
//			System.out.println(radioButton.getText());
//		});
	}

	@FXML
	public void getGender() {
		if(male.isSelected()) {
			System.out.println(male.getText());
		}else if(female.isSelected()){
			System.out.println(female.getText());
		}
	}
}
