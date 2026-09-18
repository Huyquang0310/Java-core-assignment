package Bai_2;

public class NhanVien {

    protected String ten;
    protected double luongCoBan;

    public NhanVien(String ten, double luongCoBan) {
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }

    public double tinhLuong() {
        return luongCoBan;
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tổng Lương: " + tinhLuong());
    }


}
