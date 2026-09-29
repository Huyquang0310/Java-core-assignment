package Bai_3;

import java.util.Scanner;

public class Student extends Person implements Role{
    private double gpa;

    public Student() {}

    public Student(String id, String name, int age, double gpa) {
        super(id, name, age);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void displayDetails() {
        System.out.printf("Student => id: %s, name: %s, age: %s, gpa: %.2f%n", id, name, age, gpa);
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input id: ");
        this.id = scanner.nextLine();
        System.out.print("Input name: ");
        this.name = scanner.nextLine();
        System.out.print("Input age: ");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.print("Input gpa: ");
        this.gpa = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public String getRoleName() {
        return "Student";
    }
}