import java.util.Scanner;

public class StrongNumber {
    // Method to calculate factorial of a digit
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to check if a number is a Strong Number
    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10; // Extract the last digit
            sum += factorial(digit); // Add factorial of the digit
            temp /= 10; // Remove last digit
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        // Check if it's a strong number
        if (isStrong(num)) {
            System.out.println(num + " is a Strong Number.");
        } else {
            System.out.println(num + " is NOT a Strong Number.");
        }

        scanner.close();
    }
}
