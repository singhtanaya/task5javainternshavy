import java.util.Scanner;

interface Calculator {
    double add(double firstNumber, double secondNumber);

    double subtract(double firstNumber, double secondNumber);

    double multiply(double firstNumber, double secondNumber);

    double divide(double firstNumber, double secondNumber);
}

class BasicCalculator implements Calculator {
    @Override
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new BasicCalculator();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero");
                } else {
                    result = calculator.divide(num1, num2);
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
