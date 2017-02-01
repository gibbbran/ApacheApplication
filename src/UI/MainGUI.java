package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainGUI extends Application {
	
	BorderPane mainScene = new BorderPane();
	HBox menuManager = new HBox();
	VBox loginManager = new VBox();
	
	private static String aboutUs = "We are Team Apache:\n Brandon Gibbons --Gibbo\n Jorie Fernandez --J \n Griffin Toyoda --Griff\n "
			+ "Zeeshan Aziz Karim --**Needs nickname**\n Max Kullish --**Needs Nickname**";
	
	private boolean activeFlag = false;
	
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Apache Application");
		
		createMenu(primaryStage);
		createLogin();
		
        mainScene.setCenter(loginManager);

        Scene scene = new Scene(mainScene);
        primaryStage.setScene(scene);
        primaryStage.setMinHeight(350);
        primaryStage.setMinWidth(325);
        primaryStage.show();
        
        activeFlag = true;
	}
	
	private void createMenu(Stage _stage) {
		
		MenuBar menuBar = new MenuBar();
		Menu mainMenu = new Menu("Menu");
		MenuItem aboutMenu = new MenuItem("About...");
		
		
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

		menuBar.prefWidthProperty().bind(_stage.widthProperty());
		
		menuManager.getChildren().add(menuBar);
        mainScene.setTop(menuManager);
	}
	
	private void createLogin() {
		
		TextField userName = new TextField("Enter your user name");
		TextField passwordField = new TextField("Enter your password");
		Button loginButton = new Button("Login");
		
		loginButton.setOnAction((ActionEvent event) -> {
			System.out.println("This feature has not been implemented yet...");
		});
        
		userName.setPrefHeight(20);
		userName.setMaxWidth(200);
		passwordField.setPrefHeight(20);
		passwordField.setMaxWidth(200);
        
        loginManager.getChildren().addAll(userName, passwordField, loginButton);
        loginManager.setSpacing(15);
        loginManager.setAlignment(Pos.CENTER);
	}
	
	public boolean isActive() {
		return activeFlag;
	}	
}
