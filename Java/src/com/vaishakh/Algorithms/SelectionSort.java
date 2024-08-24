package com.vaishakh.Algorithms;

import java.util.Scanner;

public class SelectionSort {
    public static int cindex(int[] arr,int n){
        //returning the index of the maximum element;
        int cindex=0;
        for(int i=0;i<n;i++){
            if (arr[i]>arr[cindex]){
                cindex=i;
            }
        }
        return cindex;
    }

    public static int[] swap(int[] arr , int currentindex , int x) {
        int temp = arr[x];
        arr[x] = arr[currentindex];
        arr[currentindex] = temp;
        return swap(arr,currentindex,x-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the list");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the list");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ci = cindex(arr,n);
        int[] sortedarray = swap(arr,ci,n-1);
        System.out.println("Sorted array is : ");
        for(int i=0;i<n;i++){
            System.out.print(sortedarray[i]+" ");
        }
    }
}
