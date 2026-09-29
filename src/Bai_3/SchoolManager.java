package Bai_3;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolManager {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Person> personList = new ArrayList<>();

    public void addPerson() {
        System.out.println("\n=========== Bạn tạo mới ai ===========");
        System.out.println("1. Giáo viên");
        System.out.println("2. Sinh viên");
        System.out.print("Bạn chọn gì: ");
        int choice = Integer.parseInt(scanner.nextLine());
        Person person = null;
        switch (choice) {
            case 1:
                person = new Teacher();
                person.input();
                break;
            case 2:
                person = new Student();
                person.input();
                break;
        }

        personList.add(person);
    }

    public void displayAll() {
        for (Person p : personList) {
            System.out.println(p.getName());
            p.displayDetails();
        }
    }

    public void updatePerson(String id) {
        boolean isFound = false; // cờ

        for (Person p : personList) {
            if (p.getId().equals(id)) {
                isFound = true;
                if (p instanceof Student) {
                    Student s = (Student) p;
                    System.out.print("Update gpa: ");
                    s.setGpa(Float.parseFloat(scanner.nextLine()));
                } else if (p instanceof Teacher) {
                    Teacher t = (Teacher) p;
                    System.out.print("Update subject: ");
                    t.setSubject(scanner.nextLine());
                }
                System.out.println("=> Cập nhật thành công!");
                break;
            }
        }

        if (!isFound) {
            System.out.println("=> Không tìm thấy người có ID: " + id);
        }
    }

    public void deletePerson(String id) {
        for (Person p : personList) {
            if (p.getId().equals(id)) {
                personList.remove(p);
                break;
            }
        }
    }
}