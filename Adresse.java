public class Adresse{
	private int numRue;
	private String nomRue;
	private int cp;
	private String ville;
	public Adresse(int numRue,String nomRue,int cp,String ville){
		this.numRue=numRue;
		this.nomRue=nomRue;
		this.cp=cp;
		this.ville=ville;
	}
	public void display(){
		System.out.println("\t ## Adrees ##");
		System.out.println("\t num rue:"+ this.numRue);
		System.out.println("\t nom rue:"+ this.nomRue);
		System.out.println("\t CP:"+ this.cp);
		System.out.println("\t ville:"+ this.ville);

	}
	public String getAdresse(){
		return this.numRue+" rue "+this.nomRue+" ,"+this.cp+"  "+this.ville;
	}
	public int getNumRue(){return this.numRue;}
	public String getNomRue(){return this.nomRue;}
	public int getCP(){return this.cp;}
	public String getVille(){return this.ville;}

	public void setNumRue(int val){this.numRue=val;}
	public void setNomRue(String val){this.nomRue=val;}
	public void setCP(int val){this.cp=val;}
	public void setVille(String val){this.ville=val;}



}