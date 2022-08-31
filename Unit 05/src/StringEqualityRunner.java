//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Scanner keyboard = new Scanner(in); 
		
		out.print("Enter a string");
		String s1 = keyboard.next(); 
		
		out.print("Enter another string");
		String s2 = keyboard.next(); 
		
		StringEquality test = new StringEquality(s1,s2); 
		out.print(test); 
		
	}
}