//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.ArrayList;

public class Word implements Comparable<Word>
{
	private String word;
	

	public Word( String s )
	{
		word =s; 
	 
	}
	public String getName() { 
		return word; 
	}
	public int compareTo( Word rhs )
	{		
		String s= rhs.getName(); 
		if(word.length() < s.length())
			return -1; 
		if (word.length() > s.length())
			return 1; 
		return word.compareTo(s);
	}

	public String toString()
	{
		return ""+ word;
	}
}