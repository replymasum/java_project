#include<stdio.h>
#include<stdbool.h>
#define MAX 5

int list[MAX] = {50,40,30,20,10};

void display(){
    printf("[");
    for(int i =0;i<MAX; i++)
        printf("%d ",list[i]);
    printf("]\n");
}

void bubbleSort(){
    int temp;
    for(int i = 0; i<MAX; i++)
    {
        for(int j = 0; j<MAX-1-i; j++){
            if(list[j] > list[j+1]){
                temp = list[j];
                list[j] = list[j+1];
                list[j+1] = temp;
            }
        }
        printf("Iteration %d ",i+1);
        display();
    }
}

int main()
{

    printf("Input Array : ");
    display();
    printf("\n");
    bubbleSort();
    printf("Output Array : ");
    display();

    return 0;
}

