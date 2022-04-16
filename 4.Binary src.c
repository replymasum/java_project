#include<stdio.h>
int main()
{
    int search, low, high, mid;
    int a[] = {1,2,3,4,5};
    int n = sizeof(a)/sizeof(a[0]);
    printf("a = [ ");
    for(int i = 0; i<n; i++)
            printf("%d ",a[i]);
    printf("]\n");

again:
    printf("\nEnter a number to search : ");
    scanf("%d",&search);

	low = 0;
    high = n-1;
    mid = (low + high)/2;

    while(high>=low){
        if(search < a[mid])
            high = mid - 1;
        else if(search > a[mid]){
            low = mid + 1;
        }
        else if(search == a[mid]){
            printf("%d is present at location %d\n",search,mid+1);
            break;
        }
        mid = (low + high)/2;
    }
    if(high < low)
        printf("%d is not present in the array\n",search);
    goto again;

    return 0;
}

