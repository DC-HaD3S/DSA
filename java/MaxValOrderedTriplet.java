public class MaxValOrderedTriplet{

    public long maximumTripletValue(int[] nums) {
        long max=0;

        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    
                    long value =(long)(nums[i] - nums[j]) * nums[k];
                    
                    if (value > max) {
                        max = value;
                    }

                }
            }
        }
        return max < 0 ? 0 : max;
    }

}