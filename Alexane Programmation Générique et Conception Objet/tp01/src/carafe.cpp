#include "../../../Alexane Programmation Générique et Conception Objet/tp01/src/carafe.h"

#include "../../../Alexane Programmation Générique et Conception Objet/tp01/src/carafe_main.cpp"

carafe::carafe(int a, int b) {
	contenu = a;
	contenu = b;
}

void carafe::remplir() {
	contenu = capacite;
}

void carafe::vider(){
	contenu=0;
}

int carafe::getContenu(){
	return contenu;
}

int carafe::getCapacite(){
	return capacite;
}

void carafe::transvaser(carafe c) {
	if (((contenu + c.contenu) <= c.capacite)) {
				c.contenu += contenu;
				contenu = 0;
	} else {
		contenu -= (c.capacite - c.contenu);
		c.contenu = c.capacite;
	}
}
