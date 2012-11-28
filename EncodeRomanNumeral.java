public class EncodeRomanNumeral 
{
	public static final int[] Numbers = {1,5,10,50,100,500,1000,5000,10000,50000,100000,500000,1000000};
	public static final char[] RomanNumerals = {'I','V','X','L','C','D','M','v','x','l','c','d','m'};
	public static int convertToRoman = 90; 
	
	public static void main(String[] args) 
	{
		String answer = "";
		int remainingValue = convertToRoman;
		
		for(int i=Numbers.length-1; !(i<0); i--)
		{
			if (remainingValue==0)
				break;

			while(!(remainingValue < Numbers[i]))
			{
				remainingValue -= Numbers[i];
				answer += RomanNumerals[i];
			}			
			
			// encode differently when value is 5xxxx-1xxxx 
			if (i%2==1 && i>0 && !(remainingValue < Numbers[i] - Numbers[i-1]) && remainingValue < Numbers[i])
			{
				remainingValue = remainingValue - (Numbers[i] - Numbers[i-1]);
				answer = answer + RomanNumerals[i-1] + RomanNumerals[i];
			}

			// encode differently when value is 1xxxx-1xxx
			if(i%2==0 && i>1 && !(remainingValue < Numbers[i] - Numbers[i-2]) && remainingValue < Numbers[i])
			{
				remainingValue = remainingValue - (Numbers[i] - Numbers[i-2]);
				answer = answer + RomanNumerals[i-2] + RomanNumerals[i];
			}		
		}
		System.out.println(answer);
	}
}
