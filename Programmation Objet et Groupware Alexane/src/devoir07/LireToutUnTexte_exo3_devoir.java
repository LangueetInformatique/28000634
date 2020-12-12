package devoir07;

import java.io.*;

public class LireToutUnTexte_exo3_devoir extends BufferedReader{

	public LireToutUnTexte_exo3_devoir(Reader in, int sz) throws IOException {
		super(in, sz);
	}
	
	public static Reader LireToutUnTexte_exo3_devoir (String l) throws IOException {
		String monTexte = null;
		Reader reader = new FileReader((String) monTexte);
		
		int Num = reader.read();
		while(Num != -1) {
		    char theChar = (char) Num;

		    System.out.print(theChar);

		    Num = reader.read();
		    reader.close();
		    System.out.println(monTexte);
		}
		
		String ligne = null;
		Stexte = "";

		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(ft));
			while ((ligne = br.readLine()) != null) {
				Stexte += ligne + "\n";
			}

		}

		catch (IOException e) {
		}
		return reader;
		}
		// méthode lire un texte, méthode Chercher, 
		// méthode chercher voir et enfin 
		// méthode chercherER qui cherche les occurrences de mots compatibles avec une expressions régulière donnée. 
		// Ecrire une classe de test avec le fichier « avare.txt » en recherchant les flexions du verbe aimer. aim.*
}