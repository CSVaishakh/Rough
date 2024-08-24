package com.vaishakh.Algorithms;
import java.util.Scanner;
public class binarysearch {
    public static int binary_search(int[] arr,int n,int x) {
        int start=0;
        int stop = x-1;
        while(start<=stop) {
            int mid = start+(stop-start)/2;
            if(n<arr[mid]) {
                stop = mid-1;
            }
            else if(n>arr[mid]) {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the element to be searched");
        int key=sc.nextInt();
        int result = binary_search(arr,key,n);
        if (result>-1){
            System.out.println("The element is present in the list at the index "+result);
        }
        else if (result==-1){
            System.out.println("The element is not present in the list");
        }
    }
}
