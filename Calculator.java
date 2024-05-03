import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        do {
            double num1 = 0, num2 = 0, res = 0;
            try {
                System.err.println("Enter the first number: ");
                num1 = sc.nextDouble();
                sc.nextLine(); // Consume newline character
                System.err.println("Enter the second number: ");
                num2 = sc.nextDouble();
                sc.nextLine(); // Consume newline character
                System.err.println("Enter the operation: ");
                String input = sc.nextLine();

                switch (input) {
                    case "+":
                        res = num1 + num2;
                        System.out.println("The Addition is: " + res);
                        break;
                    case "-":
                        res = num1 - num2;
                        System.out.println("The Subtraction is: " + res);
                        break;
                    case "*":
                        res = num1 * num2;
                        System.out.println("The Multiplication is: " + res);
                        break;
                    case "/":
                        if (num2 != 0) {
                            res = num1 / num2;
                            System.out.println("The Division is: " + res);
                        } else {
                            System.out.println("Cannot divide by zero.");
                        }
                        break;
                    case "%":
                        res = num1 % num2;
                        System.out.println("The Modulus is: " + res);
                        break;
                    case "^":
                        res = Math.pow(num1, num2);
                        System.out.println("The Power is: " + res);
                        break;
                    case "sin":
                        res = Math.sin(num1);
                        System.out.println("The Sine of " + num1 + " is: " + res);
                        break;
                    case "cos":
                        res = Math.cos(num1);
                        System.out.println("The Cosine of " + num1 + " is: " + res);
                        break;
                    case "tan":
                        res = Math.tan(num1);
                        System.out.println("The Tangent of " + num1 + " is: " + res);
                        break;
                    case "log":
                        if (num1 > 0) {
                            res = Math.log(num1);
                            System.out.println("The Natural Logarithm of " + num1 + " is: " + res);
                        } else {
                            System.out.println("Logarithm is undefined for non-positive numbers.");
                        }
                        break;
                    case "exp":
                        res = Math.exp(num1);
                        System.out.println("The Exponential of " + num1 + " is: " + res);
                        break;
                    case "celsiusToFahrenheit":
                        res = (num1 * 9 / 5) + 32;
                        System.out.println(num1 + " Celsius is equal to " + res + " Fahrenheit.");
                        break;
                    case "fahrenheitToCelsius":
                        res = (num1 - 32) * 5 / 9;
                        System.out.println(num1 + " Fahrenheit is equal to " + res + " Celsius.");
                        break;
                    case "exit":
                        exit = true;
                        System.out.println("Exiting the calculator. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid operation!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.nextLine(); // Clear input buffer
            } catch (ArithmeticException e) {
                System.out.println("An arithmetic error occurred: " + e.getMessage());
            }
        } while (!exit);
    }
}
