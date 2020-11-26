package atelier09;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import util.Keyboard;

public class MonPremierFichierTexte {
	/*
	Exercice 1 : Créer la classe exécutable MonPremierFichierTexte 
	qui écrit dans le fichier texte « Nom.txt » les noms des membres du groupe. 
	*/

	public static void main (String[] args) {
		String ligne;
		try {
			File f = new File(Keyboard.getString("Nom.txt"));
			
			PrintWriter pr = new PrintWriter(f);
			pr.print("Morgann");
			pr.print("Julien");
			pr.print("Mustapha");
			pr.print("Chenwangli");
			pr.print("Ana");
			pr.print("Joyce");
			
			pr.close();
			System.out.println("Fin d'écriture fichier");
		
	}
		catch (IOException e) {e.printStackTrace(); }
}
}