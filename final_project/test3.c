#include <stdio.h>

int main()
{
    int a = 7, b = 77;
    int c = 77, d = -7777;

    printf("Test if else statements\n");
    // a > 7
    if(a >= 7)
        printf("a > 7\n");
    else
        printf("a < 7\n");

    // no output
    if(b == 7)
        printf("b == 7\n");

    // c < 78
    if(c < 80)
        if(c < 79)
            if(c < 78)
                printf("c < 78\n");
            else
                printf("error\n");
        else {
            printf("error\n");
        }
    else
        printf("error\n");


    return 0;
}
