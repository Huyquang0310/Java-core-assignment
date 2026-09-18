package Bai_1;

public class TaiLieu {
    private String maTaiLieu;
    private String tenNhaXuatBan;
    private int soBanPhatHanh;

    public TaiLieu() {

    }

    public TaiLieu(String maTaiLieu, String tenNhaXuatBan, int  soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.soBanPhatHanh = soBanPhatHanh;
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void hienThiThongTin() {
        System.out.println("Mã Tài Liệu: 001");
        System.out.println("Tên Nhà Xuất Bản: Nguyen Khoi");
        System.out.println("Số Bản Phát Hành: 10");

    }
}
