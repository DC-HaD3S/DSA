public class prime {
    public static void main(String[] args) {
        int num = 14;
        int count = 0;

        for(int i=1;i<num/2 ;i++){
            if (num%i==0) {
                count++;
            }
        }if(count>=2){
            System.out.println("is not a prime number");
        }else {
            System.out.println("is a prime number");
        }
        System.out.println(count);

        
    }
}
