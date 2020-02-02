package components.colorpicker;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ColorPickerDemoController {
	
	@FXML
	Circle circle;
	@FXML
	ColorPicker colorPicker;
	
	@FXML
	public void changeColor() {
		Color color = colorPicker.getValue();
		circle.setFill(color);
	}
}
