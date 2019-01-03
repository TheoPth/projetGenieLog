import com.objis.demojdbc.DAO;
import com.objis.demojdbc.Student;
import com.objis.connexion.SdzConnection;
import com.objis.dao.implement.StudentDAOMySQL;

public class FirstTest { 
  public static void main(String[] args) {

	DAO<Student> studentDao = new StudentDAOMySQL(SdzConnection.getInstance());
    for(int i = 1; i < 5; i++){
      Student student = studentDao.find(i);
      System.out.println("Student N°" + i + "  - " + student.getNameStudent() + " " + student.getFirstNameStudent());
    }
  }
  
}
