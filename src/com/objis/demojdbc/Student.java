package com.objis.demojdbc;

public class Student {
	
	private int id = 0;
	private String nameStudent = "";
	private String firstNameStudent = "";
	private String emailStudent = "";
	private String passwordStudent = "";
	private String loginID = "";
	
	
	public Student(int id, String nameStudent, String firstNameStudent, String emailStudent, String passwordStudent,
			String loginID) {
		this.id = id;
		this.nameStudent = nameStudent;
		this.firstNameStudent = firstNameStudent;
		this.emailStudent = emailStudent;
		this.passwordStudent = passwordStudent;
		this.loginID = loginID;
	}
	
	
	
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public String getFirstNameStudent() {
		return firstNameStudent;
	}
	public void setFirstNameStudent(String firstNameStudent) {
		this.firstNameStudent = firstNameStudent;
	}
	public String getEmailStudent() {
		return emailStudent;
	}
	public void setEmailStudent(String emailStudent) {
		this.emailStudent = emailStudent;
	}
	public String getPasswordStudent() {
		return passwordStudent;
	}
	public void setPasswordStudent(String passwordStudent) {
		this.passwordStudent = passwordStudent;
	}

	public String getLoginID() {
		return loginID;
	}
	public void setLoginID(String loginID) {
		this.loginID = loginID;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	

}
