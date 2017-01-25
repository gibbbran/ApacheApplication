package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class MainGUI extends Application {
	
	private static String aboutUs = "We are Team Apache:\n Brandon Gibbons --Gibbo\n Jorie Fernandez --J \n Griffin Toyoda --Griff\n "
			+ "Zeeshan Aziz Karim --**Needs nickname**\n Max Kullish --**Needs Nickname**";
	
	private boolean activeFlag = false;
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Apache Application");
		Scene mainScene = new Scene(new VBox(), 400, 350);
		mainScene.setFill(Color.AZURE);
		
		MenuBar menuBar = new MenuBar();
		Menu mainMenu = new Menu("Menu");
		MenuItem aboutMenu = new MenuItem("About...");
		
		aboutMenu.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("About Team Apache");
			alert.setHeaderText(null);
			alert.setContentText(aboutUs);
			alert.showAndWait();
			}
		});
		
		aboutMenu.setAccelerator(KeyCombination.keyCombination("Ctrl+A"));
		mainMenu.getItems().add(aboutMenu);
		menuBar.getMenus().add(mainMenu);
        
        ((VBox)mainScene.getRoot()).getChildren().add(menuBar);
        primaryStage.setScene(mainScene);
        primaryStage.show();
        
        activeFlag = true;
	}
	
	public boolean isActive() {
		return activeFlag;
	}
}
