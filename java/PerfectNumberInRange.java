import java.util.Scanner;

public class PerfectNumberInRange {
    // Function to check if a number is perfect
    public static boolean isPerfect(int num) {
        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= num / 2; i++) { // Check divisors up to num/2
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num; // Check if sum of divisors equals num
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input range
        System.out.print("Enter the lower bound: ");
        int lower = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int upper = sc.nextInt();
        
        System.out.println("Perfect numbers in the range " + lower + " to " + upper + ":");
        for (int num = lower; num <= upper; num++) {
            if (isPerfect(num)) {
                System.out.println(num);
            }
        }
        
        sc.close();
    }
}
