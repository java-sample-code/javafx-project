package demo.datepicker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;

public class DatePickerDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane root = new FlowPane();
		root.setPadding(new Insets(10));
		
		DatePicker datePicker = new DatePicker();
		datePicker.setValue(LocalDate.now());
		datePicker.setConverter(new StringConverter<LocalDate>() {
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
			@Override
			public String toString(LocalDate object) {
				if(object != null) {
					return dateTimeFormatter.format(object);
				}else {
					return "";
				}
				
			}
			
			@Override
			public LocalDate fromString(String string) {
				// TODO Auto-generated method stub
				if(string != null && !string.isEmpty()) {
					return LocalDate.parse(string, dateTimeFormatter);
				}else {
					return null;
				}
				
			}
		});
		datePicker.setShowWeekNumbers(true);
		datePicker.setOnAction(e -> {
			LocalDate localDate = datePicker.getValue();
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
			String dateString = localDate.format(dtf);
			System.out.println(dateString);
		});
		
		root.getChildren().add(datePicker);
		
		Scene scene = new Scene(root, 200, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Demo");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
