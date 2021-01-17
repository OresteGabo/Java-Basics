public class Person{
	private int yearOfBirth;
	private String nom;
	private String prenom;
	public Person(String nom,String prenom,int yearBirth){
		this.nom=nom;
		this.prenom=prenom;
		this.yearOfBirth=yearOfBirth;
	}
	public void display(){
		System.out.println("\t  ## Person ##");
		System.out.println("\t Name: "+this.nom);
		System.out.println("\t prenom: "+this.prenom);
		System.out.println("\t Age: "+(2021-this.yearOfBirth));
	}
	public void setNom(String val){this.nom=val;}
	public void setPrenom(String val){this.prenom=val;}
	public void setYearOfBirth(int val){this.yearOfBirth=val;}

	public String getNom(){return this.nom;}
	public String getPrenom(){return this.prenom;}
	public int getYearOfBirth(){return this.yearOfBirth;}
	public int getAge(){return 2021-this.yearOfBirth;}
	public String person(){
		return "Nom: "+this.nom+" prenom: "+this.prenom+" Age:"+getAge();
	}
}