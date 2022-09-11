//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
		setAmount(0); 
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c); 
		setAmount(amt); 
	}

	public void setLetter(char c)
	{
		letter = c; 
	}

	public void setAmount(int amt)
	{
		amount = amt; 
	}
	public void findTriangleFive() { 
		
		for (int n = 0; n < amount; n++) { 
		int numletter = 0; 
		for (int i = amount; i>0+n; i--) { 
			
			for (int j = 0; j< i; j++) { 
				out.print((char)(letter + numletter)); 
				
			}
			numletter++; 
			out.print(" ");
		}
		out.print("\n"); 
		}
	}
	public String toString()
	{
		String output="";
		findTriangleFive(); 
		return "\n\n" + letter + " " + amount;
	}
}