import java.util.Scanner;

public class Livre {

	protected int id;
	protected String titre;
	protected String auteur;
	protected int prix;
	private static int compteur;

	public Livre( String Titre , String Auteur , int Prix) {
		compteur++;
		this.titre = Titre;
		this.auteur = Auteur;
		this.prix = Prix;
		this.id = compteur;
	}

	public Livre() {
		compteur++;
		this.id = compteur;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void Quest() {

		Scanner sc = new Scanner (System.in);

		System.out.println("Donner le titre du livre");
		titre = sc.nextLine();


		System.out.println("indiquez l'auteur");
		auteur= sc.nextLine();

		System.out.println("indiquez le prix");
		prix = sc.nextInt();
		sc.nextLine();
	}

	public String toString() {
		return "Livre {id=" + id+ ", titre=" + titre + ", auteur=" + auteur + ", prix=" + prix +'}';
	}


}
