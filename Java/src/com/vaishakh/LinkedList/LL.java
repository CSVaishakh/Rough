package com.vaishakh.LinkedList;

public class LL {
    //defining the structure of a linked list
    private class Node {
        private int value;
        private Node next;

        //constructor
        public Node(int value) {
            this.value = value;
        }
        //CONSTRUCTOR
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
//    defining node head and tail
    private Node head;
    private Node tail;
//defining the size of the linkedlist
    private int size;

    public LL() {
        this.size = 0;
    }
//function to add an element at the beginning of the linked list
    public void head_insert(int val){
        Node node = new Node(val);
         node.next = head;
         head = node;
         if (tail == null){
             tail = head;
         }
         size +=1;
    }
//function to add an element at the end of a linkedlsit
    public void tail_insert(int val){
        if (head == null){
            head_insert(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
//function to insert an element at a desired index
    public void insert_position(int val, int index){
        if (index == 0){
            head_insert(val);
            return;
        }
        if (index == size){
            tail_insert(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;

    }
//    function to print all the nodes(elements) of a linked list
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
//    function to delete an element at the beginning of the linked list
    public int head_delete(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
//    function to get element at the size -2 position of the linked list
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
//    function to delete an element from the tail of the linked list
    public int tail_delete(){
        if (size<=1){
            return head_delete();
        }
        int val = tail.value;
        tail = get(size-2);
        tail.next = null;
        size--;
        return val;
    }
//    function to delete an element from a certain index position
    public int index_delete(int index){
        if (index == 0){
            return head_delete();
        }else if(index == size-1){
            return tail_delete();
        }
        Node temp = get(index-1);
        int val = temp.next.value;
        temp.next = temp.next.next;
        return val;
    }
//    function to search for a value in a singly linked list
    int search(int value){
        Node temp = head;
        int cnt=0;
        while (temp != null) {
            if (temp.value == value) {
                cnt++;
            }
            temp = temp.next;
        }
        if (cnt==0){
            return 0;
        }
        return cnt;
    }
}

