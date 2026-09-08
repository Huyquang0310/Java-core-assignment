package Bai_1;

public class Square {

    private double side;
    public Square() {
        this.side = 1.0;
    }

    public Square(double side) {
        this.side = side;
         if (side <= 0) {
             this.side = 1.0;
         }
    }

    public double calculateArea() {
        return side * side;
    }

    public double calculatePerimeter() {
        return side * 4;
    }

    public void displayInfo(String label) {
        System.out.printf("[%s] Cạnh: %.2f | Chu vi: %.2f | Diện tích: %.2f\n",
                label, this.side, this.calculatePerimeter(), this.calculateArea());

    }

    public static void main(String[] args) {

        Square c1 = new Square();
        c1.displayInfo("Hình vuông 1");

        Square c2 = new Square(6.5);
        c2.displayInfo("Hình vuông 2");
    }
}
