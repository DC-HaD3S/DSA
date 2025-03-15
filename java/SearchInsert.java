class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){// checks if on ith element target value is present if its present then return i
                return i;
            }
            else if(nums[i]<target){// if not found then check till where nums[i] is less  than target and store that index
                index=i+1;
            }
        }
        return index;        
    }
}