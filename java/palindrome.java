public class palindrome {
    public static void main(String[] args){
        int pln = 1221;
        int num =0;


        while (num!=0) {
            pln = pln *10 +num%10;
            num = num /10;
        
        
        }
        System.out.println("reverse palindrome is : "+ pln);
    }
}
