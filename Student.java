public class Student{
	private Person person;
	private int numeroEtudiant;
	public Student(Person person){
		this.person=person;
	}
	public Student(String nom,String prenom,int bd){
		this.person=new Person(nom,prenom,bd);
	}

	public void setPerson(Person val){this.person=val;}
	public void setNumeroEtudiant(int val){this.numeroEtudiant=val;}
	public Person getPerson(){return this.person;}
	public int getNumeroEtudiant(){return this.numeroEtudiant;}
	public void display(){
		person.display();
		System.out.println("\t Num etudiant:"+this.numeroEtudiant);
	}
}