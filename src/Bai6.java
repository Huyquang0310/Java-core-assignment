import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cân nặng (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Chiều cao (m): ");
        double height = sc.nextDouble();

        double BMI = weight / (height * height);

        if (BMI < 18.5) {
            System.out.println("Thiếu cân");

        } else if (BMI >= 18.5 && BMI < 25.0) {
            System.out.println("Bình thường");

        } else if (BMI >= 25 && BMI < 30.0) {
            System.out.println("Thừa cân");

        } else {
            System.out.println("Béo phì");
        }
    }
}
