#include <stdio.h>

void main()
{
    int a = 1, b = 100, c = 1000, d = 7777;
        
    a = 1 + 2 * b / 30; // 1 + (2 * 100 / 30) = 1 + 6 = 7
    b = (d % c + b - 100) % 100; // ((7777 % 100) + 100 - 100) % 100 = 77
    d = -1 * 7777 + 777 + -10 * b + (-a); // -7777 + 777 - 770 - 7 = -7777


    printf("Test arithmetic expression and statement\n");
    printf("%d\n", a);
    printf("%d\n", b);
    printf("%d\n", 6 * 100 - (7 - a) + 177); // c = 600 - 0 + 177 = 777
    printf("%d\n", d);
}



