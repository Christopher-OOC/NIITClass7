package org.example.fx;

public class FeetToMeterTable {

    public static void main(String[] args) {

        System.out.println("Feet\t\tMeters\t\t|\t\tMeters\t\tFeet");

        for (int i = 1, j = 20; i <= 10; i++, j += 5) {
            double decimalI = (i * 1.0);
            double meters = footToMeter(decimalI);
            double decimalJ = (j * 1.0);
            System.out.printf("%4.1f\t\t%5.3f\t\t|\t\t%-4.1f\t\t", decimalI, meters, decimalJ);
            System.out.println();
        }

    }

    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    public static double meterToFeet(double meter) {
        return 3.279 * meter;
    }
}
