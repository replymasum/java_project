#include<stdio.h>
#define MAX 6
int Array[MAX] = {14,33,27,10,35,19};
void display(){
    int k;
    printf("[");
    for(k = 0; k<MAX ; k++)
        printf("%d ",Array[k]);
    printf("]\n");
}

void insertionSort()
{
    int i,j,temp;

    for(i = 1; i<MAX; i++){
        for(j = i; j>0; j--){
            if(Array[j]< Array[j-1]){
                temp = Array[j];
                Array[j] = Array[j-1];
                Array[j-1] = temp;
            }
        }
        printf("Iteration %d : ",i);
        display();
    }
}

int main()
{
    printf("Input Array : ");
    display();
    insertionSort();
    printf("\nOutput Array : ");
    display();
}

