#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>

typedef struct LLPolyAdd{
    int coeff;
    int expo;
    Poly* next;
}Poly;

Poly* CreateNode(int coeff,int expo){
    Poly* NewNode = (Poly*)malloc(sizeof(Poly));
    NewNode->coeff = coeff;
    NewNode->expo = expo;
    NewNode->next = NULL;
    return NewNode;
}

void insertTerm(Poly** p,int coeff,int expo){
    Poly* NewNode = CreateNode(coeff,expo);
    if(p==NULL) *p = NewNode;
    else{
        Poly* temp = *p;
        while(temp->next != NULL){
            temp = temp->next;
        }
        temp->next = NewNode;
    }
}

void readPoly(Poly** p){
    int n,expo,coeff;
    printf("Enter the %d terms of the polynomial : ",n);
    for (int i = 0; i < n; i++){
        printf("Enter the coefficient : ");
        scanf("%d",&coeff);
        prinntf("Enter the exponent : ");
        scanf("%d",&expo);
        insertTerm(p,coeff,expo);
    }
}

Poly* AddPoly(Poly* p1,Poly* p2){
    Poly* result = NULL;
    while(p1!=NULL && p2!=NULL){
        if(p1->expo > p2->expo){
            insertTerm(&result,p1->coeff,p2->expo);
            p1 = p1->next;
        }
        else if(p1->expo < p2->expo){
            insertTerm(&result,p2->coeff,p2->expo);
            p2 = p2->next;
        }   
        else if(p1->expo == p2->expo){
            insertTerm(&result,p1->coeff+p2->coeff,p1->expo);
            p1 = p1->next;
            p2 = p2->next;
        }
    }
    while(p1!=NULL){
        insertTerm(&result,p1->coeff,p1->expo);
        p1 = p1->next;
    }
    while(p2!=NULL){
        insertTerm(&result,p2->coeff,p2->expo);
        p2 = p2->next;
    }
    return result;
}

