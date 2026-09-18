package Bai_2;

public class NhanVienPartTime extends NhanVien{

    private int soGioLam;

    public NhanVienPartTime(String ten, double luongCoBan, int soGioLam) {
        super(ten, luongCoBan);
        this.soGioLam = soGioLam;
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + (soGioLam * 100000);
    }
}
