
public class Power {

	private static final int base = 2;
	private static final int power = 50;
	
	private static long powers[];
	
	public static void main(String[] args) {
		
		powers = new long[power+1];
		
		for(int i=0; i<power+1; i++)
			powers[i] = -1;
		
		powers[0] = 1;
		powers[1] = base;
		
		System.out.println(power(base,power));
	}
	
	public static long power(int base, int power)
	{
		if (power % 2 == 0)
		{
			if (powers[power/2] == -1)
			{
				powers[(power/2)] = power(base, power/2);
			}
			return (powers[(power/2)]*powers[(power/2)]);
		}
		else
		{
			if (powers[(power-1)/2] == -1)
			{
				powers[((power-1)/2)] = power(base, (power-1)/2);
			}
			return (base * powers[((power-1)/2)] * powers[((power-1)/2)]);
		}	
	}
}
