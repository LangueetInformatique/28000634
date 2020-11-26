package atelier09;
import java.io.*;

public class Copie {
/*	
	*Le but de cette partie est de manipuler les différents types de flots et de fichiers 
	*en se référençant aux exemples du cours et à la javadoc. Exercice 1 :  
	*Créer  la  classe  exécutable  Copie  qui  permet  de  copier  le  contenu  d’un  fichier dans un autre. 
	*/
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException 
	   {
	      // Le fichier source
	      File src = new File("src/atelier09/Nom.txt"); 
	      // Le fichier destination
	      File dest = new File("src/atelier09/Nom2.txt"); 
	      // Créer l'objet File Reader
	      FileReader fr = new FileReader(src);
	      // Créer l'objet BufferedReader  
		BufferedReader br = new BufferedReader(fr);  
	      // Créer l'objet File Writer
	      FileWriter fw = new FileWriter(dest);      
	      String str = null;
	      // Copie le contenu dans le nouveau fichier
	      while((str = br.readLine()) != null)             
	      {
	         fw.write(str);
	         fw.write("\n");
	      }
	      fw.close();
	   }
	
	}
	
