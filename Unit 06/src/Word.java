//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class Word
{
	private String word;

	public Word()
	{
		setString(""); 
	}

	public Word(String s)
	{
		setString(s); 
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return word.charAt(0);
	}

	public char getLastChar()
	{
		return word.charAt(word.length()-1);
	}

	public String getBackWards()
	{
		String temp = ""; 
		for (int i = word.length()-1; i >=0; i--) { 
			temp += word.charAt(i); 
		}
		return temp; 
	}

 	public String toString()
 	{
 		return  getFirstChar() + " " + getLastChar() + " " + getBackWards();
	}
}