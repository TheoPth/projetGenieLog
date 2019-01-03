package com.objis.facade;

import com.objis.dao.AbstractDAOFactory;
import com.objis.dao.implement.StudentDAO;

public class LoginFacade {
	
	private AbstractDAOFactory af = AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY);
	private StudentDAO sd = af.getStudentDAO();
	private Boolean connected=false; 
	
	public void login(String email, String pwd) {
		boolean login = sd.login(email, pwd);
		
		if(login != false){
			setConnected(true);
		}else{
			setConnected(false);
		}
    }
	
	public Boolean getConnected() {
		return connected;
	}
	
	public void setConnected(Boolean connected) {
		this.connected = connected;
	}

}
