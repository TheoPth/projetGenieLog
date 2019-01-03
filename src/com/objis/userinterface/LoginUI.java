package com.objis.userinterface;

import java.io.IOException;

import com.objis.controller.LoginController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginUI extends Application {

	Stage primaryStage;
	// private VBox chatLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		initLoginLayout();
	}

	private void initLoginLayout() throws IOException {


		//FXMLLoader root = new FXMLLoader(getClass().getResource("EventCreationUI.fxml"));
		//root.setController(new LoginController());

		FXMLLoader root = new FXMLLoader(getClass().getResource("LoginTest.fxml"));
		root.setController(new LoginController());
		Parent parent = root.load();
		Scene scene = new Scene(parent);
		primaryStage.setTitle("Login Interface");
		primaryStage.setScene(scene);
		primaryStage.show();
                
                
                
        
        
	}

	public static void main(String[] args) {
		launch(args);
	}
}
