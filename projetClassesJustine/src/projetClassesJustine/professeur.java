package projetClassesJustine;

public class professeur extends employe {  // relier les classes 

	public professeur(int id, String prenom, String nom, String specialite , double salaire) {
		super(id, prenom, nom, salaire);
		
		this.specialite = specialite;
	}

	String specialite;

	@Override
	public String toString() {
		return"professeur "+ super.toString()+"[specialite=" + specialite + "]";
	}
	
}
