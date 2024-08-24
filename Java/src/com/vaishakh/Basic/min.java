package com.vaishakh.Algorithms;
import java.util.Scanner;
public class min {
    public static void max(int x,int[] arr) {
        int temp,i,j;
        for(i=0;i<x;i++) {
            for(j=0;j<x-1;j++) {
                if(arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("The minimum value in the list is "+arr[0]);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
        max(n,arr);
    }
}
