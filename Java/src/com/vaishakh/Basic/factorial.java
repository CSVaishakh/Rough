package com.vaishakh.Basic;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f=1;
        System.out.println("Enter the number whose factorial is to be found");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            f=f*i;
        }
        System.out.println(f);
    }
}
