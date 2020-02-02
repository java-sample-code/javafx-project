package demo.tableview;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.ResizeFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Callback;

public class TableViewDemo extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		
		TableView<User> tableView = new TableView<>();
		TableColumn<User, String> nameColumn = new TableColumn<>("Name");
		TableColumn<User, String> genderColumn = new TableColumn<>("Gender");
		TableColumn<User, String> emailColumn = new TableColumn<>("Email");
		TableColumn<User, String> addressColumn = new TableColumn<>("Address");
		tableView.getColumns().addAll(nameColumn,genderColumn,emailColumn,addressColumn);
		tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		genderColumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
		emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
		addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
		
		User user1 = new User("Heng Dara", "Male", "Phnom Penh", "hengdara@gmail.com");
		User user2 = new User("Heng Dara1", "Male", "Phnom Penh", "hengdara@gmail.com");
		User user3 = new User("Heng Dara2", "Male", "Phnom Penh", "hengdara@gmail.com");
		User user4 = new User("Heng Dara3", "Male", "Phnom Penh", "hengdara@gmail.com");
	
		ObservableList<User> list = FXCollections.observableArrayList(user1,user2,user3,user4);
		tableView.setItems(list);
		
		tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<User>() {
			@Override
			public void changed(ObservableValue<? extends User> observable, User oldValue, User newValue) {
				// TODO Auto-generated method stub
				User user = tableView.getSelectionModel().getSelectedItem();
				System.out.println(user.toString());
			}
		});
		
		root.getChildren().add(tableView);
		Scene scene = new Scene(root,500,250);
		primaryStage.setScene(scene);
		primaryStage.setTitle("TableView Demo");
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
