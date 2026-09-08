package Bai_2;

public class Product {
    String productId;
    String productName;
    double importPrice;
    double sellingPrice;

    public Product() {
        this.productId = "";
        this.productName = "";
        this.importPrice = 0;
        this.sellingPrice = 0;
    }

    public Product(String productId, String productName, double importPrice, double sellingPrice) {
        this.productId = productId;
        this.productName = productName;
        this.importPrice = importPrice;
        this.sellingPrice = sellingPrice;

    }

    public double calculateProfit() {
        double profit = this.sellingPrice - this.importPrice;
        return profit;
    }

    public String evaluateMargin() {
        String message = "";
        double profit = this.calculateProfit();
        if (profit >= 500000) {
            message =  "Siêu lợi nhuận";
        } else if (profit >= 100000 && profit < 500000) {
            message = "Lợi nhuận tốt";
        } else if (profit >= 0 && profit < 100000) {
            message = "Lợi nhuận thấp";
        } else {
            message = "Hoà vốn hoặc lỗ";
        }

        return message;
    }

    public void printProduct() {
        System.out.printf("Mã: %s | Tên: %-15s | Lãi: %.0f VND | Đánh giá: %-20s\n",
                this.productId, this.productName, this.calculateProfit(), this.evaluateMargin());
    }

    public static void main(String[] args) {
        Product p1 = new Product("SP01", "Tai nghe Bluetooth", 100000, 300000 );
        p1.printProduct();

        Product p2 = new Product("SP01", "Apple Watch", 100000, 300000 );
        p2.printProduct();
    }
}