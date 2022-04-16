#include<stdio.h>
#define max 5
int top = -1, item;
int n,i,stack[max];

void push()
{
    if(top >= max-1) printf("Overflow");
    else{
        printf("How  many elements to add ? ");
        scanf("%d",&n);
        for(int i = 0; i<n && top < max-1; i++){
            scanf("%d",&item);
            stack[++top] = item;
        }
    }
}

void pop()
{
    if(top == -1) printf("Underflow\n");
    else{
        item = stack[top--];
        printf("Deleted item : %d\n",item);
    }
}
void display(){
    if(top == -1)
        printf("Stack is empty\n");
    else{
        printf("Stack elements from top to 0 : ");
        for(i = top; i>=0; i--){
            printf("%d  ",stack[i]);
        }
        printf("\n");
    }
}
int main()
{
    int choice,loop;
    do{
        printf("\nFor push press 1, For pop press 2, For display() press 3 : ");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1: push();
                    break;
            case 2: pop();
                    break;
            case 3: display();
                    break;
            default: printf("Wrong choice\n");
                    break;
        }

        printf("Enter 1 to continue else 0 : ");
        scanf("%d",&loop);
    }while(loop!=0);
}
