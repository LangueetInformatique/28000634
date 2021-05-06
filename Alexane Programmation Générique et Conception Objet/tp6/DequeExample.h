// on peut ajouter/supprimer au début et à la fin

#include <deque>
#include <iostream>

using namespace std;

void EssaisDeque() {

	deque <int> d(4, 5);
	d.push_front(2);
	d.push_back(8);

  /**  for (int i(0);i <d.size() ; i++) {
		cout << d[i] << " ";
	}**/

}
