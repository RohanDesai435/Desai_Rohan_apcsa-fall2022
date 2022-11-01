//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		String []temp = {"c", "a", "c", "d", "e", "f", "g", "h", "k"}; 
		Grid test = new Grid(3,3,temp) ;
		System.out.print(test);
		System.out.println(test.findMax(temp)); 
		System.out.println(test.countVals("s")); 
		System.out.println(test.countVals("g"));
	}
}