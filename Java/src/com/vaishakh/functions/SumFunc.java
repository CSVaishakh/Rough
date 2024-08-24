package com.vaishakh.functions;
import java.util.Scanner;

public class SumFunc {
    public static void sum(long n1, long n2) {
        long sum = n1 + n2;
        System.out.println("sum of the twuo numbers " + n1 + " & " + n2 + " is " + sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        long n1 = in.nextInt();
        System.out.println("Enter the second number");
        long n2 = in.nextInt();
        sum(n1, n2);
    }
}
