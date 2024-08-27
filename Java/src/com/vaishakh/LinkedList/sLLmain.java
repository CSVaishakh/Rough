package com.vaishakh.LinkedList;

public class sLLmain {
    public static void main(String[] args) {
        sLL list = new sLL();
        list.head_insert(1);
        list.head_insert(2);
        list.head_insert(3);
        list.head_insert(4);
        list.tail_insert(5);
        list.insert_position(21,3);
        list.display();
        System.out.println(list.head_delete());
        list.display();
        System.out.println(list.tail_delete());
        list.display();
        System.out.println(list.index_delete(2));
        list.display();
        System.out.println("Value is present at node "+(list.search(2)+1));
    }
}
