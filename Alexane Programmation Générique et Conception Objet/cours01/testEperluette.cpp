#include "../../Alexane Programmation Générique et Conception Objet/cours01/testEperluette.h"

int main(int argc, char* argv[]) {
	int j = 0;

	increment1(j);
	cout << j << endl;

	increment2(j);
	cout << j << endl;
}

void increment1(int i) {
	i++;
}
void increment2(int & i) {
	i++;
}
