package com.objis.connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//CTRL + SHIFT + O pour générer les imports
public class SdzConnection{

	//Objet Connection
	private static Connection connect;
	 
	//Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
	public static Connection getInstance(){
	    if(connect == null){
	      try {
	    	Properties props = new Properties();
			props.setProperty("ssl","true");
	        connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8889/polysharebase","root","root");
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }      
	    return connect;
	  }     
}
