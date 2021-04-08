#include <iostream>
#include <ostream>
#include <stdlib.h>

using namespace std;


template <typename T> class Rectangle{
private: // attributs
	T x_a;
	T x_b;
	T y_a;
	T y_b;

public: //méthodes
	T surface() const;
	T perimetre() const;
	//bool estContenu(T x, T y);

	Rectangle(T x_a, T x_b, T y_a, T y_b);

	//int surface = (abs(x_b)-abs(x_a))*(abs(y_a)-abs(y_b));
	//int perimetre = 2*(abs(x_b)-abs(x_a))+2*(abs(y_a)-abs(y_b));

};

template <typename T>
Rectangle<T>::Rectangle(T x_a, T x_b, T y_a, T y_b) {
	this->x_a = x_a; //this est un pointeur, il signifie "cet objet"
	this->y_a = y_a;
	this->x_b = x_b;
	this->y_b = y_b;
}

template<typename T>
T Rectangle<T>::surface() const{
	T surface = (abs(x_b)-abs(x_a))*(abs(y_a)-abs(y_b));
	return surface;
}

template<typename T>
T Rectangle<T>::perimetre() const{
	T perimetre = 2*(abs(x_b)-abs(x_a))+2*(abs(y_a)-abs(y_b));
	return perimetre;
}
