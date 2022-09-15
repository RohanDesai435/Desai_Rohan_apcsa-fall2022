//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int oddIndex = -1;  
		int evenIndex = -1; 
		boolean trigger = false; 
		int i =0; 
		while (trigger == false) { 
			if (ray[i] % 2 ==1 ) {
				oddIndex = i; 
				trigger = true; 
			}
			if (i == ray.length-1)
				break; 
			i++; 
		}
		trigger = false; 
		while (trigger == false) { 
			if (ray[i] % 2 ==0 ) {
				evenIndex = i; 
				trigger = true; 
			}
			if (i == ray.length-1)
				break; 
			i++; 
		}
		if (oddIndex == -1 || evenIndex == -1) 
			return -1; 
		
		return evenIndex - oddIndex; 
	}
}