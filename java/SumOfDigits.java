public class SumOfDigits {
    public static void main(String[] args) {
        long num = 9876543210L;  // Example input
        long sum2 = sumDigits(num,0);
        System.err.println("sum of digits"+sum2);
  
    }

    public static long sumDigits(long num, long sum) {
        
         if (num == 0) {
            return sum;
        }
        while (num > 0) {
            sum += num % 10;  // Extract last digit and add to sum
            num /= 10;  // Remove last digit
        }
        return sumDigits(num,sum);
    }
}
