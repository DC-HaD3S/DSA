import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("worthh", "throw")); // false
        System.out.println(isAnagram("listen", "silent")); // true
           if (isAnagram("worthh", "throw")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (isAnagram("listen", "silent")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
