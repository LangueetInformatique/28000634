package atelier09;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Decompresse {
	
	/*Exercice 3 : Créer exécutable la classe Décompresse qui permet de décompresser le contenu d’un fichier.*/

/*	package com.over-blog.patatos.java.zip;

	//Importation des packages dont on va se servir


	public class MyZip{

	    /**
	     * décompresse le fichier zip dans le répertoire donné
	     * @param folder le répertoire où les fichiers seront extraits
	     * @param zipfile le fichier zip à décompresser
	     * @throws FileNotFoundException
	     * @throws IOException
	     */
	    public static void unzip(File zipfile, File folder) throws FileNotFoundException, IOException{

	        File file = null;
			// création de la ZipInputStream qui va servir à lire les données du fichier zip
	        ZipInputStream zis = new ZipInputStream(
	                new BufferedInputStream(
	                        new FileInputStream(file.getCanonicalFile())));
	    	
	       // public void main(String[] args) throws Exception {
	    	  //  File zipfile = new File(args[0]);
	    	   // File folder = new File(args[1]);

	    	    // MyZip.unzip(zipfile, folder);

	        // extractions des entrées du fichiers zip (i.e. le contenu du zip)
	        ZipEntry ze = null;
	        try {
	            while((ze = zis.getNextEntry()) != null){

	                // Pour chaque entrée, on crée un fichier
	                // dans le répertoire de sortie "folder"
	                File f = new File(folder.getCanonicalPath(), ze.getName());
	           
	                // Si l'entrée est un répertoire,
	                // on le crée dans le répertoire de sortie
	                // et on passe à l'entrée suivante (continue)
	                if (ze.isDirectory()) {
	                    f.mkdirs();
	                    continue;
	                }
	                
	               
	                // L'entrée est un fichier, on crée une OutputStream
	                // pour écrire le contenu du nouveau fichier
	                f.getParentFile().mkdirs();
	                OutputStream fos = new BufferedOutputStream(
	                        new FileOutputStream(f));
	           
	                // On écrit le contenu du nouveau fichier
	                // qu'on lit à partir de la ZipInputStream
	                // au moyen d'un buffer (byte[])
	                try {
	                    try {
	                        final byte[] buf = new byte[8192];
	                        int bytesRead;
	                        while (-1 != (bytesRead = zis.read(buf)))
	                            fos.write(buf, 0, bytesRead);
	                    }
	                    finally {
	                        fos.close();
	                    }
	                }
	                catch (final IOException ioe) {
	                    // en cas d'erreur on efface le fichier
	                    f.delete();
	                    throw ioe;
	                }
	            }
	        }
	        finally {
	            // fermeture de la ZipInputStream
	            zis.close();
	        }
	    }

	//Pour utiliser la méthode unzip il n'y a qu'à faire l'appel suivante depuis n'importe quelle autre méthode:

	// MyZip.unzip("patatos.zip", "C:/patatos");

	// Ce qui va décompresser "patatos.zip" dans "C:/patatos".

	// On peut éventuellement rajouter une méthode main à notre class MyZip:
	    
	}
	


