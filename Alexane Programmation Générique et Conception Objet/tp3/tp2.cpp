/**
 * Exercice 0 : Soit un tableau tab de 20 entiers de type short (que vous créez manuellement),
 * écrire un programme qui va écrire ce tableau dans un fichier binaire tp2.bin.
 * Essayez d’ouvrir ce fichier avec un éditeur de texte standard.
 */

#include <iostream>
#include <fstream>
#include <string>

using namespace std;

/**
int main() {

	ofstream monFichier; // ofstream : output file stream ; ifstream : input file stream
	monFichier.open ("tp2.bin", ofstream::out|ofstream::binary);

	if (monFichier.fail()) {
		cout << "Impossible d'ouvrir le fichier en écriture !" << endl;
	} else {
		char d;
		int tableau[20] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6 , 5, 4, 3, 2, 1, 2, 3, 4};
        for (int i = 0; i < 21; i++) {
        	monFichier.write((char*)tableau[i]);
        }
        monFichier.close();
        return 0;

	}

}
**/
int main() {
	short tableau[3];
	for (int i=0; i<3; i++) {
		cout <<"Nombre"<<endl;
		cin >> tableau [i];
}
	ofstream fichier ;
	fichier.open("tp2.bin", ofstream::out|ofstream::binary);
	if (fichier.fail()) {
		cerr << "Erreur ouverture";
	} else {
		for (int i = 0 ; i < 3 ; i++) {
			fichier.write((char*) &tableau[i] /* adresse de la variable que l'on veut écrire */, sizeof(tableau[i]) /*taille du tableau que lon veut*/);
		}

	}
	fichier.close();
	return 0;

}

/**
 * Exercice 1 : Soit le fichier binaire « tp2.bin » contenant des entiers de type short.
 * Ecrire un programme permettant de lire le ième entier.
 * Tester votre programme avec i = 10.
 */

/**
 * Exercice 2 : Soit le fichier binaire « tp2.bin » contenant des entiers de type short.
 * Ecrire un programme permettant de modifier le ième entier.
 * Tester votre programme avec i = 10.
 */

/**
 * Exercice 3 : Créer le programme exécutable Copie qui permet de copier le contenu d’un fichier dans un autre.
 */
