#include <iostream>
#include <string>
using namespace std;

class carafe {
private:
	int contenu;
	int capacite;
public:
	carafe();
	void remplir();
	void vider();
	void transvaser(carafe& c);
	carafe(int a, int b);
	int getContenu();
	int getCapacite();

};
