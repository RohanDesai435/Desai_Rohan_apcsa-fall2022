//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int odd = -1; 
		int even = -1; 
		int n = 0; 
		for (int i=0; i< ray.size(); i++) {
			
			if (ray.get(i) % 2 == 1) { 
				odd = i; 
				n = i; 
				break; 
			}
		}
		for (int j = n; j< ray.size(); j++) {
			
			if (ray.get(j) % 2 == 0) { 
				even = j; 
				 
			}
		}
		if (odd ==-1  || even == -1)
		return -1;
		
		return even - odd; 
		
		
	}
}