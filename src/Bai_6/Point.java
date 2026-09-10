package Bai_6;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Pass by value: truyền bản sao của giá trị
    // Với object: giá trị được truyền là reference (tham chiếu) đến object

    public static void swap(Point p1, Point p2) { // p1 và p2 là địa chỉ
        Point temp = p1; // p1 và temp đều trỏ tới đc1
        p1 = p2; // p1 nhận tham chiếu mà p2 đang giữ, lúc này p1 và p2 trỏ tới đc2
        p2 = temp; // p2 nhận tham chiếu mà temp đang giữ (đc1), lúc này p2 và temp trỏ tới đc1

    }

    public static void reset(Point p) {
        p.x = 0;
        p.y = 0;
    }

    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(7, 8);

        swap(p1, p2);
        System.out.println(p1.x + " " + p1.y); /* 3 4, vì swap chỉ thay đổi tham chiếu ở bên trong
method, chứ không thay dổi object được tham chiếu trong hàm main */

        reset(p1);
        System.out.println(p1.x + " " + p1.y); // 0 0, vì reset có object được tham chiếu tới
    }
}
