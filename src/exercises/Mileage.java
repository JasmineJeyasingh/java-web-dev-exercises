package exercises;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        double miles;
        int gallonOfGas;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the miles you have drive:");
        miles = input.nextDouble();
        System.out.print("Enter the amount of gallonOfGas used (in gallon):");
        gallonOfGas = input.nextByte();
        double milesPerGallon = miles / gallonOfGas;
        System.out.println("Miles per Gallon: " + milesPerGallon);
        input.close();
    }
}
