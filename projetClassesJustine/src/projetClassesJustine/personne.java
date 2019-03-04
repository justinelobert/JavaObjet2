package projetClassesJustine;

public abstract class personne { // relier les classes 

	int id ;
	String prenom;
	String nom;

	public personne( int id, String prenom, String nom) {
		
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		
	}

	@Override
	public String toString() {
		return " [id=" + id + ", prenom=" + prenom + ", nom=" + nom + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
}
