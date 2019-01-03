package com.objis.dao;

import java.sql.Connection;

import com.objis.connexion.SdzConnection;
import com.objis.dao.implement.StudentDAO;
import com.objis.dao.implement.StudentDAOMySQL;

public class DAOFactory extends AbstractDAOFactory {
  protected static final Connection conn = SdzConnection.getInstance();   
   
  /**
  * Retourne un objet Classe interagissant avec la BDD
  * @return DAO
  */
  public StudentDAO getStudentDAO(){
    return new StudentDAOMySQL(conn);
  }
  
}

