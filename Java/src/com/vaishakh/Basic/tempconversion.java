package com.vaishakh.Basic;

import java.util.Scanner;

public class tempconversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in degreecelcius: ");
        float tempc =input.nextFloat();
        float tempf= (tempc*9/5)+32;
        System.out.println("Temperature in farenheit is : "+tempf);
    }
}
