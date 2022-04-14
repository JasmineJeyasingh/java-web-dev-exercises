package org.launchcode.java.studios.countingcharacters;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class CountingChar {
    public static void main(String[] args) throws IOException {
//        String str = "If the product of two terms is zero then common sense says at least " +
//                "one of the two terms has to be zero to start with. So if you move all the " +
//                "terms over to one side, you can put the quadratics into a form that can be " +
//                "factored allowing that side of the equation to equal zero. Once you’ve done that, " +
//                "it’s pretty straightforward from there.";
        Path fileString = Path.of("C:\\Users\\ruban\\Desktop\\IntelliJ\\string.txt");
        String str = Files.readString(fileString);
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the sentence: ");
//        String str = input.nextLine().toLowerCase(Locale.ROOT);
        HashMap<Character, Integer> charCount = new HashMap<>();
        char[] characters = str.toCharArray();
        for(char character : characters) {
            if(charCount.containsKey(character)) {
                charCount.put(character, charCount.get(character) + 1);
            } else {
                charCount.put(character, 1);
            }
        }
        for (Character key : charCount.keySet()) {
            System.out.println(key + ": " + charCount.get(key));
        }
    }
}
