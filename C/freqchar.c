#include<stdio.h>
#include<string.h>
int main(){
    int len1,i,count=0;
    char str1[15],str2[15];
    printf("Enter the string : ");
    scanf("%s",str1);
    printf("Enter the letter : ");
    scanf("%s",str2);
    len1 = strlen(str1);
    for(i=0;i<len1;i++){
        if(str1[i]==str2[0]){
            count++;
        }
    }
    printf("The letter %s repeats %d times in the string",str2,count);
}