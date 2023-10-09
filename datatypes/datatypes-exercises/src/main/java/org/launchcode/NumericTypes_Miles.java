package org.launchcode;
import java.util.Scanner;

public class NumericTypes_Miles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        Double miles = input.nextDouble();
        System.out.println("How many gallons of gas did you use: ");
        Double gasGallons = input.nextDouble();

        Double mpg = miles / gasGallons;
        System.out.println("Here is your MPG: " + mpg);

        input.close();
    }
}
