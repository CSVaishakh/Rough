package com.vaishakh.functions;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        int i,flag=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String str1 = in.nextLine();
        char[] ch1=str1.toCharArray();
        int x=str1.length();
        System.out.println("Enter the letter to be searched for");
        String str2 = in.nextLine();
        char[] ch2=str2.toCharArray();
        for (i = 0; i < x; i++) {
            if(ch1[i] == ch2[0]) {
                flag = 1;
            }
        }
        if(flag==1){
            System.out.println("The letter "+str2+" is present in the string");
        }
        else{
            System.out.println("The letter "+str2+" is not present in the string");
        }
    }
}
