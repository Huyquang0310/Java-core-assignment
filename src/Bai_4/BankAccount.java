package Bai_4;

public class BankAccount {
    String accountNumber;
    String ownerName;
    double balance;

    public BankAccount() {
        this.accountNumber = "";
        this.ownerName = "";
        this.balance = 0;
    }

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 50000;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Số tiền nạp phải lớn hơn 0");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && (this.balance - amount) >= 50000) {
            balance -= amount;
            return true;
        }

        return false;
    }


    public boolean transferTo(BankAccount targetAccount, double amount) {
        if (targetAccount == null) {
            System.out.println("Tài khoản đích không tồn tại!");
            return false;
        }
        if (this.withdraw(amount)) {
            targetAccount.deposit(amount);
            System.out.printf("Chuyển thành công %,.0f VND sang tài khoản %s!\n",
                    amount, targetAccount.accountNumber);
            return true;
        } else {
            System.out.println("Giao dịch chuyển tiền thất bại: Số dư không đủ!");
            return false;
        }
    }

    public void printBalance() {
        System.out.printf("Tài khoản %s (%s) - Số dư: %,.0f VND\n",
                this.accountNumber, this.ownerName, this.balance);
    }

    public static void main(String[] args) {
        BankAccount accA = new BankAccount("1001", "Nguyễn Văn A", 200000);
        BankAccount accB = new BankAccount("1002", "Trần Thị B", 50000);

        accA.printBalance();
        accB.printBalance();

        System.out.println("\n--- Thực hiện chuyển tiền ---");
        accA.transferTo(accB, 100000);

        System.out.println("\n--- Số dư sau giao dịch ---");
        accA.printBalance();
        accB.printBalance();
    }
}
