
import java.util.Arrays;

public class Threesum{
    public  int[] threeSum(int[] nums, int target) {
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
        Threesum b= new Threesum();
        
        System.out.println(Arrays.toString(b.threeSum(a,6)));
    }
}