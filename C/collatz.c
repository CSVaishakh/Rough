#include<stdio.h>
int collatz(int n){

    int l = 0;
    if(n==0){
        printf("The length of the series is 1");
    }else{
        while(n>1){
            while(n%2==1){
                
                n=n*3+1;
                printf(" %d ",n);
                l+=1;
                if(n==1){
                    break;
                }

            }

            while (n % 2==0){
                
                n =   n / 2;
                printf(" %d ",n);
                l+=1;
                if(n==1){
                    break;  
                }
            }
            
        }
    }
    return l;
}
int main(){
    int n;
    printf("Enter a number\n");
    scanf("%d",&n);
    printf("\n");
    int ans = collatz(n);
    printf("\n %d \n",ans);
}