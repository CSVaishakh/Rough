package com.vaishakh.Basic;
import java.util.Scanner;
public class curcon {
    public static void main(String[] args) {
        Scanner ch=new Scanner(System.in);
        System.out.println("Enter the currency you need to convert(USD/INR);");
        String cur=ch.nextLine();
        if (cur.equals("USD")){
            System.out.println("Enter the amount to be converted");
            double am=ch.nextDouble();
            double amcon=am*83.36;
            System.out.println(am+" USD is "+amcon+" INR");
        }
        if (cur.equals("INR")){
            System.out.println("Enter the amount to be converted");
            double am=ch.nextDouble();
            double amcon=am/83.36;
            System.out.println(am+" INR is "+amcon+" USD");
        }
        ch.close();
    }
}
