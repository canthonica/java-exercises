package exercises;

import java.util.Scanner;

public class AliceString {
    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner word = new Scanner(System.in);
        System.out.println("What word do you want to check?: ");
        System.out.println(text.toLowerCase().contains(word.nextLine()));


        }

    }

