package com.vaishakh.inheriitance;


public class main {
    public static void main(String[] args) {
//        student student1 = new student();
//        System.out.println(student1.name);

        studentdept student2 = new studentdept();
        System.out.println(student2.name+" , "+student2.dept+" , "+student2.rollno+" , "+student2.cgpa);

        studentdept student3 = new studentdept("Cersi",20,7.9,"CSE");
        System.out.println(student3.name+" , "+student3.dept+" , "+student3.rollno+" , "+student3.cgpa);
    }
}
