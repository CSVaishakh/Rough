#include<stdio.h>

struct poly{
    int coeff;
    int expo;
};

struct poly p1[10],p2[10],res[10];
void readPoly(int n,struct poly* p){
    printf("Enter the %d terms of the polynomial\n",n);
    for(int i = 0;i < n;i++){
        printf("Enter the coefficient : ");
        scanf("%d",p->coeff);
        printf("Enter the exponent : ");
        scanf("%d",p->expo);
    }
    
}
int main(){
    int n1,n2,max;
    printf("Enter the no of terms in first polynomial : ");
    scanf("%d",&n1);
    readPoly(n1,p1);
    printf("Enter the no of terms in second polynomial : ");
    scanf("%d",&n2);
    readPoly(n2,p2);
    int i=0,j=0,k=0;
    while(i<n1 && j<n2){
        if (p1[i].expo>p2[j].expo){
            res[k].coeff=p1[i].coeff;
            res[k].expo=p1[i].expo;
            i++;
            k++;   
        }
        if (p1[i].expo<p2[j].expo){
            res[k].coeff=p2[j].coeff;
            res[k].expo=p2[j].expo;
            j++;
            k++;   
        }
        if(p1[i].expo == p2[j].expo){    
            res[k].coeff = p1[i].coeff+p2[j].coeff;
            res[k].expo = p1[i].expo;
            i++;
            j++;
            k++;   
        }
    }
    while(i<n1){
         res[k].coeff=p1[i].coeff;
            res[k].expo=p1[i].expo;
            i++;
            k++; 
    }
    while(j<n2){
        res[k].coeff=p2[j].coeff;
        res[k].expo=p2[j].expo;
        j++;
        k++; 
    }
    max = k;
    for(i=0;i<max;i++){
        printf(" %dx^%d ",res[i].coeff,res[i].expo);
        if(i<max-1){
            printf(" + ");
        }
    }
}