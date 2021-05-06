#include <map>
#include <iostream>
#include <string>
#include <fstream> // pour lire le fichier

using namespace std;

void EssaisMap() {

/**		map <string, string> a;
		a["prenom"]= "Alexane";
		cout << a["prenom"];**/
		ifstream monFlux("mots.txt");  //Ouverture d'un fichier en lecture
		string mot;
		map <string, int> counter;
		while (monFlux >> mot) {
				++counter[mot];
			}
/**		for(auto & pairELement : counter) {
				cout << pairElement.first << " ";
				cout << pairElement.second << endl;
		}**/

}

/**    ifstream myFile;
    myFile.open("mots.txt");
    if(!myFile.is_open()) cout << 1;
    map<string, map<string, int> > categories;
    while(myFile.good())
    {
        string s;
        getline(myFile, s);
        int pos = s.find_first_of(' ');
        if(pos < 0) continue;
        string word = s.substr(0, pos);
        string category = word;
        s = s.erase(0, pos+1);
        while(s.size() > 0)
        {
            pos = s.find_first_of(' ');
            if(pos < 0)
                pos = s.size();
            string word = s.substr(0, pos);
            if(word != "")
                categories[category][word]++;
            s = s.erase(0, pos+1);
        }
    }
    for(map<string, map<string, int> >::iterator cit = categories.begin(); cit != categories.end(); ++cit)
    {
        cout << "Category - " << cit->first << endl;
        for(map<string, int>::iterator wit = cit->second.begin(); wit != cit->second.end(); ++wit)
            cout << "\tword: " << wit->first << ",\t" << wit->second << endl;

**/

