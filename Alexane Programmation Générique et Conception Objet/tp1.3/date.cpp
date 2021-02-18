#include "../../Alexane Programmation Générique et Conception Objet/tp1.3/date.h"

date::date() {
	int date = jour, mois, annee;
	jour = new int;
	mois = new int;
	annee = new int;
}

date::~date() {

}

date::date(int a, int b, int c) { // constructeur arguments entree
	jour = a;
	mois = b;
	annee = c;
}

void date::afficher(){ // afficher le contenu de la date
	cout << "La date et l\'heure sont: " << endl;
	cout << jour << " " << mois << " " << annee << endl;
}

bool date::compareTo(date d) {
	if (annee != d.annee) {
		return true;
	}
	if (mois != d.mois) {
		return true;
	}
	if (jour != d.jour) {
		return true;
	} else {
		return false;
	}
}

void date::incrementer() {
	int lmois[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	// prise en compte des annees bissextiles
		if (((annee % 4) == 0) && ((annee % 400) != 0)) lmois[1]++;
		jour++;
		if (jour > lmois[mois-1]) {
			jour = 1; mois ++;
			if (mois == 13) {
				annee++; mois = 1;
			}
			}
}
