import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
class MinOperations {
    public int minOperations(int[] a, int k) {
        Arrays.sort(a);
        List<Integer> b = new ArrayList<>();
        for (int i = 0, j = 0, count = 0, x, y; ; ++count) {
            if (i < a.length && (j >= b.size() || a[i] <= b.get(j))) x = a[i++];
            else x = b.get(j++);
            if (x >= k) return count;
            if (i < a.length && (j >= b.size() || a[i] <= b.get(j))) y = a[i++];
            else y = b.get(j++);
            long t = 2L * x + y; // test overflow
            b.add(t < k ? (int) t : k);
        }
    }
}