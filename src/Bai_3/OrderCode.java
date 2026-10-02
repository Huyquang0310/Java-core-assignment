package Bai_3;

public class OrderCode {

    public static String generateOrderCode(String prefix, int count) {

        // 1. Khởi tạo StringBuilder bằng prefix
        StringBuilder sb = new StringBuilder(prefix);

        // 2. Lặp count lần và nối thêm mã đơn hàng
        for (int i = 0; i < count; i++) {
            sb.append("-ORD").append(i);
        }

        // 3. Chèn "[VIP]" ngay sau prefix
        sb.insert(prefix.length(), "-[VIP]");

        // 4. Chuyển StringBuilder thành String và trả về
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = generateOrderCode("SHOP", 3);

        System.out.println(result);
    }
}
