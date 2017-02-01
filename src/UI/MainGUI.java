package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
		
		BorderPane mainScene = new BorderPane();
		HBox menuManager = new HBox();
		VBox loginManager = new VBox();
		
		MenuBar menuBar = new MenuBar();
		Menu mainMenu = new Menu("Menu");
		MenuItem aboutMenu = new MenuItem("About...");
		TextArea userName = new TextArea("Enter your user name");
		TextArea passwordField = new TextArea("Enter your password");
		Button loginButton = new Button("Login");
		
		loginButton.setOnAction((ActionEvent event) -> {
			System.out.println("This feature has not been implemented yet...");
		});
		
		aboutMenu.setOnAction((ActionEvent event) -> {
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("About Team Apache");
			alert.setHeaderText(null);
			alert.setContentText(aboutUs);
			alert.showAndWait();
		});
		
		aboutMenu.setAccelerator(KeyCombination.keyCombination("Ctrl+A"));
		mainMenu.getItems().add(aboutMenu);
		menuBar.getMenus().add(mainMenu);
        
		userName.setMaxSize(250.00, 50.00);
		passwordField.setMaxSize(250.00, 50.00);
		menuManager.getChildren().add(menuBar);
		menuManager.setPadding(new Insets(10, 20, 10, 20));
        mainScene.setTop(menuManager);
        
        loginManager.getChildren().addAll(userName, passwordField, loginButton);
        loginManager.setPadding(new Insets(10, 30, 10, 30));
        loginManager.setAlignment(Pos.CENTER);
        mainScene.setCenter(loginManager);

        Scene scene = new Scene(mainScene);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        activeFlag = true;
	}
	
	public boolean isActive() {
		return activeFlag;
	}	
}
