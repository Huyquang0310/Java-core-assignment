package Bai_1;

public class Electronics extends Product implements Taxable {
    private int warrantyPeriod;

    public Electronics() {

    }

    public Electronics(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Electronics(String id, String name, double price, int warrantyPeriod) {
        super(id, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public double calculateTax() {
        return price * 0.1;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.1;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Warranty period: %s\n", warrantyPeriod);
    }
}
