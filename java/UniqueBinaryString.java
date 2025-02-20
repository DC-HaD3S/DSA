public class UniqueBinaryString{
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder s2= new StringBuilder();
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i)=='0'){
                s2.append('1');
            }
            else{
                s2.append('0');
            }    
        }
    
return  s2.toString();
}
}
