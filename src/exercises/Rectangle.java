package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double length,width;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height");
        length = input.nextDouble();
        System.out.print("Enter the width");
        width = input.nextDouble();
        double areaOfRectangle = length * width;
        System.out.println("Area of Rectangle is: " + areaOfRectangle);
        input.close();
    }
}
