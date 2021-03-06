import java.util.Scanner;

import com.objis.dao.AbstractDAOFactory;
import com.objis.demojdbc.DAO;
import com.objis.demojdbc.Student;

public class TestDAO {
	
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
	    System.out.println("");
	    AbstractDAOFactory adf = AbstractDAOFactory.getFactory(AbstractDAOFactory.DAO_FACTORY);
	    //On récupère un objet faisant le lien entre la base et nos objets 
	    DAO<Student> studentDao = adf.getStudentDAO();
	    
	    /*System.out.println("IdStudent : ");
		int idStudent = scan.nextInt();
		System.out.println("NameStudent : ");
		String nameStudent = scan.next();
		System.out.println("FirstNameStudent : ");
		String firstNameStudent = scan.next();*/
		System.out.println("EmailStudent : ");
		String emailStudent = scan.next();
		System.out.println("Password : ");
		String password = scan.next();
		/*System.out.println("LoginID : ");
		String loginID = scan.next();*/

	    //Student student1 = new Student(idStudent,nameStudent,firstNameStudent,emailStudent,password,loginID);
	    
	    boolean login = studentDao.login(emailStudent,password);
	    if (login == true) {
	    		System.out.println("Vous êtes connecté !");
	    } else {
	    		System.out.println("Vous n'avez pas réussi à vous connecter.");
	    }
	    
	    Student student2 = studentDao.find(2);
	    studentDao.delete(student2);
	    
	    for(int i = 1; i < 12; i++){
	      //On fait notre recherche
	      Student student = studentDao.find(i);
	      System.out.println("\tELEVE N°" + i + " - NOM : " + student.getNameStudent() + " - PRENOM : " + student.getFirstNameStudent());
	    } 
	    
	    
	    
	}
	
}
