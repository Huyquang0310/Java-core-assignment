package Bai_2;

public class Main {
    public static void main(String[] args) {
        NhanVien[] nhanvien = new NhanVien[2];

        nhanvien[0] = new NhanVienFullTime("Huy Quang", 2000.5, 200.0);
        nhanvien[1] = new NhanVienPartTime("Khoi Nguyen", 5000000.0, 8);

        for (NhanVien nv : nhanvien) {
            nv.hienThiThongTin();
            System.out.println();
        }
    }
}
