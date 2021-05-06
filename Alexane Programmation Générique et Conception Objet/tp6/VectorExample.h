#include <vector>
#include <iostream>
using namespace std;

void addEltInt(vector <int> &V, int &elt) {
	V.push_back(elt);
}

void addEltString(vector <string> S, string elt) {
	S.push_back(elt);
}

void EssaisVecteurs() {
	vector <int> v(5); // 5 = taille du tableau, 4 = valeurs que l'on ajoute
	v[0] = 12;
	v[1] = 24;
	v[2] = 36;
	v[3] = 48;
	v[4] = 52;
	cout << v.front() << endl; // affiche le premier élément
	cout << v.back() << endl; // affiche le dernier élément
	v.pop_back(); // suppresion de la dernière case du tableau


	cout << "----------------------------" <<endl;

	for (int elt : v) {
		cout << elt <<endl;
	}

	cout << "----------------------------" <<endl;

	v.push_back(80);
	v.erase(v.begin()+2); // il n'existe pas de fonction pour supprimer le 1er élément, il faut passer par erase.

	cout << "-------------------------------" <<endl;

/**	for (int i=0; i<v.size(); i++) {
		cout << v[i] << endl; **/ // ne fonctionne pas ici, cela dépend du compilateur
	//}

/**	vector <string> myVector(2);
	myVector[0] = "Pomme";
	myVector[1] = "Banane";


	// swap:
	vector <string> otherVector(1);
	otherVector[0]=myVector[0];

	myVector[0] = myVector[1];
	myVector[1] = otherVector[0];

	cout << myVector[0] <<endl;
	cout << myVector[1] <<endl;

	cout << "---------------------"<<endl;
	// ajout d'un élément grâce à la fonction précédemment définie
	string a = "Poire";
	addEltString(myVector, a);
	cout << myVector[2]<<endl;**/

	cout << "-------------------"<<endl;
	// ajout d'un élément grâce à la fonction précédemment définie

	int a = 5;
	addEltInt(v, a);
	for (int elt : v) {
			cout << elt <<endl;
		}
}


// ajouter un élément : push_back
// supprimer un élément : pop_back
// pas de fonction pour ajouter ou supprimer au début
// ceci est toutefois possible avec la deque
