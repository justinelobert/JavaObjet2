package projetClassesJustine;

public class employe extends personne { // relier les classes 
	
	public employe(int id, String prenom, String nom, double salaire) {
		super(id, prenom, nom);
		
		this.salaire = salaire;
	
	}
	

	double salaire;


	@Override
	public String toString() {
		return "employe "+ super.toString()+"[salaire=" + salaire + "]";
	}

}

