#include <string>

using namespace std;

#include "../../Alexane Programmation Générique et Conception Objet/cours04/TableauDyn.h"
#include "../../Alexane Programmation Générique et Conception Objet/tp01/date.h"
#include "../../Alexane Programmation Générique et Conception Objet/cours01/Etudiant.h"

template <typename U, typename T> class TableauDynQ : public TableauDyn<T> {
	protected:
	U quality;
	public:
	TableauDynQ<U,T>(unsigned int c, int p, U q) : TableauDyn <T> (c, p) {
	quality = q;}
	U getQuality() {return quality;}
};

int main() {
	Etudiant Pascal;
	Pascal.putnote(3, 15);
	date d(30,4,2006);
	
	TableauDynQ<Etudiant, date> tq(0,1, Pascal);
	tq.ecrire(0, d);
	tq.getQuality();
	
	
}
