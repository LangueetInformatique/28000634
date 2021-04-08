#include "swap.h"
#include <iostream>
#include <ostream>

using namespace std;


void swap (int *a, int *b) {

	int c;
	c = *a;
	*a = *b;
	*b = c;
	/** passage par valeur**/
}

void swap2 (int &a, int &b) {

	int c;
	c = a;
	a = b;
	b = c;

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

	/**int a;
	int b;
	cout << "Veuillez entrer deux entiers: " << endl;
	cin >> a;
	cin >> b;
	cout << "Avant swap: " << a << " " << b << endl;
	swap(&a, &b);
	cout << "Après swap: " << a << " "<< b << endl;
**/

	float x;
	float y;
	cout << "Veuillez entrer deux entiers: " << endl;
	cin >> x;
	cin >> y;
	cout << "Avant swap: " << x << " " << y << endl;
	swap1(x, y);
	cout << "Après swap: " << x << " "<< y << endl;

	return 0;



}



