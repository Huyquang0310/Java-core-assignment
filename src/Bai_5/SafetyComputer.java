package Bai_5;

public class SafetyComputer {

    public static void divide(int a, int b) {

        try {
            double result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0!");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Kết thúc phép tính");
        }

    }

    public static void main(String[] args) {

        divide(10, 0);

    }
}
