//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		int[] arr = NumberShifter.makeLucky7Array(7); 
		for (int i=0; i<arr.length; i++) { 
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n\n");
		NumberShifter.shiftEm(arr); 
		for (int i=0; i<arr.length; i++) { 
			System.out.print(arr[i] + " ");
		}
	}
}



