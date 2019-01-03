package com.objis.connexion;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	
	public static void main(String[] args) {
	  try {
	    //Nous appelons quatre fois la méthode getInstance()
	    PreparedStatement prepare = SdzConnection.getInstance().prepareStatement("SELECT * FROM Student WHERE id = ?");
	
	    Statement state = SdzConnection.getInstance().createStatement();
	
	    SdzConnection.getInstance().setAutoCommit(false);
	
	    DatabaseMetaData meta = SdzConnection.getInstance().getMetaData();
	       
	  } catch (SQLException e) {
	    e.printStackTrace();
	  }
	}
}
