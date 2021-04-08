#include "Rectangle.h"

/*
 * testRectangle.cpp
 *
 *  Created on: 8 avr. 2021
 *      Author: alexj
 */

int main(){

	Rectangle<int>r(-2, -7, -9, 6);
	cout << "Surface :" << r.surface() <<endl;
	cout << "Périmètre :" << r.perimetre() <<endl;

	return 0;

}


