package Bai_1;


public abstract class Product {

    protected String id;
    protected String name;
    protected double price;

    public Product() {
    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();

    public void displayInfo() {
        System.out.printf("id: %s, name: %s, price: %.2f%n", id, name, price); //6.7890 => 6.79
    }
}
