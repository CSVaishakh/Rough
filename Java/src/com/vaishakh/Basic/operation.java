package com.vaishakh.Basic;
import java.util.Scanner;
public class operation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        System.out.println("Enter the operator");
        char op = in.next().charAt(0);
        if (op == '+') {
            System.out.println(num1 + num2);
        }
        if (op == '-') {
            System.out.println(num1 - num2);
        }
         if (op == '*') {
            System.out.println(num1 * num2);
        }
         if (op == '/') {
            System.out.println(num1 / num2);
        }
         if (op == '%') {
             System.out.println(num1 % num2);
         }

    }
}
