import java.util.Scanner;

public class Bai7_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số phần tử mảng: ");
        int n = Integer.parseInt(input.nextLine());
        if (n < 2) {
            return;
        }

        System.out.println("Mảng = [");
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("]");

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }

            if (array[i] > secondMax && array[i] < max) {
                secondMax = array[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Không tồn tại số lớn thứ nhì");
        } else {
            System.out.println("Số lớn nhất = " + max + ", " + "Số lớn thứ nhì = " + secondMax);
        }
    }
}

