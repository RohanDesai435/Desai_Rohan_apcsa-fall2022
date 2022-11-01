//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		int count = 0; 
		if (num ==0) 
			return 0; 
		if (num % 2 ==0) 
			count=1; 
		return count + countOddDigits(num/10); 
	}
}

