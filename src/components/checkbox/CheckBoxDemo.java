package components.checkbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CheckBoxDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane root = new FlowPane();
		root.setPadding(new Insets(10));
		root.setVgap(10);
		root.setHgap(10);
		Label txtLabel = new Label("Select your favourite sports:");
		CheckBox footballCheckBox = new CheckBox("Football");
		CheckBox tennisCheckBox = new CheckBox("Tennis");
		CheckBox baseBallCheckBox = new CheckBox("Baseball");
		CheckBox volleyballCheckBox = new CheckBox("Volleyball");
		Button selectButton = new Button("Select");
		root.getChildren().addAll(txtLabel, footballCheckBox, tennisCheckBox, baseBallCheckBox, volleyballCheckBox, selectButton);
		
		
		selectButton.setOnAction(e -> {
			String selectSports = "";
			if (footballCheckBox.isSelected()) {
				selectSports += (footballCheckBox.getText()+"\t");
			}
			if (tennisCheckBox.isSelected()) {
				selectSports += (tennisCheckBox.getText()+"\t");
			}
			if (baseBallCheckBox.isSelected()) {
				selectSports += (baseBallCheckBox.getText()+"\t");
			}
			if (volleyballCheckBox.isSelected()) {
				selectSports += (volleyballCheckBox.getText()+"\t");
			}
			System.out.println(selectSports);
		});
		
		Scene scene = new Scene(root, 350, 200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("CheckBox Demo");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
