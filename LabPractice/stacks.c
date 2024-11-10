#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>
#define MaxSize 5
int stk[MaxSize],top = -1;

int readItem(){
    int item;
    printf("Enter the element to be pushed : ");
    scanf("%d",&item);
    return item;
}

bool isFull() {return top == MaxSize-1;}

bool isEmpty() {return top == -1;}

void push(){
    if (isFull()){
         printf("Stack is full, OVERFLOW");
         return;
    }
    top++;
    stk[top] = readItem();
    printf("Element pushed to the stack");
}

void pop(){
    if (isEmpty()) {
        printf("Stack is empty, UNDERFLOW");
        return;
    }
    printf("Element poped from the stack is %d",stk[top]);
    top--;
}

void Display() {
    if(isEmpty()) {
        printf("\nStack is empty\n");
        return;
    }
    printf("Elements of the stack are : ");
    for(int i = top; i >= 0; i--) printf("%d ", stk[i]);        
}

int main(){
    int ch;
    printf("MENU\n1.Push\n2.Pop\n3.Dispaly\n4.Exit\n");
    while(true){
        printf("\nEnter your choice : ");
        scanf("%d",&ch);
        switch (ch){
            case 1:
                push();
                break;
            case 2:
                pop();
                break;
            case 3:
                Display();
                break;
            case 4:
                printf("Exiting the program\n");
                exit(0);
            default:
                printf("invalid Choice");
                break;
        }
    }
    return 0;
}
