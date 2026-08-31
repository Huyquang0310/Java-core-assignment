import java.util.Scanner;

public class Bai3_I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số phần tử mảng: ");
        int n = Integer.parseInt(input.nextLine());

        System.out.print("Mảng = [");
        float[] array = new float[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextFloat();
        }

        System.out.println("]");

        float max = array[0];
        float min = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        System.out.println("Giá trị lớn nhất (Max): " + max + " tại vị trí index: " + maxIndex);
        System.out.println("Giá trị lớn nhất (Min): " + min + " tại vị trí index: " + minIndex);
    }
}
