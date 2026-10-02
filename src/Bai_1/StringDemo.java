package Bai_1;

public class StringDemo {
    public static void main(String[] args) {
        String data = "   Java Core, Spring Boot, Hibernate, Microservices!  ";
        System.out.println("Chuỗi sau khi dùng trim(): " + data.trim()); // 1

        if (data.isEmpty()) {
            System.out.println("Empty String");
        } else if (data.isBlank()) {
            System.out.println("Blank String");
        } else {
            System.out.println("Chuỗi không emtpy hoặc blank!");
        } // 2

        System.out.println("Độ dài chuỗi: " + data.trim().length()); // 3

        System.out.println("Chuỗi in hoa: " + data.toUpperCase()); // 4

        System.out.println("Chuỗi in thường: " + data.toLowerCase()); // 5

        if (data.startsWith("java") && data.endsWith("!")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        } // 6

    }
}
