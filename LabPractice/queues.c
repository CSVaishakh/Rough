#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>
#define MaxSize 5

int q[MaxSize], f = -1, r = -1;

int readItem() {
    int item;
    printf("\nEnter the element to be enqueued : ");
    scanf("%d", &item);
    return item;
}

bool isFull() { return r == MaxSize - 1; }
    
bool isEmpty() { return (f == -1 && r == -1); }

void Enq() {
    if (isFull()) {
        printf("The queue is full, OVERFLOW\n");
        return;
    }
    if(isEmpty()) f = r = 0;
    else r++;
    q[r] = readItem();
    printf("Element added to queue\n");
}

void Deq() {
    if (isEmpty()) {
        printf("The queue is empty, UNDERFLOW\n");
        return;
    }
    printf("The element removed from the queue is %d\n", q[f]);
    if(f == r) {
        f = r = -1;
        return;
    }
    f++;
}

void Display() {
    if(isEmpty()) {
        printf("Queue is empty\n");
        return;
    }
    printf("Elements of the queue are : ");
    for(int i = f; i <= r; i++) printf("%d ", q[i]);
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