
public class Bai3 {
    public static void main(String[] args) {

        double gpa = 8.0;
        int drl = 80;
        boolean isViPham = false;
        boolean hasGiayKhen = true;

        if (gpa >= 8.0 && drl >= 80 && (isViPham || hasGiayKhen)) {
            System.out.println("Đạt học bổng");
        }
    }
}
