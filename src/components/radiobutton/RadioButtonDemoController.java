package components.radiobutton;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class RadioButtonDemoController {
	
	@FXML
	RadioButton femaleRadioButton;
	@FXML
	RadioButton maleRadioButton;
	@FXML
	ToggleGroup group;
	
	@FXML
	void selectGender() {
		if(femaleRadioButton.isSelected()) {
			System.out.println(femaleRadioButton.getText());
		}else if(maleRadioButton.isSelected()) {
			System.out.println(maleRadioButton.getText());
		}
	}

}
