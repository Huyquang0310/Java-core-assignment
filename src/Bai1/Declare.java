package Bai1;

public class Declare {

    public static void main(String[] args) {

        int myYearBorn = 2006;
        final double USD_to_VND = 25400.5;
        int USD = 50;
        double VND = USD * USD_to_VND;

        long result = (long) VND;
        System.out.println(result);
    }

}
