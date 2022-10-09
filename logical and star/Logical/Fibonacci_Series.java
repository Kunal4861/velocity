package Logical;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int n=9;
		System.out.print("fibbonacci series for n is -->");
		for(int i=1;i<=n;i++) {
			
			int c=a+b;
			System.out.print(","+c);
			a=b;
			b=c;
			
			
		}
		
	}

}
