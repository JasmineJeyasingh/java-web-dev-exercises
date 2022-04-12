package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Wordsearch {
    public static void main(String[] args) {
        String sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book," +
                "' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your search word:");
        String word = input.nextLine();
        boolean findWord= sentence.toLowerCase().contains(word.toLowerCase());
        if(findWord) {
            System.out.println("Success! We found the string");
        } else {
            System.out.println("Sorry, we can't found the string");
        }
        int index = sentence.indexOf(word);
        System.out.println("The index of " + word + " is: " + index );
        System.out.println("Your search word length is " + word.length());
        String afterRemove = sentence.replaceAll(word,"");
        System.out.println("Sentence after remove the given word: " + afterRemove);
        input.close();
    }
}
