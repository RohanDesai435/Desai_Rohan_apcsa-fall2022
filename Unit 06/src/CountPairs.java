//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		char temp = str.charAt(0); 
		for (int i=1; i<str.length(); i++) { 
			if (temp==str.charAt(i)) {
				count++; 
			}
			temp = str.charAt(i); 
		}
		return count;
	}
}