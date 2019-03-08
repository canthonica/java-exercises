package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Enter the radius: ");
        double radius = in.nextDouble();
        double area = pi * radius * radius;
        System.out.println("Area equals: " + area);


    }

}

