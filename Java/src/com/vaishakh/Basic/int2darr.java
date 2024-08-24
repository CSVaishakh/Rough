package com.vaishakh.Basic;
import java.util.Scanner;
public class int2darr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no.of rows of array");
        int x = in.nextInt();
        System.out.println("Enter the no. of columns of array");
        int y = in.nextInt();
        int[][] arr = new int[x][y];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
