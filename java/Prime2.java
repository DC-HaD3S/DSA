public class Prime2{
    public static void main(String[] args) {
        int start=2; int end= 20;
        for(int i= start;i<=end;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        
    }
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
                }
        }
        return true;

    }
}