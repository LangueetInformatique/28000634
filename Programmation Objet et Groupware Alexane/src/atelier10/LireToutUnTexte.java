package atelier10;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class LireToutUnTexte {
	private String Stexte;
	
	// la variable Stexte doit contenir le livre. 

	/**
	 * lecture d'un fichier texte dans la chaîne sTexte
	 * 
	 * @param ft descripteur du fichier
	 */
	public LireToutUnTexte(String nomFichier) throws FileNotFoundException {
		
	        BufferedReader fluxEntree=null;
	        String ligneLue;
	        String Stexte = new String ();
	            fluxEntree = new BufferedReader (new FileReader (nomFichier));
	            ligneLue = fluxEntree.readLine();
	            while(ligneLue!=null){
	                List lignes;
					lignes.add(ligneLue);
	                ligneLue = fluxEntree.readLine(); }
	            }
	

	/**
	 * Recherche du nombre d'occurences de s dans sTexte
	 * 
	 * @param s chaîne cherchée
	 * @return nombre d'occurences
	 * 
	 */
	public int Chercher(String s) {

		return 0;
	}

	/**
	 * Affichage du contexte des occurences de s dans sTexte
	 * 
	 * @param s      chaîne cherchée
	 * @param taille taille du contexte
	 */
	public void ChercherVoir(String s, int taille) {
		return;
	}
}