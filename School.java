import java.util.*;
public class School{
	private String name;
	private Adresse adresse;
	private int firstYear;
	private Vector<Student> students;
	public School(String name,Adresse adresse,int firstYear){
		this.name=name;
		this.adresse=adresse;
		this.firstYear=firstYear;

	}
	public void display(){
		System.out.println("\t ## School ##");
		System.out.println("\t nom:"+ this.name);
		System.out.println("\t first year in service:"+ this.firstYear);
		System.out.println("\t adresse:"+ this.adresse.getAdresse());
		//System.out.println("\t The school has "+ students.size()+"Students ");

	}

	public String getName(){return this.name;}
	public Adresse getAdresse(){return this.adresse;}
	public int getFirstYear(){return this.firstYear;}

	public void setName(String val){this.name=val;}
	public void setAdresse(Adresse val){this.adresse=val;}
	public void setFirstYear(int val){this.firstYear=val;}

	public void addStudent(Student s){
		students.add(s);
	}
	public Vector<Student> getStudents(){
		return this.students;
	}

}