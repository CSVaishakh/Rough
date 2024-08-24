package com.vaishakh.recursion;

import java.util.Scanner;

public class sum {
    public static int recur_sum(int n) {
        if (n<=1){return n;

        }
        return recur_sum(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum= recur_sum(n);
        System.out.println(sum);

    }
}

