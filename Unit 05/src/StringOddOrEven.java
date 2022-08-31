//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
		setString(""); 
	}

	public StringOddOrEven(String s)
	{
		setString(s); 
	}

	public void setString(String s)
	{
		word = s; 
	}

 	public boolean isEven()
 	{
		int wleng = word.length(); 
		if ((wleng % 2) == 1) {
			return false; 
		}
		else return true; 
	}

 	public String toString()
 	{
 		String output="";
 		if (isEven()) {
 			output = "even";
 		}
 		else output = "odd"; 
 		return word + " is " + output;
	}
}