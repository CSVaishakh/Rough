package com.vaishakh.Algorithms;

import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int flag=0,i;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element to be searched for in the array");
        int x = in.nextInt();
        for (i = 0; i < n; i++) {
            if(arr[i] == x){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("Element "+x+" is present in the array");
        }
        else{
            System.out.println("Element "+x+" is not present in the array");
        }
    }
}
