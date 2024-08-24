package com.vaishakh.recursion;

import java.util.Scanner;

public class productofdigits {
    public static int pod(int n){
        if ((n%10)==n){
            return n;
        }
        return n%10*pod(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(pod(n));
    }
}
