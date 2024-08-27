package com.vaishakh.LinkedList;

public class dLL {
//    structure of doubly linked list
    public class Node{
        int val;
        Node next;
        Node prev;
//    constructor

        public Node(int val) {
        this.val = val;
        }

        public Node(int val, Node next, Node prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
        }
    }
//    Defining head and tail
    private Node head;
    private Node tail;
//    size of the list
    private int size;
    public dLL() {
        this.size = 0;
    }
//    function to add element at the begining of the linked list
    public void head_insert(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
//    function to delete an element from the tail of the linked lsit
    public void tail_insert(int val){
        if(tail == null){
            head_insert(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
}
