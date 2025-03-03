import java.util.*;

class PartitionArrayAccordingtoGivenPivot{
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> left = new ArrayList<>();
        List<Integer> middle = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) left.add(num);
            else if (num == pivot) middle.add(num);
            else right.add(num);
        }

        left.addAll(middle);
        left.addAll(right);
        
        return left.stream().mapToInt(i -> i).toArray();
    }
}