#include <stdlib.h>
#include <stdio.h>

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize) {
    free(returnSize);
    returnSize = (int*) malloc(2  * sizeof(int));

    int i = 0, j = numsSize-1;
    // O tamanho do array recebido sempre será de no minimo 2
    do{
        printf("Comeco i:%d j:%d\n", i, j);
        if((nums[i] + nums[j]) == target){
            returnSize[0] = i;
            returnSize[1] = j;
            printf("Retorno i:%d j:%d\n", i, j);
            printf("Retorno i:%d j:%d\n", returnSize[0], returnSize[1]);
            return ;
        }
        j--;
        if(j <= i){
            j = numsSize - 1;
            i++;
        }
        printf("Final i:%d j:%d\n", i, j);
    } while (i != numsSize - 1 && j >= 0);     
    
    return returnSize;
}

int main(){
    int* result;
    int nums[] = {2, 7, 11, 15};
    twoSum(nums, 4, 9, result);
    printf("[%d, %d]", result[0], result[1]);

    return 0;
}