#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
#define MaxSize 5

int q[MaxSize],f = -1 , r = -1;

bool isFull(){return ((r + 1) % MaxSize == f);}

bool isEmpty(){return f == -1 ;}

int readItem(){
    int item;
    printf("Enter the element to be enqueued ");
    scanf("%d",&item);
    return item;
}

void Enq(){
    if (isFull()){
        printf("Queue is full,OVERFLOW");
        return;
    }
    if(isEmpty()) f = r = 0;
    else r = (r+1) % MaxSize;
    q[r] = readItem();
    printf("Element successfully enqueued");
}

void Deq(){
    if(isEmpty()){
        printf("Queue is empty,UDERFLOW");
        return;
    }
    printf("Element removed from the queue is %d",q[f]);
    if(f == r) f = r =-1;
    else f = (f+1) % MaxSize;
}

void Display(){
    if(isEmpty()){
        printf("Queue is empty");
        return;
    }
    printf("Elements in the queue are : ");
    for (int i = f;i <= r;i++) printf(" %d ",q[i]);
    printf("\n");
}

int main() {
    int ch;
    printf("Queues\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\n");
    while (true) {
        printf("\nEnter your choice : ");
        scanf("%d", &ch);
        switch (ch) {
            case 1:
                Enq();
                break;
            case 2:
                Deq();
                break;
            case 3:
                Display();
                break;
            case 4:
                printf("Exiting the program\n");
                exit(0);
            default:
                printf("Invalid choice\n");
                break;
        }
    }
    return 0;
}