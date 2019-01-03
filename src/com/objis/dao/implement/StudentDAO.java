package com.objis.dao.implement;

import java.sql.Connection;

import com.objis.demojdbc.DAO;
import com.objis.demojdbc.Student;

public abstract class StudentDAO extends DAO<Student> {
	
	public StudentDAO(Connection conn) {
	  super(conn);
	}
	 
	public abstract Student find(int id);
	
	public abstract boolean login(String id, String password);
	
	public abstract boolean verifyCredentials(String login, String password);
	
	public abstract Student findByName(String name);
	
	public abstract void createStudent(Student obj);
	
	@Override
	public abstract boolean create(Student obj);
	
	@Override
	public abstract boolean delete(Student obj);
	
	@Override
	public abstract boolean update(Student obj);
}
