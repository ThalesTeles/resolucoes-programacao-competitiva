#include <stdio.h>

int ehPossivelFormarSequenciaArtimetica(int , int , int );

int main(){
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    
    if (ehPossivelFormarSequenciaArtimetica(a, b, c)){
        printf("Yes");
    } else 
        printf("No");    
    

    return 0;
}

int ehPossivelFormarSequenciaArtimetica(int a, int b, int c){
    if((a + c + (-2 * b)) == 0){
        return 1;
    } else 
        if((b + c + (-2 * a)) == 0){
            return 1;
    } else 
        if ((a + b + (- 2 * c)) == 0){
            printf("entrou3");
            return 1;
        }
            
    return 0;
}