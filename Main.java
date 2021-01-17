
import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Adresse schoolAdress =new Adresse(2,"l'illbreg",68200,"Mulhouse");
		Adresse studentAdress =new Adresse(11,"freres lumieres",68200,"brunstatt");
		School school =new School("Université de haute alsace",schoolAdress,1970);
		Student student=new Student(new Person("Oreste","Muhirwa",1995));
		
		student.setNumeroEtudiant(101010);
		//school.addStudent(student);
		school.display();
	}
}
