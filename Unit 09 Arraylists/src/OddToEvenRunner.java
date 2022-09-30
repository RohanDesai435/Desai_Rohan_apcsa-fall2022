import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList <Integer> ray = new ArrayList <Integer>();
		int[] numbers = {7,1,5,3,11,5,6,7,8,9,10,12345,11} ; 
		for (int i=0; i < numbers.length; i++) { 
			ray.add(numbers[i]); 
		}
		
		System.out.println(ListOddToEven.go(ray)); 
	}
	
}