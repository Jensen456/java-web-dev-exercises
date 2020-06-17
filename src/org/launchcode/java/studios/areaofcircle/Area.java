package org.launchcode.java.studios.areaofcircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();

        //double area = pi * radius * radius;
        double area = Circle.getArea
                (radius = input.nextDouble());
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
        input.close();
    }
}
