package com.vaishakh.inheriitance;

public class student {
        String name;
        int rollno;
        double cgpa;

        //Constructor:
        student(String name, int rollno, double cgpa) {
            this.name = name;
            this.rollno = rollno;
            this.cgpa = cgpa;
        }
        //constructor overloading:
        student(){
            this.name="Jon Snow";
            this.rollno = 65;
            this.cgpa = 7.0;
        }

}
