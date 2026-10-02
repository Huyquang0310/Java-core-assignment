package Bai_6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nhập số nguyên: ");
            String str = sc.nextLine();

            try {
                int n = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Bạn phải nhập 1 số hợp lệ!");

            }

        }

    }
}
