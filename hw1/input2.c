#include <stdio.h>

int main() {
    int choice = 0;

label:
    do {
        choice = 1;
        continue;
        goto label;
    } while(!choice);

    for(int i = 0; i < 0; i++)
        choice++;

    if(choice)
        choice = -1;
    else 
        choice = 1;

    switch (choice) {
        case 1:
            puts("Hello, world!");
            break;
        case 2:
            puts("Goodbye, world!");
            break;
        default:
            puts("what?");
            break;
    }

    return 0;
}
