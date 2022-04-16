#include <stdio.h>

void towerOfHanoi(int n, char BEG, char AUX , char END)
{
    if (n == 1){
        printf("Move disk 1 from %c to %c\n",BEG,END);
        return;
    }

    towerOfHanoi(n - 1, BEG, END, AUX);
    printf("Move disk %d from %c to %c\n",n,BEG,END);
    towerOfHanoi(n - 1, AUX, BEG, END);
}

int main()
{
    int n = 3; // Number of disks
    towerOfHanoi(n, 'A', 'B', 'C'); // A, B and C are names of rods
    return 0;
}
