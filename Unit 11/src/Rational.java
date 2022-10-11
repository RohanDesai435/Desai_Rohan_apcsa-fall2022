//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int numerator; 
	private int denominator; 

	public Rational () { 
		numerator = 1; 
		denominator = 1; 
	}
	public Rational (int x, int y) { 
		numerator = x; 
		denominator = y; 
	}
	public void setRational (int num, int dem) { 
		numerator = num; 
		denominator =dem; 
	}

	
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		
		numerator = other.getNumerator() * denominator + other.getDenominator()*numerator; 
		denominator = other.getDenominator()* denominator; 

		reduce();
		reduce(); 
	}

	private void reduce()
	{
		while (numerator %2 == 0 && denominator %2== 0) { 
			numerator = numerator /2; 
			denominator = denominator/2; 
		}
		while (numerator %3 == 0 && denominator %3== 0) { 
			numerator = numerator /3; 
			denominator = denominator/3; 
		}
		while (numerator %5 == 0 && denominator %5== 0) { 
			numerator = numerator /5; 
			denominator = denominator/5; 
		}
		while (numerator %7 == 0 && denominator %7== 0) { 
			numerator = numerator /7; 
			denominator = denominator/7; 
		}
	}

	

	public Object clone ()
	{
		return this;
	}



	public int getNumerator () { 
		return numerator; 
	}
	public int getDenominator() { 
		return denominator; 
	}
	
	
	
	public boolean equals( Rational obj)
	{
		obj.reduce(); 
		obj.reduce(); 
		int temp2 = obj.getNumerator(); 
		if  (temp2 == numerator && obj.getDenominator()==denominator){ 
			return true; 
		}
		
		return false;
	}

	public int compareTo(Rational other)
	{
		other.reduce(); 
		other.reduce(); 
		double rOne = (double)numerator/(double)denominator; 
		double rTwo = (double)other.getNumerator()/ (double)other.getDenominator(); 
		if (rOne >= rTwo) 
			return 1; 
		

		return -1;
	}



	public String toString() { 
		return numerator + " / " + denominator; 
	}
	
	
	
}