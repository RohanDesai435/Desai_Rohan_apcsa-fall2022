//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
		int n = 1; 
		for (int k = 0 ; k <word.length(); k++) { 
			for (int i = 0; i<n ; i++)
			{ 
				System.out.print(word.substring(0,n));	
			}
			System.out.println(); 
			n++; 
		}
	} 
}

