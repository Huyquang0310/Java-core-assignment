package Bai_3;

import java.util.Scanner;

public class Teacher extends Person implements Role {
    private String subject;

    public Teacher() {
    }

    public Teacher(String id, String name, int age, String subject) {
        super(id, name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.printf("Teacher => id: %s, name: %s, age: %s, subject: %s", id, name, age, subject);
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
        System.out.print("Input subject: ");
        this.subject = scanner.nextLine();
    }

    @Override
    public String getRoleName() {
        return "Teacher";
    }
}