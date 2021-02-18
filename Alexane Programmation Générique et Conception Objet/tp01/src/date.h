/*
 * date.h
 *
 *  Created on: 2 f�vr. 2021
 *      Author: laari
 */

#ifndef DATE_H_
#define DATE_H_

#include <iostream>
#include <string>
using namespace std;

class date {
private:
	int jour;
	int mois;
	int annee;
public:
	date();
	date(int a, int b, int c);
	virtual ~date();
	bool compareTo(date d);
	void incrementer();
	string afficher() const;
        date& Incrementer();
        date& operator ++(); // redéfinition de ++
        bool operator ==(date d);


};


#endif /* DATE_H_ */
