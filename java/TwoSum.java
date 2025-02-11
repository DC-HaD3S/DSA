
import java.util.Arrays;

public class TwoSum{
    public  int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) 
        {
            for (int j = i + 1; j < nums.length; j++) 
            {  // Start from i+1
                for(int k= j+1;k<nums.length;k++){
                    if (nums[i] + nums[j]+nums[k] == target) {
                        return new int[]{i,j,k};  // Corrected return statement
                 }
                }
            }
        }
        return new int[]{};  // If no solution is found
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        TwoSum b= new TwoSum();
        
        System.out.println(Arrays.toString(b.twoSum(a,6)));
    }
}