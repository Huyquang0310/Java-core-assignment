package Bai_7;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;

    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public void print(String message) {
        System.out.printf("%s = %.1f + %.1fi ", message, this.real, this.imaginary);
    }

    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.0, 2.0);
        ComplexNumber c2 = new ComplexNumber(1.0, 4.0);

        c1.print("z1");
        System.out.print(", ");
        c2.print("z2");

        System.out.println();

        ComplexNumber sum = c1.add(c2);
        sum.print("z1 + z2");

        System.out.println();

        ComplexNumber prod = c1.multiply(c2);
        prod.print("z1 + z2");


    }
}
