package components.datepicker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class DatePickerDemo extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setPadding(new Insets(10));
		
		DatePicker datePicker = new DatePicker(LocalDate.now());
		// Change Format of Date
		StringConverter<LocalDate> converter = new StringConverter<LocalDate>() {

			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
			
			@Override
			public String toString(LocalDate object) {
				// TODO Auto-generated method stub
				return object.format(formatter);
			}

			@Override
			public LocalDate fromString(String string) {
				// TODO Auto-generated method stub
				return LocalDate.parse(string, formatter);
			}
		};
		datePicker.setConverter(converter);
		datePicker.setOnAction(e-> {
			LocalDate localDate = datePicker.getValue();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
			System.out.println(localDate.format(formatter));
		});
		root.getChildren().add(datePicker);
		Scene scene = new Scene(root, 250, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("DatePicker Demo");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
