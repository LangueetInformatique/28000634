void swap (int *a, int *b);
void swap2 (int &a, int &b);

template <typename T>
void swap1(T& a, T& b){
	T c;
	c = a;
	a = b;
	b = c;
}
