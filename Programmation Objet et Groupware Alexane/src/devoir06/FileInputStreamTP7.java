package devoir06;

import java.io.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.zip.DeflaterOutputStream;

import javax.swing.JFileChooser;

import util.Keyboard;

public class FileInputStreamTP7 extends FileInputStream {



	public FileInputStreamTP7(File file) throws FileNotFoundException {
		super(file);
		// TODO Auto-generated constructor stub
	}

	public static File Copie(File fichier, File fichier2) throws IOException {
	
	File source = fichier;
	File cible = fichier2;
	FileReader fr = new FileReader(source);
	@SuppressWarnings("resource")
	BufferedReader br = new BufferedReader(fr);  
    // Créer l'objet File Writer
    FileWriter fw = new FileWriter(cible);      
    String str = null;
    // Copie le contenu dans le nouveau fichier
    while((str = br.readLine()) != null)             
    {
       fw.write(str);
       fw.write("\n");
    }
    fw.close();
	return cible.getAbsoluteFile();
	}
	
	public static File Compresse(File fichier3, File fichier4) throws IOException {
		
		try {
			String rep = "src/atelier09/";
			File fin = new File(rep + Keyboard.getString(fichier3));
			FileInputStreamTP7 fis = new FileInputStreamTP7(fin);
			File fout = new File(rep + Keyboard.getString(fichier4));
			FileOutputStream fos = new FileOutputStream(fout);
			DeflaterOutputStream dos = new DeflaterOutputStream(fos);

			// calcul de la taille du fichier et copie
			long taille = fin.length();
			byte mem[] = new byte[(int) taille];
			fis.read(mem);
			dos.write(mem);

			fis.close();
			dos.close();
		}

		catch (EOFException e) {
			System.out.println("Fin de lecture de fichier");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fichier4;
	}
	
	/* public static File Propriétés(File fichier5) throws IOException {

			return fichier5.lastModified();
	
	     
	}
	
	
		
		*/
	
}