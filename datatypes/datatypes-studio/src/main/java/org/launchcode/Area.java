package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the radius: ");
        Double radius = input.nextDouble();

        Double areaCircle = Circle.getArea(radius);
        System.out.println("Area of a circle with radius " + radius + ": " + areaCircle);

        input.close();
    }
}
