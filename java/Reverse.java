import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        System.out.println("enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int ans = 0;
        while(num>0){
            int lastdigit = num % 10;
            ans = ans * 10 + lastdigit;
            num = num / 10;

        }
        System.out.println("reverse num is:" + ans);
    }
}
