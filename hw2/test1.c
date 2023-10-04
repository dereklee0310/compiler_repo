#include <stdio.h>

void main()
{
	const int a = 1;
	static float b = 2.0;
	register double c = 3;
	short d = 4;
	double e = 0.7;

	e = (double) (b + a) * c - d;
	c -= (-a - c * !b);
	d = (int) ~(d << 3 / 5 % 2);
	
	return 0;
}