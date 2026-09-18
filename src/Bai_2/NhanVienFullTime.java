package Bai_2;

public class NhanVienFullTime extends NhanVien {
    private double thuong;

    public NhanVienFullTime(String ten, double luongCoBan, double thuong) {
        super(ten, luongCoBan);
        this.thuong = thuong;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + thuong;
    }


}
