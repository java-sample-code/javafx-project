package demo.fileChooser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

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

public class FileChooserDemo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setPadding(new Insets(10));
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		
		ImageView imageView = new ImageView();
		imageView.setFitHeight(200);
		imageView.setFitWidth(200);
		InputStream is = getClass().getResourceAsStream("default.jpg");
		Image image = new Image(is);
		imageView.setImage(image);
		
		Button chooseFileButton = new Button("Browse Image");
		chooseFileButton.setOnAction(e -> {
			FileChooser fileChooser = new FileChooser();
			ExtensionFilter allFilter = new ExtensionFilter("All Files", "*.*");
			ExtensionFilter jpgFilter = new ExtensionFilter("JPEG", "*.jpg");
			ExtensionFilter pngFilter = new ExtensionFilter("PNG", "*.png");
			fileChooser.getExtensionFilters().addAll(allFilter,jpgFilter, pngFilter);
			File file = fileChooser.showOpenDialog(primaryStage);
//			System.out.println(System.getProperty("user.dir")+"/src/demo/fileChooser/"+file.getName());
//			File dest = new File(System.getProperty("user.dir")+"/src/demo/fileChooser/"+file.getName());
//			try {
//				Files.copy(file.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			Image chooseImage = new Image("file:"+file.getAbsolutePath());
			imageView.setImage(chooseImage);
		});
		
		root.getChildren().addAll(imageView, chooseFileButton);
	
		Scene scene = new Scene(root);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Demo");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
