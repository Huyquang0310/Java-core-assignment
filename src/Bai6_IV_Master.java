import java.util.Scanner;

public class Bai6_IV_Master {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int accountBalance = 10000000;

        do {
            System.out.println("1. Xem số dư");
            System.out.println("2. Rút tiền");
            System.out.println("3. Nạp tiền");
            System.out.println("4. Thoát");

            System.out.print("Your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Số dư: " + accountBalance);
                    break;
                case 2:
                    int withdrawMoney;
                    System.out.print("Rút tiền: ");
                    withdrawMoney = sc.nextInt();

                    if (withdrawMoney <= accountBalance) {
                        accountBalance -= withdrawMoney;
                        System.out.println("Số dư: " + accountBalance);
                    } else {
                        System.out.println("Số dư không đủ để rút");
                    }
                    break;
                case 3:
                    int depositMoney;
                    System.out.print("Nạp tiền: ");
                    depositMoney = sc.nextInt();

                    if (depositMoney > 0) {
                        accountBalance += depositMoney;
                        System.out.println("Số dư: " + accountBalance);
                    } else {
                        System.out.println("Số tiền nạp phải > 0");
                    }
                    break;
                case 4:
                    return;
            }

        } while (true);

    }
}
