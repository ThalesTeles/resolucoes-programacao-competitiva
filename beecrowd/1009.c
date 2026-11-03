#include <stdio.h>
#define MAX_STRING 100
int main() {
    char nome[MAX_STRING];
    double salario, vendas;
    scanf("%s %lf %lf", &nome, &salario, &vendas);
    printf("TOTAL = R$ %.2f", salario+(0.15*vendas));

    return 0;
}