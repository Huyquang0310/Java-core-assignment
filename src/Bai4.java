import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Khoảng cách đi: ");
        int km = sc.nextInt();

        System.out.print("Giờ đi: ");
        int hour = sc.nextInt();

        int price = 15000;
        int sum = price * km;

        if (hour >= 7 && hour <= 9 || hour >= 17 && hour <= 19) {
            sum = (price + 5000) * km;
        }
        if (hour >= 22 || hour <= 5) {
            sum = (price * km) + 20000;
        }

        System.out.println(sum);


    }
}
