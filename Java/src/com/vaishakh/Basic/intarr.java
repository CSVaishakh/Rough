package com.vaishakh.Basic;
import java.util.Scanner;
public class intarr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length if the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
