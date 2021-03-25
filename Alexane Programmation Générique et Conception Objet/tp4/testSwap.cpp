#include "swap.h"


void swap (int *a, int *b) {

	int c;
	c = *a;
	*a = *b;
	*b = c;
	/** passage par valeur**/
}
int main() {
	/**
	 * int a = 10;
	int a;
	cout << "Veuillez entrer un entier: " << endl;
	cin >> a ;
	//int b = 20;
	int b;
	cout << "Veuillez entrer un entier:" << endl;
	cin >> b ;
	int c;

	cout << "Avant swap: " << a << " " << b << endl;

	c = a;
	a = b;
	b = c;

	cout << "Après swap: " << a << " "<< b << endl;**/

	int a;
	int b;
	cout << "Veuillez entrer deux entiers: " << endl;
	cin >> a;
	cin >> b;
	cout << "Avant swap: " << a << " " << b << endl;
	swap(&a, &b);
	cout << "Après swap: " << a << " "<< b << endl;

}



