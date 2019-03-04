package projetClassesJustine;

public class etudiant extends personne{ // relier les classes 
	
	public etudiant(int id, String prenom, String nom , String cne) {
		super(id, prenom, nom);
		
		this.cne = cne;
		// TODO Auto-generated constructor stub
	}

	String cne;

	@Override
	public String toString() {
		return "etudiant "+ super.toString() +" [cne=" + cne + "]";
	}

}

