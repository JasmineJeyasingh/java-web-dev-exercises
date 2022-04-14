package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractice {
    public static void sumOfEvenNo(List<Integer> numbers){
        int sum = 0;
        for(int number : numbers) {
            if((number % 2) == 0) {
                sum += number;
            }
        }
        System.out.println("Sum of Even numbers: " + sum);
    }
    public static void fiveLetterWords(List<String> words){
        for(String word : words) {
            if(word.length() == 5) {
                System.out.println("5 letter Word: " + word);
            }
        }
    }
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        List<String> words = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(9);
        numbers.add(4);
        numbers.add(2);
        numbers.add(9);
        numbers.add(6);
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        sumOfEvenNo(numbers);

        words.add("Dahlia");
        words.add("Rose");
        words.add("Mari Gold");
        words.add("Would");
        words.add("Could");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your favourite word: ");
        words.add(input.nextLine());
        fiveLetterWords(words);

        String sentance = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] str = sentance.split(" ");
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(str));
//        for(String s : strList) {
//            System.out.println("After converted into ArrayList: " + s);
//        }
        System.out.println("After conversion:");
        fiveLetterWords(strList);
    }
}
