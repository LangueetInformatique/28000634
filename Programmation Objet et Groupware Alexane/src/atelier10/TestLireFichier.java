package atelier10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestLireFichier {
		/*
		Exercice 1 : Créer la classe exécutable MonPremierFichierTexte 
		qui écrit dans le fichier texte « Nom.txt » les noms des membres du groupe. 
		*/

		public static void main (String[] args) throws FileNotFoundException {

			String nfich = "src/atelier09/Adelaide.txt";
				File f = new File(nfich);
				
				PrintWriter pr = new PrintWriter(f);
				pr.println("Ceci est un fichier test destiné à ma classe LireToutUnTexte");
				
				pr.close();
				System.out.println("Fin d'écriture fichier");
				
		
				
			}
}
