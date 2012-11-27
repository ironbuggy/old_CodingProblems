
public class Fibonacci {

	private static int n = 22;
	
	public static void main(String[] args) {

		if (n<0)
		{
			System.out.println("Error: Invalid input, n must be > 0");
			return;
		}
		
		System.out.println(fib(n));
	}
	
	public static int fib(int number)
	{
		if (number == 0)
			return 0;
		else if (number == 1)
			return 1;
		
		return (fib(number-1) + fib(number-2));
	}
}

