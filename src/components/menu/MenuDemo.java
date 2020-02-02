package components.menu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;

public class MenuDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		
		MenuBar menuBar = new MenuBar();
		
		Menu fileMenu = new Menu("_File");
		Menu editMenu = new Menu("Edit");
		Menu helpMenu = new Menu("Help");
		Menu projectMenu = new Menu("Project");
		
		menuBar.getMenus().addAll(fileMenu,editMenu,projectMenu,helpMenu);
		
		MenuItem nItem = new MenuItem("New");
		MenuItem oItem = new MenuItem("Open");
		MenuItem eItem = new MenuItem("Exit");
		eItem.setAccelerator(KeyCombination.keyCombination("Ctrl+x"));
		eItem.setOnAction(e -> {
			System.out.println("Exit item is clicked");
		});
		SeparatorMenuItem separatorMenuItem = new SeparatorMenuItem();
		Menu recentMenu = new Menu("Recent Files");
		MenuItem aItem = new MenuItem("File A");
		MenuItem bItem = new MenuItem("File B");
		recentMenu.getItems().addAll(aItem,bItem);
		fileMenu.getItems().addAll(nItem,oItem,recentMenu,separatorMenuItem,eItem);
		
		MenuItem copyItem = new MenuItem("Copy");
		MenuItem pasteItem = new MenuItem("Paste");
		editMenu.getItems().addAll(copyItem,pasteItem);
		
		CheckMenuItem buildItem = new CheckMenuItem("Build Automatically");
		projectMenu.getItems().add(buildItem);
		
		root.setTop(menuBar);
		Scene scene = new Scene(root,300,200);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Menu Demo");
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
