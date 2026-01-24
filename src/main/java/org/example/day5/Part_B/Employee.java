package org.example.day5.Part_B;
//       1 Create a class Employee
//       2 Declare instance variables:id, name, salary
//       3 Create a constructor that accepts these values
//       4 Inside constructor, assign values using this
//       5 Create a method to display details
//       6 In main (), create object and call display method
import java.util.Scanner;
public class Employee {

    int id;
    String name;
    double salary;

    // this is Constructor
    Employee(int id,String name,double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = sc.next();
        System.out.println("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        // Object creation (constructor called)
        Employee emp = new Employee(id,name,salary);
        emp.display();
    }
}
