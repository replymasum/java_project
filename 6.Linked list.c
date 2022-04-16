#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct linked_list
{
    int data;
    struct linked_list *next;
};

typedef struct linked_list node;
node* list = NULL;
node* tptr = NULL;
node* nptr = NULL;
node* tempnode = NULL;

void insert()
{
    int Roll;
    printf("Enter roll number: ");
    scanf("%d",&Roll);

    nptr = (node *)malloc (sizeof(node));
    nptr->data = Roll;
    nptr->next = NULL;

    tptr = list;

    if(tptr == NULL) list = nptr;
    else if(Roll < tptr->data){
        list = nptr;
        nptr->next = tptr;
    }
    else if(Roll >= tptr->data){
         while(Roll >= tptr->data) {
             if(tptr->next == NULL) {
                tptr->next = nptr;
                break;
            }
            tempnode = tptr;
            tptr = tptr->next;
         }
    }

    else {
        tempnode->next = nptr;
        nptr->next = tptr;
     }
}
void deleting()
{
    tptr = list;
    if(tptr == NULL){
        printf("Empty list\n\n");
        return;
    }
    int roll;
    printf("Enter data to delete : ");
    scanf("%d",&roll);
    if(roll == tptr->data){
        list = tptr->next;
        free(tptr);
        printf("%d is found and Deleted!\n",roll);
    }
    else if(roll != tptr->data){
        while(roll != tptr->data){
            if(tptr->next == NULL){
                printf("%d is not found\n\n",roll);
                break;
            }
        tempnode = tptr;
        tptr = tptr->next;
        }
    }
    else{
        if(tptr->next == NULL) tempnode->next = NULL;
        else tempnode->next = tptr->next;
        printf("%d is found and Deleted!\n",roll);
        free(tptr);
    }
}

void display(node* pointer)
{
    tptr = pointer;
    if(tptr != NULL){
        printf("%d ",tptr->data);
        display(tptr->next);
    }
}


int main(){
    printf("1.insert 2.Delete 3.Display\n");
    int choice;
    do{
        printf("\nchoice: ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: insert(); break;
            case 2: deleting(); break;
            case 3: display(list); break;
        }

    }while(choice != 0);
}
