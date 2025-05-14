#include<stdio.h>
#include<stdbool.h>
bool threeConsecutiveOdds(int* arr, int arrSize) {
    int count = 0,i=0;
    while(count<3){
        if (arr[i]%2!=0) count++;
    }
    if(count == 3) return true;
    return false;
}
int main(){
    int arr[] = {1,2,3,5,7};
    bool res = threeConsecutiveOdds(arr, 5);
    printf("%d\n", res);
    return 0;
}