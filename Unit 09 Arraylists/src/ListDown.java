//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(List<Integer> numArray)
	{
		boolean trigger = true; 
		int first = numArray.get(0); 
		
		for (int i = 0; i< numArray.size(); i++) { 
			if (numArray.get(i) < first ) { 
				trigger =false; 
				break; 
			}
		}
		return trigger; 
	}	
}