package Bai_6;

public class Point {
    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void swap(Point p1, Point p2) { // Pass by value: truyền theo giá trị
        Point temp = p1;
        p1 = p2;
        p2 = temp;
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
