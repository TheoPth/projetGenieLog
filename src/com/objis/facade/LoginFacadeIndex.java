package com.objis.facade;

import com.objis.dao.AbstractDAOFactory;
import com.objis.dao.implement.StudentDAO;

public class LoginFacadeIndex {
	
	private AbstractDAOFactory af = AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY);
	private StudentDAO sd = af.getStudentDAO();

}
