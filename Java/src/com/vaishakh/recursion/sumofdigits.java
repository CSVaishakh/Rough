package com.vaishakh.recursion;

import java.util.Scanner;

public class sumofdigits {
    public static int sod(int n) {
        int sum = 0;
        if (n==0){
            return 0;
        }
        return (n%10)+sod(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println(sod(n));
    }
}
