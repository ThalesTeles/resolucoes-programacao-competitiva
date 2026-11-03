#include <stdio.h>
#define PI 3.14159
int main() {
    double num;
    scanf("%lf", &num);
    
    printf("A=%.4f\n", PI*num*num);
 
    return 0;
}