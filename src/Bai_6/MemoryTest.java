package Bai_6;

public class MemoryTest {

    // Thí nghiệm 1: Kiểu nguyên thủy
    public static void actionOne(int number) {
        number = number + 10;
        // number là bản sao cục bộ trên Stack Frame của actionOne
    }

    // Thí nghiệm 2: Thay đổi thuộc tính đối tượng
    public static void actionTwo(Rectangle rect) {
        rect.length = rect.length * 2;
        // rect giữ bản sao địa chỉ của r, thay đổi trực tiếp thuộc tính trên Heap
    }

    // Thí nghiệm 3: Gán lại tham chiếu
    public static void actionThree(Rectangle rect) {
        rect = new Rectangle(50.0, 50.0); // rect trỏ sang ô nhớ hoàn toàn mới
        rect.length = 999.0;              // Chỉ thay đổi thuộc tính của ô nhớ mới
    }

    public static void main(String[] args) {
        int n = 5;
        Rectangle r = new Rectangle(10.0, 5.0);

        System.out.println("=== THÍ NGHIỆM 1: KIỂU NGUYÊN THỦY ===");
        actionOne(n);
        System.out.println("Giá trị n sau actionOne: " + n);
        // GIẢI THÍCH: n vẫn = 5. Do Java truyền tham trị, biến number nhận bản sao của 5.

        System.out.println("\n=== THÍ NGHIỆM 2: SỬA THUỘC TÍNH OBJECT ===");
        actionTwo(r);
        System.out.println("Giá trị r.length sau actionTwo: " + r.length);
        // GIẢI THÍCH: r.length = 20.0. rect và r cùng giữ địa chỉ trỏ vào Object trên Heap.

        System.out.println("\n=== THÍ NGHIỆM 3: GÁN NEW TRONG HÀM ===");
        actionThree(r);
        System.out.println("Giá trị r.length sau actionThree: " + r.length);
        // GIẢI THÍCH: r.length VẪN = 20.0. Biến r ở main vẫn trỏ vào Object cũ,
        // phép gán new chỉ làm đổi địa chỉ của biến cục bộ rect trong actionThree.
    }
}