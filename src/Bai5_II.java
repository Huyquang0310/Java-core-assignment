import java.util.Scanner;

public class Bai5_II {
    public static void main(String[] args) {
        System.out.println("Menu quán cafe");
        System.out.println("1. Cafe đen");
        System.out.println("2. Cafe sữa");
        System.out.println("3. Sinh tố");
        System.out.println("4. Nước ép");

        Scanner sc = new Scanner(System.in);
        System.out.print("Your choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("25k");
                break;
            case 2:
                System.out.println("30k");
                break;
            case 3:
                System.out.println("40k");
                break;
            case 4:
                System.out.println("35k");
                break;
        }
    }

}
