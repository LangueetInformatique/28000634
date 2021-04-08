#include "Vecteur.h"

int main() {

	int t[5] = {1, 2, 3, 4};

	for (int i = 0; i<5; i++){
		cout<<t[i]<<endl;
	}

	vector<int> tableau(5);
	tableau[0] = 10;
	tableau[1] = 20;
	tableau[2] = 30;
	tableau[3] = 40;
	tableau[4] = 50;
	tableau[5] = 60;

	cout <<tableau.front() <<endl;
	cout <<tableau.back() <<endl;

	tableau.push_back(80); //pour ajouter des éléments à la fin
	tableau.erase(tableau.begin()+2); // pour supprimer l'élément du vecteur d'indice 2

	for (int i=0; i<tableau.size(); i++){
		cout << tableau[i]<<endl;
	}
	return 0;
}
