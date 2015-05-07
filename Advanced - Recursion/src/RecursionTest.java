class Factorial {
	
	public int fact(int n) {
		if(n==1)
			return 1;
		return fact(n-1)*n;
	}
	
	public int iterative(int n) {
		int total = 1;
		for(int i=n; i>0; i--) {
			total *= i;
		}
		return total;
	}
	
	public int fibo(int n) {
		if(n==0) {
			return 1;
		}
		if(n==1)
			return 1;
		return fibo(n-1)+fibo(n-2);
	}
}
public class RecursionTest {
	public static void main(String[] args) {
		Factorial f = new Factorial();
		
		System.out.println(f.fact(4));
		System.out.println(f.iterative(4));
		
		System.out.println(f.fibo(8));
	}
	
}
