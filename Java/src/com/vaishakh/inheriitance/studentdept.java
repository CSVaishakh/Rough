package com.vaishakh.inheriitance;

public class studentdept extends student{
    String dept;

    public studentdept() {
        this.dept = "ai";
    }

    public studentdept(String name, int rollno, double cgpa, String dept) {
        super(name, rollno, cgpa);
        this.dept = dept;
    }
}
