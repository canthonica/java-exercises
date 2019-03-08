package exercises;

import java.util.Scanner;

public class MilesPerGal {
    public static void main(String[] args) {
        Scanner gas = new Scanner(System.in);
        System.out.println("How many miles driven?: ");
        double miles = gas.nextDouble();
        System.out.println("How many gallons of gas did you use?: ");
        double gal = gas.nextDouble();
        double galused = miles / gal;
        System.out.println("Your miles per gallon is:" + galused);
    }
}
