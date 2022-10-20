//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		//ask for name and size
		System.out.println("What is the name"); 
		String s = keyboard.next(); 
		System.out.println("What is size?"); 
		int i = keyboard.nextInt(); 
		//instantiate monster one
		Skeleton temp1 = new Skeleton(i,s); 
		//ask for name and size
		System.out.println(temp1.getName()); 
		System.out.println(temp1.getHowBig()); 
		//instantiate monster two
		Skeleton temp2 = new Skeleton(i,s+1); 
	}
}