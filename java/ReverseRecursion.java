public class ReverseRecursion {
    String revstring(String st, String rev, int i) {
        int l = st.length();
        if (i == l) {
            return rev; 
        } else {
            rev = st.charAt(i) + rev;
            return revstring(st, rev, i + 1);
        }
    }
    public static String reverse(String str) {
        // Base Case: If string is empty or has only one character, return it
        if (str.isEmpty()) {
            return str;
        }
        // Recursive Case: Take the last character and add it in front of the reversed substring
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        ReverseRecursion obj = new ReverseRecursion();
        String original = "hello";
        reverse(original);
        String reversed = obj.revstring(original, "", 0);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}


