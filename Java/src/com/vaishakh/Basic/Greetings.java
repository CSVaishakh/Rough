package com.vaishakh.Basic;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Greetings Mr./Ms. "+name);
    }
}
