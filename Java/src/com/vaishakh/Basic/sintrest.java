package com.vaishakh.Basic;

import java.util.Scanner;

public class sintrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal ammount");
        Long pr = sc.nextLong();
        System.out.println("Enter the interest rate");
        Float in = sc.nextFloat();
        System.out.println("Enter the term of the loan");
        int tm = sc.nextInt();
        float si= (pr*in*tm)/100;
        System.out.println("Total simple intrest for the loan is "+si);
        float re=pr+si;
        System.out.println("Total ammount to be repayed is "+re);
    }
}
