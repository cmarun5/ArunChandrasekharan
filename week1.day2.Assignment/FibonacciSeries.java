package week1day2assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		int fib1=0,fib2=1, n=10;
		System.out.println( "Fibonacci Series ");
		for(int i=2 ; i <=n ; ++i) {
			int fib3=fib1+fib2;
			System.out.println( +fib3);
			fib1=fib2;
			fib2=fib3;
			
			
		}

	}

}
