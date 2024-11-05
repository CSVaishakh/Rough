#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct Node{
    int data;
    struct Node* link;
};

struct Node* head = NULL;

int readItem(){
    int item;
    printf("Enter the value: ");
    scanf("%d", &item);
    return item;
}

struct Node* createNode(int item){
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    if (newNode == NULL) {
        printf("Memory allocation failed!\n");
        exit(1);
    }
    newNode->data = item;
    newNode->link = NULL;
    return newNode;
}

void display(){
    if (head == NULL){
        printf("List is empty\n");
        return;
    }
    struct Node* ptr = head;
    while (ptr != NULL) {
        printf("%d -> ", ptr->data);
        ptr = ptr->link;
    }
    printf("NULL\n");
}

void insert() {
    struct Node* temp = createNode(readItem());
    if (head == NULL) {
        head = temp;
        return;
    }
    struct Node* ptr = head;
    while (ptr->link != NULL) {
        ptr = ptr->link;
    }
    ptr->link = temp;
}

void createLL(int* n) {
    printf("Enter the nodes:\n");
    for (int i = 0; i < *n; i++) {
        printf("Node %d: ", i + 1);
        insert();
    }
}

void swap(struct Node* a, struct Node* b) {
    int temp = a->data;
    a->data = b->data;
    b->data = temp;
}

void bubbleSort(int n) {
    if (head == NULL || head->link == NULL) {
        return;
    }
    
    bool swapped;
    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        struct Node* current = head;
        struct Node* next = head->link;
        
        for (int j = 0; j < n - i - 1; j++) {
            if (current->data > next->data) {
                swap(current, next);
                swapped = true;
            }
            current = next;
            next = next->link;
        }
        
        if (!swapped) {
            break;
        }
        
        printf("Pass %d: ", i + 1);
        display();
    }
}


int main() {
    int n;
    printf("Enter the number of elements in the list: ");
    scanf("%d", &n);
    createLL(&n);
    printf("\nOriginal List:\n");
    display();
    
    bubbleSort(n);
    
    printf("\nSorted List:\n");
    display();

    return 0;
}