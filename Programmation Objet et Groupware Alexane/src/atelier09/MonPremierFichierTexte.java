package atelier09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MonPremierFichierTexte {
	/*
	Exercice 1 : Créer la classe exécutable MonPremierFichierTexte 
	qui écrit dans le fichier texte « Nom.txt » les noms des membres du groupe. 
	*/

	public static void main (String[] args) throws FileNotFoundException {
		String ligne;
		String nfich = "src/atelier09/Nom.txt";
		try {
			File f = new File(nfich);
			
			PrintWriter pr = new PrintWriter(f);
			pr.println("Morgann");
			pr.println("Julien");
			pr.println("Mustapha");
			pr.println("Chengwanli");
			pr.println("Ana");
			pr.println("Joyce");
			
			pr.close();
			System.out.println("Fin d'écriture fichier");
		}
		finally {
		/* 
		 * Exercice 2 : Ajouter à la classe MonPremierFichierTexte la méthode Verifier 
		 * qui vérifie si le fichier « Nom.txt » contient bien les noms des membres du groupe.
		 */

		try {
			File f = new File(nfich);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while((ligne=br.readLine()) !=null) {
				System.out.println(ligne);
			}
			br.close();
		}
		catch (IOException e) {e.printStackTrace();}

	}
		}
}


