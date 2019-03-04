package projetTest;

import projetClassesJustine.employe;
import projetClassesJustine.etudiant;
import projetClassesJustine.professeur;

public class Application {

	public static void main (String[]args) {
		
		info();
		
	}
	
	public static void info() {
		
		etudiant etud1 = new etudiant(1, "Mehdi", "Druelle", "34162953");
		System.out.println(etud1);
		
		etudiant etud2 = new etudiant(2, "Ionna", "Tsoukalas", "76219276");
		System.out.println(etud2);
		
		professeur prof1 = new professeur(1, "Sabrina", "Pourcelot", "Java/JEE", 2000.0);
		System.out.println(prof1);
		
		professeur prof2 = new professeur(2, "Pablo", "Brusset", "Mathématiques", 1800.0);
		System.out.println(prof2);
		
		employe empl1 = new employe(1, "Kevin", "San Martino", 5000.0);
		System.out.println(empl1);
		
		employe empl2 = new employe(2, "Thibault", "Cougrand", 5000.0);
		System.out.println(empl2);
		
	}
	

	
}
