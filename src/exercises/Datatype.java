package exercises;

import java.util.Scanner;

public class Datatype {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hello, What is your name");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        input.close();
    }
}
