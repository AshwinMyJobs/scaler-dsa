package dsa.recursion;

public class FibonacciSeriesProblems {

	public static void main(String[] args) {
		
//		printFibonacciSeries(10);

		System.out.println("Printing fib series calling recursive functiion");
		for (int i = 0; i < 10; i++) {
			System.out.print(fib(i) + " ");
		}
	}

//	/*
//	 * Method to print fibonacci series numbers up to N numbers.
//	 * Needs some  improvement
//	 */
//	public static void printFibonacciSeries(int N) {
//
//		int a=0, b=1, c=1, count=0;
//
//		if(N<2) {
//			System.out.println("Minimum 2 numbers are needed for fibonacci series........");
//			System.exit(0);
//		}
//
//		while(count<=N) {
//			if(a==0 && b==1 && c==1) {
//				System.out.print(a + " " + b + " " + c);
//				int temp = a + b;
//				a = b;
//				b = temp;
//				count = 3;
//			}else {
//				int temp = a + b;
//				a = b;
//				b = temp;
//				System.out.print(" "+b);
//				count++;
//			}
//		}
//		System.out.println("\n" + count);
//	}

	/**
	 * This method return fibonacci series numbers recursively
	 */
	private static int fib(int n){
		if(n<=1){
			return n;
		}else{
			return fib(n-1) + fib(n-2);
		}
	}
}
