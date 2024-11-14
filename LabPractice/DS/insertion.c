#include<stdio.h>
int main(){
    int i,j,temp,n,flag = 0;
    printf("Enter the size of the array to be sorted : ");
    scanf("%d",&n);
    int arr[n];
    printf("Enter the %d elements of the array to be sorted : ",n);
    for(i=0;i<n;i++) scanf("%d",&arr[i]);
    for(i=0;i<n;i++){
        temp = arr[i];
        for(j=i-1;j>=0;j--){
            if(arr[j]>temp){
                arr[j+1] = arr[j];
                flag = 1;
            }else break;
        }
        if(flag) arr[j+1] = temp;
    }
    printf("The sorted lsit is : ");
    for(i=0;i<n;i++) printf(" %d ",arr[i]);
    return 0;
}