package components.progressview;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ProgressViewDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FlowPane root = new FlowPane();
		root.setPadding(new Insets(5));
		root.setHgap(10);
		
		ProgressBar progressBar = new ProgressBar();
		ProgressIndicator progressIndicator = new ProgressIndicator();
		Button startButton = new Button("Start");
		
		EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				// TODO Auto-generated method stub
				Task<Object> task = new Task<Object>() {

					@Override
					protected Object call() throws Exception {
						// TODO Auto-generated method stub
						for (int i = 1; i <= 100; i++) {
							Thread.sleep(100);
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
			}
		
		};
		startButton.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
		startButton.setTooltip(new Tooltip("start the process"));
		
		root.getChildren().addAll(progressBar,progressIndicator,startButton);
		Scene scene = new Scene(root, 300, 100);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Progress Demo");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
