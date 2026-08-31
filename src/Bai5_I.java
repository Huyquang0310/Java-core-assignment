import java.util.Scanner;

public class Bai5_I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số phần tử mảng: ");
        int n = Integer.parseInt(input.nextLine());

        System.out.println("Mảng = [");
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("]");

        boolean isSorted = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("Mảng ĐÃ được sắp xếp tăng dần.");
        } else {
            System.out.println("Mảng CHƯA được sắp xếp tăng dần.");
        }

    }
}
