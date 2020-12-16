package devoir07;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LireToutUnTexte_devoir extends BufferedReader{

	public LireToutUnTexte_devoir(Reader in, int sz) throws IOException {
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
		String Stexte = "";

		try {
			String ft = null;
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

	public static boolean ChercherER(String texte, String re) {

	Pattern pt = Pattern.compile(re);
	Matcher mt = pt.matcher(texte);
	
	boolean result = mt.matches();
	return result;
		
		}
	}


