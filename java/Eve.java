public class Eve {
    public static void main(String[] args) {
        int num = 134526;
        int countEven = 0;
        int countOdd = 0;
        
         
        while (num > 0) {
            

            int lastdigit = num % 10 ; 

            if(lastdigit % 2==0){
                countEven++;
            }else {
                countOdd++;
            }
            num = num/10;
        }
         System.out.println("count of even : "+ countEven + " count of odd : "+countOdd);
    }
}
