package exercises;
//import java.util.ArrayList;
//import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // make an array initializer
        int seq[] = {1, 12, 23, 34, 45, 56, 67, 78, 89, 100};


            int evenSum = 0;
            int i;
            for (i = 1; i < 10; i++) {
                if (seq[i] % 2 == 0) {
                    evenSum += seq[i];

                }
            }
        System.out.println("The sum of even numbers is: " + evenSum);
        }
    }


