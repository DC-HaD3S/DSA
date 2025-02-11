public class Assending {
    public static void main(String[] args){
        String str = "DCBA";
        String asc = "";
        


        for(int i=str.length()-1;i>=0;i--){
            asc = asc+str.charAt(i);
        }
        System.out.println("assending str is "+asc);
    }
}
