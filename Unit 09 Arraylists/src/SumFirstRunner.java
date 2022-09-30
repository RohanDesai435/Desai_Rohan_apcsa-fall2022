import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{	
		ArrayList<Integer> ray = new ArrayList<Integer>(); 
		ray.add(-99); 
		ray.add(1); 
		ray.add(2); 
		System.out.println(ray);
		
		ListSumFirst temp = new ListSumFirst(); 
		temp.go(ray); 
		System.out.println(temp); 
	}
}