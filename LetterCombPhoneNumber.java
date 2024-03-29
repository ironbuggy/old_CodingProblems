/*
 * Question from: http://www.leetcode.com/onlinejudge
 * 
 * Letter Combinations of a Phone Number
 * 
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * 1 {}
 * 2 {a,b,c}
 * 3 {d,e,f}
 * 4 {g,h,i}
 * 5 {j,k,l}
 * 6 {m,n,o}
 * 7 {p,q,r,s}
 * 8 {t,u,v}
 * 9 {w,x,y,z}
 * 0 {}
 * 
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * Note: Although the above answer is in lexicographical order, your answer could be in any order you want.
 * 
 */

import java.util.*;

public class LetterCombPhoneNumber 
{
	private static final HashMap<Integer,char[]> phoneChars;
	private static final String stringDigits = "44999999";
	private static final char[] charDigits;
	
	// static initializer
	static 
	{
		phoneChars = new HashMap<Integer,char[]>();
		phoneChars.put(1, new char[]{});
		phoneChars.put(2, new char[]{'a','b','c'});
		phoneChars.put(3, new char[]{'d','e','f'});
		phoneChars.put(4, new char[]{'g','h','i'});
		phoneChars.put(5, new char[]{'j','k','l'});
		phoneChars.put(6, new char[]{'m','n','o'});
		phoneChars.put(7, new char[]{'p','q','r','s'});
		phoneChars.put(8, new char[]{'t','u','v'});
		phoneChars.put(9, new char[]{'w','x','y','z'});
		phoneChars.put(0, new char[]{});
		
		charDigits = stringDigits.toCharArray();
	}
	
	public static void main(String[] args) 
	{
		// we are using HashSets to ignore duplicates
		HashSet<String> answer = new HashSet<String>();
		
		answer = recurse(0, answer, "");

		System.out.println(answer.toString());

		return;
	}
	
	public static HashSet<String> recurse(int charIndex, HashSet<String> answer, String word)
	{
		if (charIndex == charDigits.length)
			answer.add(word);
		
		for(int i=charIndex; i<charDigits.length; i++)
		{
			int d = Character.digit(charDigits[i],10);
			char[] letters = (char[]) phoneChars.get(d);
						
			for(int j=0; j<letters.length; j++)
			{
				recurse(charIndex+1, answer, word + letters[j]);
			}
		}
		return answer;
	}
}
