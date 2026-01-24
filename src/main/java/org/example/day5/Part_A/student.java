package org.example.day5.Part_A;
import  java.util.Scanner;
public class student{
    String name;
    int no;
    double marks;

    public static void main(String[] args) {
        student s1 = new student();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        s1.name = sc.nextLine();
        System.out.print("Enter roll number: ");
        s1.no = sc.nextInt();
        System.out.print("Enter marks: ");
        s1.marks = sc.nextDouble();

        System.out.println("\nStudent Details:");
        System.out.println("Name: " + s1.name);
        System.out.println("Roll No: " + s1.no);
        System.out.println("Marks: " + s1.marks);
    }
}