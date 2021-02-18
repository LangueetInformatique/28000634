#include <iostream>

#include "../../../Alexane Programmation Générique et Conception Objet/tp01/src/carafe.h"

int main(){
	carafe a(5,10);
	carafe b(6,10);

	cout << "Capacite" << a.getCapacite() <<endl;
	cout << "Contenu" << a.getContenu() << endl;

	return 0;

}
