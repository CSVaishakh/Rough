#include<stdio.h>
#include<string.h>
int main(){
    int len,i;
    char str[15];
    printf("Enter the string : ");
    scanf("%s",str);
    len = strlen(str);
    for(i=0;i<len;i++){
        if(str[i]==str[len-i-1]){
            printf("The entered word %s is a palindrome",str);
            break;
        }
        else{
            printf("The word %s is not a palindrome",str);
            break;
        }
    }
    return 0;
}