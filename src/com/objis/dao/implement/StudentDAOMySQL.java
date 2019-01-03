package com.objis.dao.implement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.objis.demojdbc.Student;

public class StudentDAOMySQL extends StudentDAO {
	
	public StudentDAOMySQL(Connection conn) {
	  super(conn);
	}
	 
	public Student find(int id) {
	  Student student = new Student(0, null, null, null, null, null);      
	    
	  try {
	    ResultSet result = this.connect.createStatement(
	    ResultSet.TYPE_SCROLL_INSENSITIVE,
	    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE idStudent = " + id);
	    if(result.first())
	      student = new Student(
	    		id,
	        result.getString("nameStudent"),
	        result.getString("firstNameStudent"),
	        result.getString("emailStudent"),
	        result.getString("password"),
	        result.getString("loginID"));         
	  } catch (SQLException e) {
	    e.printStackTrace();
	  }
	  return student;
	}
	
	public boolean login(String id, String password) {
		try {
		   ResultSet result = this.connect.createStatement(
		   ResultSet.TYPE_SCROLL_INSENSITIVE,
		   ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE emailStudent = '" + id + "' AND password = '" + password + "'");
		   if(result != null) {
			   return true;
		   } else { 
			   return false;
		   }
		 } catch (SQLException e) {
			 e.printStackTrace();
		 }
		 return false;
	}
	
	public boolean verifyCredentials(String login, String password) {
		
		return false;
	}
	
	public Student findByName(String name) {
		Student student = new Student(0, null, null, null, null, null);      
	    
		  try {
		    ResultSet result = this.connect.createStatement(
		    ResultSet.TYPE_SCROLL_INSENSITIVE,
		    ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM Student WHERE nameStudent = " + name);
		    if(result.first())
		      student = new Student(
		    		result.getInt("id"),
		        name,
		        result.getString("firstNameStudent"),
		        result.getString("emailStudent"),
		        result.getString("password"),
		        result.getString("loginID"));         
		  } catch (SQLException e) {
		    e.printStackTrace();
		  }
		  return student;
	}
	
	public void createStudent(Student obj) {
		try {
			this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeUpdate("INSERT INTO Student VALUES (NULL,'" + obj.getNameStudent() + "','" + obj.getFirstNameStudent() + "','" + obj.getEmailStudent() + "','" + obj.getPasswordStudent() + "','" + obj.getLoginID() + "')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean create(Student obj) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public boolean delete(Student obj) {
		// TODO Auto-generated method stub
		try {
			this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeUpdate("DELETE FROM Student WHERE idStudent = '" + obj.getId() + "'");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean update(Student obj) {
		// TODO Auto-generated method stub
		try {
			this.connect.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeUpdate("UPDATE Student SET nameStudent = '" + obj.getNameStudent() + "', firstNameStudent = '" + obj.getFirstNameStudent() + "', emailStudent = '" + obj.getEmailStudent() + "', password = '" + obj.getPasswordStudent() + "', loginID = '" + obj.getLoginID() + "' WHERE idStudent = '" + obj.getId() + "'");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
}

