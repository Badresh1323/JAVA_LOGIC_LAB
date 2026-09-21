import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Result: " + (num1 + num2));
        }
        else if (choice == 2) {
            System.out.println("Result: " + (num1 - num2));
        }
        else if (choice == 3) {
            System.out.println("Result: " + (num1 * num2));
        }
        else if (choice == 4) {

            if (num2 != 0) {
                System.out.println("Result: " + (num1 / num2));
            }
            else {
                System.out.println("Cannot divide by zero.");
            }

        }
        else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
