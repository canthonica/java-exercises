package exercises;
import java.util.Scanner;

public class ListandStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a phrase: ");
        String phrase = in.nextLine();


        char[] ch = phrase.toCharArray();
        for(int i = 0; i < ch.length; i++){
            String words = "";

            while(i < ch.length && ch[i] != ' '){
                words += ch[i]; i++;
            }

            if(words.length() == 5){
                System.out.println(words);
            }


        }

        }
    }










