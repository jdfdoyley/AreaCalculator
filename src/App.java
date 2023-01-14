/**
 * Author: Jason D'Oyley
 * Date: Jan 14, 2023
 * Section: 5 - Expressions, Statements & More
 * Topic: Coding Exercise 9 - Area Calculator
 */

public class App {
    public static void main (String[] args) {
        System.out.println(area(5.0));         // 78.53975
        System.out.println(area(0.0));         // 0.0
        System.out.println(area(-1));          // -1.0
        System.out.println(area(5.0, 4.0));     // 20.0
        System.out.println(area(-1.0, 4.0));    // -1.0
        System.out.println(area(4.0, -1.0));    // -1.0
    }

    public static double area(double radius) {
        return (radius >= 0) ? radius * radius * Math.PI : -1;
    }

    public static double area(double x, double y) {
        return ((x >= 0) && (y >= 0)) ? x * y : -1;
    }
}
