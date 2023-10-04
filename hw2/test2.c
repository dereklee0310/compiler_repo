#include <stdio.h>

int main(int argc, char **argv)
{
		const int a = 1;
		static float b = 2.0;
		register double c = 3;
		short d = 4;
		double e = 0.7;

		if(a == 1 || b <= 3 && c > 5)
			d--;

		if(b + 1 != 7)
			b = 3;
		else 
			b -= 2;

		if(c - 1 * 6 >= 3) {
			if(c > 6)
				b = 3.0;
			c = 4.0;
		} else if (c + 2 == 7) {
			b = 5.0;
		} else
			b -= 1;

		while (1 > 3) {
			if(b > 2)
				break;
			else
				continue;
			b++;
		}

		do {
			c -= 4;
		} while (b < 0);
		
		int i;
		for(i = 0; i < a; i++)
			i *= 4;

		switch(a) {
			case 1:
				b -= 2;
				break;
			case 2:
				b += 2;
				break;
			default:
		}
	
	return 0;
}
