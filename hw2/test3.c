int main()
{
		int *a;
		float b[] = {1, 2, 3};
		char c[10];
		int d = 4;
		double **e;

		a = &d;
		*(*e) = *a;
		b[2] = 4.8;

		printf("%s, %d,", "hello", &d);
}
