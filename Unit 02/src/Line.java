//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double slope = (((double) y2)- ((double) y1)) / (((double) x2)- ((double) x1)) ; 
		return slope;
	}

}