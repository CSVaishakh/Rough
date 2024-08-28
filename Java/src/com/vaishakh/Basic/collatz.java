package com.vaishakh.Basic;

import java.util.Scanner;

public class collatz {
    public static int collatz(int n){
        int len=0;
        if(n==1){
            System.out.println("The length of the sequence is 1");
        }
        while (n>1) {
            while (n % 2 == 1) {
                n = n * 3 + 1;
                len += 1;
                System.out.print(" " + n);
                if (n == 1) {
                    break;
                }
            }
            while (n % 2 == 0) {
                n = n / 2;
                System.out.print(" "+n);
                len += 1;
                if (n == 1) {
                    break;
                }
            }
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int ans=collatz(n);
        System.out.println();
        System.out.println(ans);
    }
}
