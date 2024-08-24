package com.vaishakh.Basic;
import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=in.nextInt();
        if(num%2==0){
            System.out.println("the entered number is even");
        }
        else{
            System.out.println("The entered number is odd");
        }
    }
}
