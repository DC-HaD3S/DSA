
import java.util.ArrayList;
import java.util.List;
class Primelefttoright {
    public int[] closestPrimes(int left, int right) {
        List<Integer> primes = new ArrayList<>();

        // Find all prime numbers in the range [left, right]
        for (int num = left; num <= right; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        // If there are less than two primes, return [-1, -1]
        if (primes.size() < 2) {
            return new int[]{-1, -1};
        }

        int minDiff = Integer.MAX_VALUE;
        int[] result = new int[]{-1, -1};

        // Find the closest prime pair
        for (int i = 0; i < primes.size() - 1; i++) {
            int diff = primes.get(i + 1) - primes.get(i);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = primes.get(i);
                result[1] = primes.get(i + 1);
            }
        }

        return result;
    }

    // Helper function to check if a number is prime
    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}