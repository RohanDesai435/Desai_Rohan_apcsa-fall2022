import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{		
		ArrayList <Integer> ray = new ArrayList <Integer>();
		int[] numbers = {10,9,8,7} ; 
		for (int i=0; i < numbers.length; i++) { 
			ray.add(numbers[i]); 
		}
		System.out.println(ListDown.go(ray)); 
		
	}
}