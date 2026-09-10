package Bai_8;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }

    public boolean isLeapYear(int year) {

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {

            return true;
        } else {


            return false;
        }
    }

    public int maxDay(int month) {

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;

            case 4, 6, 9, 11:
                return 30;

            case 2:
                if (isLeapYear(this.year)) {
                    return 29;
                } else {
                    return 28;
                }
                default:
                System.out.println("1 năm chỉ có 12 tháng!");
        }

        return 0;
    }

    public void nextDay() {
        this.day++;
        if (this.day > maxDay(this.month)) {
            this.day = 1;
            this.month++;
            if (this.month >= 13) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public void display(String message) {
        System.out.printf("%s: %02d/%02d/%04d", message, this.day, this.month, this.year);
    }
    public static void main(String[] args) {
        MyDate d1 = new MyDate(28, 02, 2024);
        MyDate d2 = new MyDate(31, 12, 2026);

        d1.display("Ngày");
        System.out.print(" (Năm nhuận) -> nextDay() -> ");
        d1.nextDay();
        d1.display("Ngày");

        System.out.println();

        d2.display("Ngày");
        System.out.print(" -> nextDay() -> ");
        d2.nextDay();
        d2.display("Ngày");
    }
}

