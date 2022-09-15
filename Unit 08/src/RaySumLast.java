//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	private int answer =0; 
	public void go(int[] ray)
	{
		int length = ray.length; 
		int greater = ray[length-1]; 
		int total =0;
		
		for (int i =0; i<length-1; i++) { 
			if (ray[i] > greater)  { 
				total = total+ ray[i]; 
			}
		}
		if (total == 0) 
			answer = -1; 
		else { 
		answer = total; 
		} 
	}
	
	public String toString() { 
		
		return "" +  answer; 
	}

}