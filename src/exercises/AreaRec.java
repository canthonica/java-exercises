package exercises;

import java.util.Scanner;

public class AreaRec {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width: ");
        double width = input.nextDouble();
        System.out.println("Enter the height: ");
        double height = input.nextDouble();

        double area = width * height;
        System.out.println("Area of the rectangle is:" + area);




    }
}