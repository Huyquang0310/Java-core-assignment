package Bai_3;

public class Smartphone {
    private String brand;
    private String model;
    private int storageGB;
    private double price;


    public Smartphone(String brand, String model, int storageGB, double price) {
        this.brand = brand;
        this.model = model;
        this.storageGB = storageGB;
        this.price = price;
    }


    public Smartphone(String brand, String model, double price) {
        this (brand, model, 128, price);
    }


    public Smartphone() {
        this("Chưa rõ", "Chưa rõ", 128, 0.0);
    }


    public void upgrade(int extraGB, double upgradeFee) {
        if (extraGB > 0) {
            this.price += upgradeFee;
            System.out.printf("Nâng cấp thêm %d GB (+ %,.0f )...\n", extraGB, upgradeFee);
        }
    }

    public void display() {
        System.out.printf("Khởi tạo: %s | Model: %s | Storage: %d | Price: %,.0f VND\n",
                this.brand, this.model, this.storageGB, this.price);
    }

    public void displayNew() {
        System.out.printf("Sau nâng cấp: %s | Model: %s | Storage: %d | Price: %,.0f VND\n",
                this.brand, this.model, this.storageGB, this.price);
    }

    public static void main(String[] args) {
        Smartphone s = new Smartphone("iPhone 15", "Apple", 128, 20000000);
        s.display();

        s.upgrade(128, 3000000);
        s.displayNew();
    }
}
