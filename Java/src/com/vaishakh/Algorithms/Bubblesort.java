package com.vaishakh.Algorithms;

import java.util.Scanner;

public class Bubblesort {
    public static int[] bubblesort(int[] arr){
        int i,j,temp;
        for( i=0; i<arr.length; i++){
            for( j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] ans=bubblesort(arr);
        for(int i=0; i<n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}

