package com.scmtool;

import java.time.LocalDateTime;
import java.util.Scanner;

public class App {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
System.out.println("=== SCM Tool v1 by Nouf & Rasha & Conflict C ===");


        // Feature 1 by Nouf: Display current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Date and Time: " + now);

        while (true) {
            printMenu();
            String choice = SC.nextLine().trim();
            switch (choice) {
                case "1":
                    doCalculator();
                    break;
                case "2":
                    doUnitConverter();
                    break;
                case "3":
                    doTextUtils();
                    break;
                case "0":
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("\nChoose an option:");
        System.out.println("1) Calculator");
        System.out.println("2) Unit Converter");
        System.out.println("3) Text Utilities");
        System.out.println("0) Exit");
        System.out.print("Your choice: ");
    }

    private static void doCalculator() {
        System.out.println("\n-- Calculator --");
        System.out.println("a) Add   b) Subtract   c) Multiply   d) Divide");
        System.out.print("Operation: ");
        String op = SC.nextLine().trim().toLowerCase();

        double x = readDouble("Enter first number: ");
        double y = readDouble("Enter second number: ");

        try {
            double result;
            switch (op) {
                case "a":
                    result = Calculator.add(x, y);
                    break;
                case "b":
                    result = Calculator.subtract(x, y);
                    break;
                case "c":
                    result = Calculator.multiply(x, y);
                    break;
                case "d":
                    result = Calculator.divide(x, y);
                    break;
                default:
                    System.out.println("Unknown operation.");
                    return;
            }
            System.out.println("Result = " + result);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    private static void doUnitConverter() {
        System.out.println("\n-- Unit Converter --");
        System.out.println("a) Celsius → Fahrenheit");
        System.out.println("b) Fahrenheit → Celsius");
        System.out.println("c) Kilometers → Miles");
        System.out.println("d) Miles → Kilometers");
        System.out.print("Conversion: ");
        String op = SC.nextLine().trim().toLowerCase();

        double in = readDouble("Enter value: ");
        double out;
        switch (op) {
            case "a":
                out = UnitConverter.celsiusToFahrenheit(in);
                break;
            case "b":
                out = UnitConverter.fahrenheitToCelsius(in);
                break;
            case "c":
                out = UnitConverter.kmToMiles(in);
                break;
            case "d":
                out = UnitConverter.milesToKm(in);
                break;
            default:
                System.out.println("Unknown conversion.");
                return;
        }
        System.out.println("Converted value = " + out);
    }

    private static void doTextUtils() {
        System.out.println("\n-- Text Utilities --");
        System.out.print("Enter text: ");
        String text = SC.nextLine();

        String reversed = TextUtils.reverse(text);
        boolean isPal = TextUtils.isPalindrome(text);

        System.out.println("Reversed: " + reversed);
        System.out.println("Is Palindrome? " + (isPal ? "Yes" : "No"));
    }

    private static double readDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = SC.nextLine().trim();
            try {
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Not a number, try again.");
            }
        }
    }
}
