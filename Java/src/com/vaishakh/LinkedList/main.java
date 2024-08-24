package com.vaishakh.LinkedList;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.head_insert(1);
        list.head_insert(2);
        list.head_insert(3);
        list.head_insert(4);
        list.tail_insert(5);
        list.insert_position(21,3);
        list.display();
        System.out.println("Deleted element is "+list.head_delete());
        list.display();
    }
}
