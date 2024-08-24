package com.vaishakh.Basic;
import java.util.Scanner;
public class largestnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        float num1 = in.nextFloat();
        System.out.println("Enter the second number");
        float num2 = in.nextFloat();
        if(num1>num2){
            System.out.println(num1+" is the largest of the both numbers entered");
        }
        else{
            System.out.println(num2+" is the largest of the both numbers entered");
        }
    }
}
