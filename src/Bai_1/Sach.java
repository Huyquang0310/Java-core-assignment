package Bai_1;

public class Sach extends TaiLieu{

    private String tenTacGia;
    private int soTrang;

    public Sach(String tenTacGia, int soTrang) {
        super();
        this.soTrang = soTrang;
        this.tenTacGia = tenTacGia;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Tên Tác Gỉả: " + this.tenTacGia);
        System.out.println("Số Trang: " + this.soTrang);
    }


}
