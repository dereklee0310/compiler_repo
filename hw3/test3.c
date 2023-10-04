int main()
{
	char a = 0, b = 0;
	double c, d;
	bool e, f;

	for(a = ; a < 3; a++)
		b += 1;
	
	while(c) { // invalid condition type
		c = 1.2;
		d = 3.4;
	}

	do { // invalid condition type
		b++;
	} while (d);

	if(a == b) {
		a -= 1;
	} else if(d) { // invalid condition type
		a *= 2;
	} else if(e)
		a += 3;

	return 0;
}
