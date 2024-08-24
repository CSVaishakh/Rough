package com.vaishakh.functions;
import java.util.Scanner;
public class swap {
    public static void swap(int a , int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("The swapped values are");
        System.out.println("a= "+a+" & b= "+b);
    }
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the first number");
        a=num.nextInt();
        System.out.println("Enter the second number");
        b=num.nextInt();
        swap(a,b);

    }
}
