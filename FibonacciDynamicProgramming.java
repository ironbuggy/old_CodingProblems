/*
 * 10th Fibonacci Number
 * 
 * 10th = 9th + 8th
 * 9th = 8th + 7th
 * 8th = 7th + 6th
 * etc...
 * 
 */


public class FibonacciDynamicProgramming {

	private static int n = 44;
	private static int[] fibArray;
	
	public static void main(String[] args) {

		// we are indexing with the fib number
		fibArray = new int[n+1];
		
		for (int i=0; i<fibArray.length; i++)
			fibArray[i] = -1;
		
		fibArray[0] = 0;
		fibArray[1] = 1;
		
		System.out.println(fib(n));
	}
	
	public static int fib(int number) {
		
		if (fibArray[number] == -1) {
			fibArray[number] = fib(number-1) + fib(number-2);
		}
		
		return fibArray[number];
	}
}

