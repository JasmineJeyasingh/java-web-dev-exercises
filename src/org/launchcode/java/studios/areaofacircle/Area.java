package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        String radius = input.nextLine();
        if(radius.matches("[a-zA-Z]+") || radius.matches("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]+")) {
            System.out.println("Invalid input");
            System.exit(0);
        }
        double convertedRadius = Double.parseDouble(radius);

        while(convertedRadius < 0) {
            System.out.print("Please enter the positive no:");
            convertedRadius = input.nextDouble();
        }

//        double areaOfCircle = 3.14 * convertedRadius * convertedRadius;
        Circle area = new Circle();
        double areaOfCircle = area.getArea(convertedRadius);
        System.out.println("Area of Circle is: " + areaOfCircle);
        input.close();
    }
}
