//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	
	public static int[] makeLucky7Array( int size)
	{
		int [] total = new int[size]; 
		for (int i=0; i<size; i++) { 
			total[i] = (int)(Math.random() * 9) + 1; 
		}
	
		return total;
	}
	public static void shiftEm(int[] array)
	{
		int begin = 0; 
		for (int i = 0; i<array.length; i++) { 
			if (array[i] == 7) { 
				int temp = array[begin]; 
				array[begin] = 7; 
				array[i] = temp; 
				begin++; 
			}
			
		}
		
		
		
		
		
	}
}