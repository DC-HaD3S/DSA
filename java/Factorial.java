public class Factorial{
	public static int fact1(int n){
	int f= 1;
	for(int i=2;i<= n;i++){
	f *= i;
	}
	return f;
	}


public static void main(String[] args){
	int num = 5;
	System.out.println("factorial of"+ num +"is"+ fact1(num));
}
}