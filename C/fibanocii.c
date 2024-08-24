#include<stdio.h>
int main(){
    int t1 = 0;
    int t2 = 1;
    int t3 = t1+ t2;
    int i,n;  
    printf("Enter the value of n");
    scanf("%d",&n);
    printf("%d  %d ",t1,t2);
    for(i=3;i<=n;i++){
        printf(" %d ",t3);
        t1=t2;
        t2=t3;
        t3=t1+t2;
    }
}