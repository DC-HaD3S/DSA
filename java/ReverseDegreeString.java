public class ReverseDegreeString{

    public static int reverseDegree(String s) {
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            sum += (26 - (s.charAt(i) - 'a')) * (i + 1);
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(reverseDegree("abc"));  
    }
}

