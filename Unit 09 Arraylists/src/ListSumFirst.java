//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	private int counter = -1; 
	public void go(List<Integer> ray)
	{
		
		int firstInt = ray.get(0) ;
		int count = 0; 
		
		for (int i=1; i<ray.size(); i++) { 
			if (ray.get(i) > firstInt) { 
				count+= ray.get(i); 
			}
		}
		if (count != 0) {
		counter = count; 
		} 
		
		
	}
	
	public String toString() { 
		return counter + " "; 
	}
}