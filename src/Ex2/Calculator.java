package Ex2;

import java.util.Scanner;

@AnnotationCalculator()
public class Calculator {
    /**
     * Performs arithmetic operations entered by the user on two entered numbers
     *
     * @param scanner : a text scanner
     */
    public static void calculator(Scanner scanner) {
        double operand1 = returnDouble(scanner);
        double operand2 = returnDouble(scanner);
        System.out.println("Enter arithmetic operation: ");
        String sign = scanner.nextLine();
        switch (sign) {
            case "+" -> System.out.println(operand1 + " " + sign + " " + operand2 + " = " + add(operand1, operand2));
            case "-" -> System.out.println(operand1 + " " + sign + " " + operand2 + " = " + sub(operand1, operand2));
            case "*" -> System.out.println(operand1 + " " + sign + " " + operand2 + " = " + mul(operand1, operand2));
            case "/" -> System.out.println(operand1 + " " + sign + " " + operand2 + " = " + div(operand1, operand2));
        }
    }

    /**
     * Prompts for a number and validates that number is double
     *
     * @param scanner : a text scanner
     * @return double : entered number
     */
    private static double returnDouble(Scanner scanner) {
        double number = 0.0;
        while (true) {
            System.out.println("Enter a number: ");
            try {
                number = Double.parseDouble(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("It must be a number");
            }
        }
        return number;
    }

    /**
     * Addition of two numbers
     *
     * @param num1 : operand 1
     * @param num2 : operand 2
     * @return double : sum of num1 and num2
     */
    public static double add(Double num1, Double num2) {
        return num1 + num2;
    }

    /**
     * Subtraction of two numbers
     *
     * @param num1 : operand 1
     * @param num2 : operand 2
     * @return double : difference of num1 and num2
     */
    public static double sub(Double num1, Double num2) {
        return num1 - num2;
    }

    /**
     * Multiplication of two numbers
     *
     * @param num1 : operand 1
     * @param num2 : operand 2
     * @return double : product of num1 and num2
     */
    public static double mul(Double num1, Double num2) {
        return num1 * num2;
    }

    /**
     * Division of two numbers
     *
     * @param num1 : operand 1
     * @param num2 : operand 2
     * @return double : quotient of num1 and num2
     */
    public static double div(Double num1, Double num2) {
        double res = 0.0;
        try {
            res = num1 / num2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return res;
    }
}