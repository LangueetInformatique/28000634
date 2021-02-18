/** Créer le programme exécutable MonPremierFichierTexte qui écrit dans le fichier texte « Naissance.txt » votre date de naissance.**/

#include <iostream>
#include <fstream>
#include <string>

using namespace std;

void Verifier(string nomfichier, char* dateAnniv) {
	ifstream fichier;
	string contenu;
	fichier.open(nomfichier, ios::in);
	if (fichier.fail()) {
		cerr << "erreur ouverture";
	} else {
		getline(fichier, contenu);
		if (dateAnniv == contenu) {
			cout << "identiques" << endl;
		} else {
			cout <<"différents" << endl;
		}
	}
}

int main()
{
	ofstream flotOut; // ofstream : output file stream ; ifstream : input file stream
	flotOut.open ("naissance.txt", ios::out);

	if (flotOut.fail()) {
		cout << "Impossible d'ouvrir le fichier en écriture !" << endl;
	} else {
		char phrase[1000];
		cout << "Veuillez entrer votre date de naissance : \n";
		cin.getline(phrase, 1000);
	    flotOut << phrase << endl;
	}
	char phrase2[1000];
	cout << "Donnez une date à comparer : \n";
	cin.getline(phrase2, 1000);
    Verifier("naissance.txt", phrase2);

}

/** Ajouter au programme exécutable MonPremierFichierTexte la fonction Verifier qui vérifie si le fichier « Naissance.txt » contient bien .votre date de naissance. **/

