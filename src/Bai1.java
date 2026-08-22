import java.util.Scanner;

public class Bai1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tuổi của bạn: ");
        int age = sc.nextInt();

        System.out.print("Thu nhập hàng tháng(triệu VND): ");
        double income = sc.nextDouble();

        System.out.print("Tài sản thế chấp(T/F): ");
        boolean hasTaiSanTheChap = sc.nextBoolean();

        if (age >= 18 && age <= 60) {

            if (income >= 15 || hasTaiSanTheChap) {
                System.out.println("Được duyệt vay");
            }
        } else {
            System.out.println("Không được duyệt");
        }

    }
}
