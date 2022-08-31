//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   Scanner keyboard = new Scanner(in); 
		
		out.print("Enter a string ::"); 
		String s1 = keyboard.nextLine(); 
		
		out.print("Enter a string ::"); 
		String s2 = keyboard.nextLine(); 
		
		WordsCompare test = new WordsCompare(s1,s2); 
		test.compare(); 
		out.print(test);
	}
}