//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors
   public Perfect () { 
	   setNumber(0); 
   }
   public Perfect (int n) { 
	   setNumber(n); 
   }

	//add a set method
   public void setNumber (int n) {
	   number = n; 
   }

	public boolean isPerfect()
	{
		boolean toggle = false; 
		int total = 0; 
		for (int i =1; i<number; i++) { 
			if (number%i == 0) { 
				total += i; 
			}
		}
		if (total == number)
		{
			toggle = true; 
		}
		return toggle;
	}

	//add a toString	
	public String toString() { 
		return number + " is" + isPerfect() + " perfect" ; 
	}
}