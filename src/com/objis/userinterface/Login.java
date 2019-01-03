package com.objis.userinterface;

import com.objis.facade.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.*;

public class Login extends Application {
	private LoginFacade ulf = new LoginFacade();
	private LoginFacadeIndex uii = new LoginFacadeIndex();

	public static void main(String[] args) {
        System.out.println( "Main method inside Thread : " +  Thread.currentThread().getName());
        launch(args);
    }
	
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Bienvenue!");
		GridPane grid = new GridPane();
		//grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(10, 10, 10, 10));
		Text scenetitle = new Text("Welcome");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label userName = new Label("Email Student :");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label pw = new Label("Password:");
		grid.add(pw, 0, 2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);
		Button btn = new Button("Sign in");
		Button btn2 = new Button("New Account");
		HBox hbBtn = new HBox(10);
		HBox hbBtn2 = new HBox(10);
		//hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtn.getChildren().add(btn);
		hbBtn2.getChildren().add(btn2);
		grid.add(hbBtn, 1, 4);
		grid.add(hbBtn2, 1, 5);
		final Text actiontarget = new Text();
        grid.add(actiontarget, 1, 6);
        
        final Popup popup = new Popup(); popup.setX(300); popup.setY(200);
        popup.getContent().addAll(new Circle(25, 25, 50, Color.AQUAMARINE));
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
        	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                ulf.login(userTextField.getText(), pwBox.getText());
                actiontarget.setText("Sign in button pressed");

              //  uii.display(userTextField.getText());

                popup.show(primaryStage);
                

            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
       	 
            @Override
            public void handle(ActionEvent e) {
                actiontarget.setFill(Color.FIREBRICK);
                actiontarget.setText("New Account button pressed");
            }
        });
        
		Scene scene = new Scene(grid, 300, 275);
		primaryStage.setScene(scene);
        primaryStage.show();
		
	}

}
