package Devoir02;

public class Etudiant {
	String nom, prenom;
	int numero;
	int notes ; 
	double moyenne ;

	/**
	 *  constructeur vide
	 */
	public Etudiant() {
		
	}
	
	/**
	 *  constructeur non vide
	 * 
	 */
	
	public Etudiant(String nom, String prenom, int numero, int notes, double moyenne) {
	// avec numero pour le numéro Etudiant
		this.nom = nom;
		this.prenom = prenom;
		this.numero = numero;
		this.notes = notes;
		this.moyenne = moyenne;
	}
		public String getNom1() {
			return nom;
		}
		public String getPrenom1() {
			return prenom;
	}
		public int getNumero() {
			return numero;
		}
		public int notes() {
			return notes;
		}
		public double getMoyenne() {
			return moyenne;
		}

}
