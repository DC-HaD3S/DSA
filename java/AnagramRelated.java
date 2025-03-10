import java.util.Arrays;
public class AnagramRelated{
    public static void main(String[]args){
       

        if (isAnagram("liten", "sil")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
     public static boolean isAnagram(String str1, String str2) {
 

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count=0;
        for(int i=0;i<str2.length();i++){
            for(int j=0;j<str1.length();j++)
            if(str2.charAt(i)==str1.charAt(j)){
                count++;}
        }

        return count==str2.length();
    }
}