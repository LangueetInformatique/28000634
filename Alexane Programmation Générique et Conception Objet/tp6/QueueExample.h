#include <queue>
#include <iostream>

using namespace std;


void EssaisQueue() {
	priority_queue<int> file;
	file.push(5);
	file.push(8);
	file.push(10);
	file.push(3);

	cout << file.top() << endl; // affiche le plus grand des éléments insérés

}
