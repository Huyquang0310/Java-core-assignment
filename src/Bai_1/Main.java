package Bai_1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Product clothing1 = new Clothing("1", "clothing1", 3000);
        products.add(clothing1);

        Product electronic1 = new Electronics("2", "Electronic1", 4000, 4);
        products.add(electronic1);

        for (Product product : products) {
            System.out.println("San Pham: " + product.getName());
            product.displayInfo();
            System.out.println("Discount: " + product.calculateDiscount());

            if(product instanceof Clothing clothing){
                System.out.println("Tax: " + clothing.calculateTax());
            }
            else if(product instanceof Electronics electronics){
                System.out.println("Tax: " + electronics.calculateTax());
            }
        }

    }
}