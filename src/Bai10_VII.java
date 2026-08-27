import java.util.Scanner;

public class Bai10_VII {
    static int accountBalance = 10000000;

    public static void main(String[] args) {
        final String ADMIN_PIN = "1234";

        Scanner sc = new Scanner(System.in);


        String pin;
        int count = 0;
        do {
            System.out.print("Enter your PIN: ");
            pin = sc.nextLine();
            count++;

            if (pin.equals(ADMIN_PIN)) {
                break;
            }

            if (count > 3) {
                System.out.println("Khoá thẻ");
                return;

            }

        } while (count <= 3);

        System.out.println("Menu giao dịch");
        System.out.println("1. Rút tiền");
        System.out.println("2. Chuyển khoản");
        System.out.println("3. Xem lịch sử");


        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        int amount;
        String target;

        switch (choice) {
            case 1:
                System.out.print("Rút tiền: ");
                amount = sc.nextInt();
                withdraw(amount);
                break;
            case 2:
                System.out.print("Tài khoản nhận: ");
                sc.nextLine();
                target = sc.nextLine();
                System.out.print("Chuyển tiền: ");
                amount = sc.nextInt();
                transfer(amount, target);
                break;
            case 3:
                // history
                break;

        }
    }

    public static int withdraw(int amount) {

        if (amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Số dư: " + accountBalance);
        } else {
            System.out.println("Số dư không đủ để rút");
        }

        return amount;
    }

    public static int transfer(int amount, String target) {

        if (amount > 0) {
            accountBalance -= amount;
            System.out.println("Đã chuyển thành công: " + amount + "đến tài khoản: " + target);
            System.out.println("Số dư còn lại: " + accountBalance);
        } else {
            System.out.println("Số tiền chuyển khoản phải > 0");
        }

        return amount;
    }
}
