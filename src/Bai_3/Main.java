package Bai_3;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        SchoolManager schoolManager = new SchoolManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    schoolManager.addPerson();
                    break;
                case 2:
                    schoolManager.displayAll();
                    break;
                case 3:
                    System.out.print("Id bạn muốn update: ");
                    String id = scanner.nextLine();
                    schoolManager.updatePerson(id);
                    break;
                case 4:
                    System.out.print("Id bạn muốn xóa: ");
                    String idDelete = scanner.nextLine();
                    schoolManager.deletePerson(idDelete);
                    break;
                case 5:
                    System.out.println("Bạn đã thoát chương trình");
                    return;
            }
        }
    }

    public static void menu() {
        System.out.println("\n======================= School Management System ======================");
        System.out.println("1. Thêm mới");
        System.out.println("2. Xem danh sách");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Thoát chương trình");
        System.out.println("=======================================================================");
        System.out.print("Bạn chọn gì đây: ");
    }
}