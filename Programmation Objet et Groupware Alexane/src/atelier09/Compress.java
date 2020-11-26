package atelier09;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class Compress {

	//Exercice 2 : Créer la classe exécutable Compresse qui permet de compresser le contenu d’un fichier.

	   public static void main(String[] args) {
	  
	   final int BUFFER = 2048;

	     try{
	        byte buffer[] = new byte[BUFFER];
	      
	        FileOutputStream file = new FileOutputStream("src/atelier09/NomZippé.txt");
	        ZipOutputStream zip = new ZipOutputStream(file);
	        ZipEntry zipentry= new ZipEntry("src.atelier09/Zip");
	        zip.putNextEntry(zipentry);
	        FileInputStream in = new FileInputStream("src/atelier09/Nom.txt");

	        int lec;
	        while ((lec = in.read(buffer)) > 0) {
	             zip.write(buffer, 0, lec);
	        }

	        in.close();
	        zip.closeEntry();
	        zip.close();

	        System.out.println("Fichier compressé créé!");

	     }catch(IOException ex){
	        ex.printStackTrace();
	     }

	   }

	}
