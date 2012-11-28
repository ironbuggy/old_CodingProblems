
public class DecodeRomanNumeral 
{
	public static final int[] Numbers = {1,5,10,50,100,500,1000,5000,10000,50000,100000,500000,1000000};
	public static final char[] RomanNumerals = {'I','V','X','L','C','D','M','v','x','l','c','d','m'};
	public static String convertToNumber = ""; 

	public static void main(String[] args) 
	{
		int answer = 0;
		int romanCharIndex = 0;
		
		char[] romanCharArray = convertToNumber.toCharArray();
		
		for(int i=RomanNumerals.length-1; !(i<0); i--)
		{
			// match character
			while (romanCharIndex < romanCharArray.length && romanCharArray[romanCharIndex] == RomanNumerals[i])
			{
				// there's a next character
				if (romanCharIndex+1 < romanCharArray.length)
				{
					if (i+1 < RomanNumerals.length-1 && romanCharArray[romanCharIndex+1] == RomanNumerals[i+1])
					{
						if (answer != 0 && answer < Numbers[i+1] - Numbers[i])
						{
							System.out.println("Error: not a valid roman numeral");
							return;
						}
						answer = answer + Numbers[i+1] - Numbers[i];
						romanCharIndex+=2;
						continue;	
					}
					else if (i+2 < RomanNumerals.length-1 && romanCharArray[romanCharIndex+1] == RomanNumerals[i+2])
					{
						if (answer != 0 && answer < Numbers[i+2] - Numbers[i])
						{
							System.out.println("Error: not a valid roman numeral");
							return;
						}
						answer = answer + Numbers[i+2] - Numbers[i];
						romanCharIndex+=2;
						continue;
					}
				}
				
				answer = answer + Numbers[i];
				romanCharIndex++;				
			}	
			
			if (romanCharIndex > romanCharArray.length-1)
				break;
		}
		
		System.out.println(answer);
	}

}
