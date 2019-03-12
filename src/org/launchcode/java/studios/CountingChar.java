package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChar {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        HashMap<Character, Integer> counts = new HashMap<Character, Integer>();
        // string to lowercase
        char[] characters = text.toLowerCase().toCharArray();

        for (char c : characters) {
            //if(!Character.isLetterOrDigit(c)) {
            //continue;
            //}

            int x = 1;
            if (counts.containsKey(c)) {
                x = counts.get(c) + 1;

            }
            counts.put(c, x);
        }

     for(Map.Entry<Character, Integer> eachCount: counts.entrySet())

    {

        System.out.println(eachCount.getKey() + ":" + eachCount.getValue());
    }
    }
}
