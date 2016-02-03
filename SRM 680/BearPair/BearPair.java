
/* Formally, Limak must find two integers i and j with the following properties:

Both i and j must be valid indices into s. That is, both numbers must be between 0 and n-1, inclusive, where n is the length of s.
The characters s[i] and s[j] must be different.
The difference between i and j must be as large as possible.


You are given the String s. If Limak cannot choose any integers with the required properties, return -1. Otherwise, return the largest possible difference between i and j. */

public class BearPair
{
	public static int bigDistance(String s)
	{
		int tempNumb = -1;
		for(int x = 0; x < s.length(); x++)
		{
			char c1 = s.charAt(x);	
			for(int y = 0; y < s.length(); y++)
			{
				char c2 = s.charAt(y);
				if(c1 != c2)
				{
					int test = y - x;
					if(test > tempNumb)
					{
						tempNumb = test;
					}		
				}
			}
		}
		return tempNumb;
	}
	
	
	public static void main(String [] args)
	{
		System.out.println(bigDistance("bear")); //3
		System.out.println(bigDistance("abcba")); //3
		System.out.println(bigDistance("oooohyeahpotato")); //13
		System.out.println(bigDistance("zzzzzzzzzzzzzzzzzzzzz")); //-1
		System.out.println(bigDistance("qw")); //1
		System.out.println(bigDistance("xxyyxyxyyyyyyxxxyxyxxxyxyxyyyyyxxxxxxyyyyyyyyxxxxx")); //47
	}
}
