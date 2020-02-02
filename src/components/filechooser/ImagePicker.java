package components.filechooser;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;

public class ImagePicker extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setPadding(new Insets(10));
		root.setSpacing(10);
		root.setAlignment(Pos.CENTER);
		
		Image image = new Image(getClass().getResourceAsStream("default.jpg"));
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(200);
		imageView.setFitWidth(200);
		
		Button browseButton = new Button("Browse Image");
		browseButton.setOnAction(e -> {
			FileChooser fileChooser = new FileChooser();
			fileChooser.setTitle("Choose your image file");
			ExtensionFilter jpgFilter = new ExtensionFilter("JPEG Files", "*.jpg");
			ExtensionFilter pngFilter = new ExtensionFilter("PNG Files", "*.png");
			fileChooser.getExtensionFilters().addAll(jpgFilter,pngFilter);
			File file = fileChooser.showOpenDialog(primaryStage);
			Image selectedImage = new Image("file:"+file.getAbsolutePath());
			imageView.setImage(selectedImage);
		});
		
		root.getChildren().addAll(imageView, browseButton);
		Scene scene = new Scene(root, 220, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Image Picker");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
