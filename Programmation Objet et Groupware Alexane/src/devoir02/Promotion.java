package devoir02;

import java.util.ArrayList;

public class Promotion {
	String name;
	int ann�e;
	ArrayList<Etudiant> liste_etudiant;
	double MoyennePromo;
	
	public String getName() {
		return name;
	}
	public int getAnnee() {
		return ann�e;
	}
	
	// une promotion d'étudiants a un certain nombre d'étudiants
		// cette quantité d'étudiants n'est pas fixe.
		// chaque année, les nouveaux étudiants sont intégrés à la promo
		// les personnes qui ne terminent pas la formation ou qui redoublent n'en font pas partie
		// on créé donc une liste capable d'être modifiée avec ArrayList
	public void  NouvEtudiant (Etudiant a) {
			this.liste_etudiant.add(a);
		
			System.out.println(liste_etudiant.get(1)); // on peut trouver un étudiant dans la liste
		
			System.out.println(liste_etudiant); // ici on récupère toute la liste des étudiants de la promo
			System.out.println(liste_etudiant.size());} // on récupère la quantité d'étudiants dans la promo
		
	// une promotion d'étudiant permet également de calculer la moyenne des moyennes des étudiants
	
	
	@SuppressWarnings("unused")
	private double MoyennePromo() {
		return MoyennePromo;
		// TODO Auto-generated method stub
	}
	}
	
