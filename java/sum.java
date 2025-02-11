public class sum {


    public static int Add(int num){
        int sum = 0;
        while(num > 0){
            int lastdigit = num % 10;
            sum = lastdigit +sum;
            num = num /10;
        } 
        return sum;

    }
    public static void main(String[] args) {
        System.out.println("sum of all the digit is: "+ Add(4351));
    }
}
