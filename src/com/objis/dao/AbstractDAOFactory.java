package com.objis.dao;

import com.objis.dao.implement.StudentDAO;

public abstract class AbstractDAOFactory {
  public static final int DAO_FACTORY = 0;
  public static final int XML_DAO_FACTORY = 1;

  //Retourne un objet Classe interagissant avec la BDD
  public abstract StudentDAO getStudentDAO();
   
  //Méthode permettant de récupérer les Factory
  public static AbstractDAOFactory getFactory(int type){
    switch(type){
      case DAO_FACTORY:
        return new DAOFactory();
      default:
        return null;
    }
  }
}
