package cours04;

import util.Keyboard;

/**
 * Création et gestion de dates (jour, mois, année)
 * 
 * @author montacie
 */
public class Date {
// attributs de classe
	private int jour, mois, annee;
	
	public boolean CompareTo (Date d) {
		if (getAnnee() != d.getAnnee()) return true;
		if (mois != d.mois) return true;
		if (jour != d.jour) return true;
		else return false;
		}
	/** Calcul de la date du lendemain */
	public void Incrementer () {
// Pas de taille indiquée dans la déclaration des tableaux
	int lmois[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
// prise en compte des annees bissextiles
	if (((getAnnee() % 4) == 0) && ((getAnnee() % 400) != 0)) lmois[1]++;
	jour++;
	if (jour > lmois[mois-1]) {
		jour = 1; mois ++;
		if (mois == 13) {setAnnee(getAnnee() + 1); mois = 1;}
		}
	}
	/** Affichage de la date */
	public void Afficher() { 
		System.out.println(jour+" "+mois+" "+getAnnee()); 
		}

	/** Lecture au clavier de la date */
	private void Lire() {// méthode lecture d'une date
		jour = Keyboard.getInt("Entrez le jour");
		mois = Keyboard.getInt("Entrez le mois");
		setAnnee(Keyboard.getInt("Entrez l'année"));
		}
	
	/**
	 * Création et initialisation d'une nouvelle instance de Date
	 * @param j jour
	 * @param m mois
	 * @param a année
	 */
	public Date(int j, int m, int a) {  
		jour = j; mois = m; setAnnee(a);
		}

	/**
	 * Création et lecture clavier d'une nouvelle instance de Date
	 */
	public Date() {Lire();}
	/**
	 * Comparaison entre deux dates
	 * @param d Date comparée
	 */
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}

	}// fin de la déclaration de la classe date

