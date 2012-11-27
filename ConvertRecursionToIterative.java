
public class ConvertRecursionToIterative {

	public static void main(String[] args) {

		System.out.println("recurse: " + recursion(100));
		
		System.out.println("iterate: " + iterative(100));
		
	}
	
	/*
	 *             r(5) = r(4) + 2 * r(3) + 3 * r(2)
	 *             r(4) = r(3) + 2 * r(2) + 3 * r(1)
	 *             r(3) = 3
	 *             r(2) = 2
	 *             r(1) = 1
	 */
	public static int recursion(int n)
	{
		if (!(n>3))
			return n;
		
		return recursion(n-1) + 2 * recursion(n-2) + 3 * recursion(n-3);
	}
	
	public static int iterative(int n)
	{		
		int[] values = new int[n+1];
		for(int i=0; i<values.length; i++)
		{
			values[i] = -1;
		}
		
		for(int i=1; i<n+1; i++)
		{
			if(i==1 || i==2 || i==3)
			{
				values[i] = i;
				continue;
			}
			
			values[i] = values[i-1]+2 * values[i-2]+3 * values[i-3];
		}
		
		return values[n];
	}

}
