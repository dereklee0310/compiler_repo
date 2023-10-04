#include <stdio.h>
#include <stdbool.h>

int main(int argc, char **argv)
{
	int a, b;
	double c, d;
	float e, f;
	
	bool foo = (a <= b);
	int bar;

	foo = (b == c); // type mismatch
	foo = b != f; // type mismatch

	bar = a > b; // type mismatch

	c = a;
	a = c; // type mismatch

	return 0;
}
