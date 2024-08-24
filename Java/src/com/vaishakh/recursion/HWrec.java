package com.vaishakh.recursion;

import java.util.Scanner;

public class HWrec {
    public static void HW(int n){
        System.out.println("Hello World");
        if(n-1>=1) {
            HW(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many times hello world should be printed : ");
        int n = in.nextInt();
        HW(n);
    }
}
