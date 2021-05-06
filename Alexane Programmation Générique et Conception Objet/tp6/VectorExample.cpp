#include <vector>
#include <iostream>

using namespace std;



int main() {

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



return 0;

}
