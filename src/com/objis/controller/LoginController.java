package com.objis.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.objis.facade.LoginFacadeIndex;
import com.objis.facade.LoginFacade;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
//import userinterface.UserIndexUI;
import javafx.event.ActionEvent;
import javafx.scene.Node;

public class LoginController implements Initializable {

	
	// Java FX Implementation
		@FXML
		private Button btnLogin;
		
		@FXML
		private Button btnSignUp;
		
		@FXML
		private TextField txtEmailStudent;
		
		@FXML
		private PasswordField txtPassWord ;
		
		@FXML
		private Label errorText;
		
		
		// Config
		
		private String emailStudent;
		private String passWord = " ";
		private boolean connected;
		
		//
		
		private LoginFacade ulf = new LoginFacade();



		/**
		 * Method used by btnLogin from Java FX
		 * @throws IOException 
		 */
		 @FXML
		    private void login(ActionEvent e) throws IOException{
			 emailStudent = txtEmailStudent.getText();
			 passWord = txtPassWord.getText();
		      if(emailStudent.equals("") || passWord.equals(""))
		      {
		    	  display("Enter email or password");
		      }
		      else
		      {
		    	   ulf.login(emailStudent, passWord);
		    	   
		    	   if (ulf.getConnected())
		    	   {
                            Node  source = (Node)  e.getSource(); 
                            Stage stage  = (Stage) source.getScene().getWindow();
                            stage.close();
			                            
                            Stage nextStage = new Stage();
                            nextStage.setTitle("Student Account");
                            Pane myPane = null;
                            myPane = FXMLLoader.load(getClass().getResource("/com/objis/userinterface/HomePage.fxml"));
                            
                            
                            Scene scene = new Scene(myPane);
                            nextStage.setScene(scene);
                            nextStage.show(); 
		    	   }
		    	   else
		    	   {
		    		   display("Wrong email/password");
		    	   }
		      }
		    }

		 
		 @FXML
		 private void signup(ActionEvent e) throws IOException{
					 Node  source = (Node)  e.getSource(); 
		             Stage stage  = (Stage) source.getScene().getWindow();
		             stage.close();
		                          
		             Stage nextStage = new Stage();
		             nextStage.setTitle("Student Account");
		             Pane myPane = null;
		             myPane = FXMLLoader.load(getClass().getResource("/com/objis/userinterface/SignUp.fxml"));
		
		             Scene scene = new Scene(myPane);
		             nextStage.setScene(scene);
		             nextStage.show(); 
		      
		 }
		 
		 @FXML
		 public void display(String msg)
		 {
		 		errorText.setText(msg);
		 }
		 	
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			errorText.setText("");
		}
}
