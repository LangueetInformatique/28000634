#include <stack>
#include <iostream>

using namespace std;

// LAST IN FIRST OUT
// on peut ajouter le dernier élément, l'afficher ou le supprimer. Les autres sont inaccessibles.


void EssaisStack() {

	stack <int> pile; // une pile vide, valeur null
	pile.push(3); // on ajoute un élément à la pile
	pile.push(4);
	pile.push(5);

	cout << pile.top() << endl; // on consulte le sommet de la pile

	pile.pop(); // on supprime le dernier élément ajouté

	cout << pile.top() << endl; // on consulte le sommet de la pile

}
