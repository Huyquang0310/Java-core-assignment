package Bai_9;

public class ShoppingCartDemo {

    // 1. Lớp đại diện cho một món hàng trong giỏ
    public static class CartItem {
        private String itemName;
        private double unitPrice;
        private int quantity;

        public CartItem(String itemName, double unitPrice, int quantity) {
            this.itemName = itemName;
            this.unitPrice = (unitPrice > 0) ? unitPrice : 0.0;
            this.quantity = (quantity > 0) ? quantity : 1;
        }

        public double getSubtotal() {
            return this.unitPrice * this.quantity;
        }

        public void printItem(int index) {
            System.out.printf("%d. %-18s x %d = %,10.0f VND\n",
                    index, this.itemName, this.quantity, this.getSubtotal());
        }
    }

    // 2. Lớp giỏ hàng quản lý danh sách món hàng
    public static class ShoppingCart {
        private CartItem[] items;
        private int count;

        public ShoppingCart(int capacity) {
            this.items = new CartItem[capacity];
            this.count = 0;
        }

        public boolean addItem(CartItem item) {
            if (this.count < this.items.length) {
                this.items[this.count] = item;
                this.count++;
                return true;
            } else {
                System.out.println("Giỏ hàng đã đầy, không thể thêm!");
                return false;
            }
        }

        public double calculateTotal() {
            double total = 0;
            for (int i = 0; i < this.count; i++) {
                total += this.items[i].getSubtotal();
            }
            return total;
        }

        public double calculateDiscount(String couponCode) {
            double total = this.calculateTotal();
            if ("SALE10".equalsIgnoreCase(couponCode)) {
                double discount = total * 0.10;
                return Math.min(discount, 50000); // Tối đa giảm 50,000 VND
            } else if ("FREESHIP".equalsIgnoreCase(couponCode)) {
                return 30000;
            }
            return 0.0;
        }

        public void printReceipt(String couponCode) {
            System.out.println("================ HÓA ĐƠN MUA HÀNG ================");
            for (int i = 0; i < this.count; i++) {
                this.items[i].printItem(i + 1);
            }
            System.out.println("--------------------------------------------------");
            double total = this.calculateTotal();
            double discount = this.calculateDiscount(couponCode);
            double finalPayment = Math.max(0, total - discount);

            System.out.printf("Tổng tiền hàng  : %,12.0f VND\n", total);
            if (discount > 0) {
                System.out.printf("Mã giảm (%s): -%,11.0f VND\n", couponCode, discount);
            }
            System.out.printf("THANH TOÁN      : %,12.0f VND\n", finalPayment);
            System.out.println("==================================================");
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(5);
        cart.addItem(new CartItem("Bánh mì bơ tỏi", 15000, 2));
        cart.addItem(new CartItem("Cà phê sữa đá", 25000, 1));
        cart.addItem(new CartItem("Snack khoai tây", 20000, 3));

        cart.printReceipt("SALE10");
    }
}