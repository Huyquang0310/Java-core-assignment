package Bai_1;


public class Clothing extends Product implements Taxable {

    public Clothing() {
    }

    public Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateTax() {
        return price * 0.1;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.2;
    }
}