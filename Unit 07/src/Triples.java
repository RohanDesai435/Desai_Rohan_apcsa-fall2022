//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num); 

	}

	public void setNum(int num)
	{
		number=num; 

	}

	public void findTriples() { 
		
		int a, b, c;

        for (a = 1; a < number; a++) {

            for (b = 1; b < number; b++) {

                for ( c = 1; c < number; c++){
                    if( (Math.pow(a,2) + Math.pow(b, 2) == Math.pow(c, 2))) {
                    	if ((a%2==1 && b%2==0 && c%2 ==1 )||(a%2==0 && b %2 ==1 && c%2==1)) { 
                    		if (greatestCommonFactor(a,b,c) <=1) { 
                    			out.print(a + " and " + b + " and " + c +"\n\n");
                    		}
                    	}
                        
                    }   
                }
            }

          
           
        }
	}
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcd = 1;
		for (int count = 2; count < a; count++){
		   if (a % count == 0 && b % count == 0 && c % count == 0) 
			   gcd = count;
		}

		return gcd;
	}

	public String toString()
	{
		String output="";
		findTriples(); 



		return  " "; 
	}
}