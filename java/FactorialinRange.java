import java.util.Scanner;

public class FactorialinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();
        
        if (start > end || start < 0) {
            System.out.println("Invalid range! Ensure start is <= end and non-negative.");
        } else {
            for (int i = start; i <= end; i++) {
                System.out.println("Factorial of " + i + " is " + factorial(i));
            }
        }
        scanner.close();
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
