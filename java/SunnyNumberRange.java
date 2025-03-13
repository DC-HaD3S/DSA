import java.util.Scanner;

public class SunnyNumberRange {
    // Method to check if a number is a perfect square
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt) == num;
    }

    // Method to print all Sunny Numbers in a range
    public static void findSunnyNumbers(int start, int end) {
        System.out.println("Sunny Numbers in the range " + start + " to " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (isPerfectSquare(i + 1)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input start and end range
        System.out.print("Enter start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter end of the range: ");
        int end = scanner.nextInt();
        
        findSunnyNumbers(start, end);
        
        scanner.close();
    }
}
