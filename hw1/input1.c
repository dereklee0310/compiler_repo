#include <stdio.h>
#include <stdbool.h>
#include <complex.h>

#define CONSTANT 1024

typedef struct Boo {
    int member;
} Booo;

union Boo1 {
    int Foo;
};

inline void Foo() {
    return;
};

int main(int argc, char **argv) {
    static int arr[10];
    int * restrict arrPtr = arr; 
    char chr = 'c';
    char str = "string";
    const float flt = 0.123;
    extern double dbl;
    register short sht;
    unsigned long long ull;
    auto int au = 1;
    bool bl;
    double complex img = 4.0;

    return 0;
}

