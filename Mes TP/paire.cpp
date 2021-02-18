# include "paire.h"

int main() {

	short n=0;
	cout << "Donnez entier" << endl ;
	cin >> n;

	if (parite(n)==true)
		cout << "n est pair" << endl;
	else
		cout << "n est impair" << endl;

	return 0;
}
