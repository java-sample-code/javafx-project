package demo.progress;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ProgressDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane root = new FlowPane();
		root.setPadding(new Insets(10));
		root.setHgap(10);
		ProgressBar progressBar = new ProgressBar();
		ProgressIndicator progressIndicator = new ProgressIndicator();
		Button startButton = new Button("Start");
		root.getChildren().addAll(progressBar, progressIndicator, startButton);
		
		startButton.setOnAction(e -> {
			Task<Object> task = new Task<Object>() {

				@Override
				protected Object call() throws Exception {
					// TODO Auto-generated method stub
					for(int i=1;i<=100;i++) {
						Thread.sleep(1000);
						updateProgress(i, 100);
					}
					return true;
				}
			};
			progressBar.progressProperty().unbind();
			progressBar.progressProperty().bind(task.progressProperty());
			progressIndicator.progressProperty().unbind();
			progressIndicator.progressProperty().bind(task.progressProperty());
			
			new Thread(task).start();
		});
		
		
		Scene scene = new Scene(root, 300, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Demo");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
