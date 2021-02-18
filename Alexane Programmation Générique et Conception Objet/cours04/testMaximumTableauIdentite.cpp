#include "../../Alexane Programmation Générique et Conception Objet/cours03/Identite.h"
#include "../../Alexane Programmation Générique et Conception Objet/cours04/compareTo.h"
#include "../../Alexane Programmation Générique et Conception Objet/cours04/MaximumTableau.h"
#include "../../Alexane Programmation Générique et Conception Objet/cours04/TableauDyn.h"

int main() {
	
   compareTo<Identite> cmpIdentite;
   TableauDyn <Identite> t(0,1);
   Identite i1("Montacié","Claude"); t.ecrire(0, i1);
   Identite i2("Seddah", "Djamé"); t.ecrire(1, i2);
   Identite i3("Dzerdz","Anastazija"); t.ecrire(2, i3);
   
   int j = MaximumTableau(t, t.getCapacite(), cmpIdentite);
   
   cout << j << " " << t.lire(j) << endl;

   

return 0;
}
