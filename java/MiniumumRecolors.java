import java.util.LinkedList;
import java.util.Queue;
public class MiniumumRecolors{
    public int minimumRecolor(String blocks, int k) {
        int n = blocks.length();
        int minOperations = Integer.MAX_VALUE;
        
        // Iterate through the string with a sliding window of size k
        for (int i = 0; i <= n - k; i++) {
            int whiteCount = 0;
            
            // Count the number of 'W's in the current window
            for (int j = i; j < i + k; j++) {
                if (blocks.charAt(j) == 'W') {
                    whiteCount++;
                }
            }
            
            // Update the minimum number of operations
            minOperations = Math.min(minOperations, whiteCount);
        }
        return minOperations;   
    }
    //another optimized approach
    class Solution {

    public int minimumRecolors(String blocks, int k) {
        Queue<Character> blockQueue = new LinkedList<>();
        int numWhites = 0;

        // Initiate queue with first k values
        for (int i = 0; i < k; i++) {
            char currentChar = blocks.charAt(i);
            if (currentChar == 'W') numWhites++;
            blockQueue.add(currentChar);
        }

        // Set initial minimum
        int numRecolors = numWhites;

        for (int i = k; i < blocks.length(); i++) {
            // Remove front element from queue and update current number of white blocks
            if (blockQueue.poll() == 'W') numWhites--;

            // Add current element to queue and update current number of white blocks
            char currentChar = blocks.charAt(i);
            if (currentChar == 'W') numWhites++;
            blockQueue.add(currentChar);

            // Update minimum
            numRecolors = Math.min(numRecolors, numWhites);
        }
        return numRecolors;
    }
}

}