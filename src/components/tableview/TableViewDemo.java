package components.tableview;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableViewDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		
		TableView<User> tableView = new TableView<User>();
		
		// Create Column Header
		TableColumn<User, Integer> idColumn = new TableColumn<>("ID");
		TableColumn<User, String> nameColumn = new TableColumn<>("NAME");
		TableColumn<User, String> genderColumn = new TableColumn<>("GENDER");
		TableColumn<User, String> emailColumn = new TableColumn<>("EMAIL");
		tableView.getColumns().addAll(idColumn,nameColumn,genderColumn,emailColumn);
		tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		
		// Define data field of each column
		idColumn.setCellValueFactory(new PropertyValueFactory<User, Integer>("id"));
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
		emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
		
		User user1 = new User(1, "Heng Dara", "Male", "hengdara@gmail.com");
		User user2 = new User(2, "John Deo", "Male", "jonhdoe@gmail.com");
		User user3 = new User(3, "Jen Marrie", "Female", "jane123@yahoo.com");
		
		ObservableList<User> observableList = FXCollections.observableArrayList(user1,user2,user3);
		tableView.setItems(observableList);
		
		root.getChildren().add(tableView);
		Scene scene = new Scene(root, 450, 250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("User Information");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
