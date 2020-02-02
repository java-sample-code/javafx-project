package demo.menu;

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

public class MenuDemo extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		MenuBar menuBar = new MenuBar();
		
		Menu fileMenu = new Menu("File");
		Menu editMenu = new Menu("Edit");
		Menu helpMenu = new Menu("Help");
		Menu projectMenu = new Menu("Project");
		
		menuBar.getMenus().addAll(fileMenu, editMenu,projectMenu, helpMenu);
		
		MenuItem newItem = new MenuItem("New");
		MenuItem openItem = new MenuItem("Open");
		MenuItem exitItem = new MenuItem("Exit");
		exitItem.setAccelerator(KeyCombination.keyCombination("Ctrl+x"));
		SeparatorMenuItem separatorItem = new SeparatorMenuItem();
		
		Menu recentMenu = new Menu("Recent File");
		MenuItem aItem = new MenuItem("File A");
		MenuItem bItem = new MenuItem("File b");
		recentMenu.getItems().addAll(aItem, bItem);
		
		fileMenu.getItems().addAll(newItem, openItem, recentMenu,separatorItem, exitItem);
		
		MenuItem copyItem = new MenuItem("Copy");
		MenuItem pasteItem = new MenuItem("Paste");
		editMenu.getItems().addAll(copyItem, pasteItem);
		
		CheckMenuItem autoBuildItem = new CheckMenuItem("Build Automatically");
		projectMenu.getItems().add(autoBuildItem);
		autoBuildItem.setOnAction(e -> {
			System.out.println("action on auto...");
		});
		
		exitItem.setOnAction(e -> {
			System.out.println("exit is clicked");
		});
		
		BorderPane root = new BorderPane();
		root.setTop(menuBar);
		
		Scene scene = new Scene(root,300,250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Menu Demo");
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
