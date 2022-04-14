package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 5, 8};
        String sentance = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        for (int i : numbers) {
            if ((i % 2) == 0) {
                System.out.println("Even numbers: " + i);
            } else {
                System.out.println("Odd numbers: " + i);
            }
        }
        System.out.println(Arrays.toString(sentance.split(" ")));
        System.out.println(Arrays.toString(sentance.split("\\.")));
    }
}
