#include <stdio.h>

struct Person {
   char name[16];
   int age;
};


// comment1

/*
    comment2
*/

int main() {
    int var = 1;

    struct Person *personPtr;
    personPtr = (struct Person*) malloc(sizeof(struct Person));
    personPtr->age = 18;
    (*personPtr).age *= 2;


    if(var >= 1 || var != 5 && (var << 3))
        var %= 3;
    else
        var += 3;
    
    var <<= 7;
    var = (~var)>>2;
    var ^= 32;
    var++;
    
    return 0;
}
