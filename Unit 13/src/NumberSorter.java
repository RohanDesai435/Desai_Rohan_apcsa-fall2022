//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown

	private static int getNumDigits(int number)
	{
		int count = 0;
		while (number >0) {
			number = number /10; 
			count ++; 
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number)
	{
		int[] sorted = new int[getNumDigits(number)];
		int i =0; 
		while (i <sorted.length) { 
			sorted[i] = number %10; 
			number /= 10; 
			i++; 
		}
		for (int j = 0; j<sorted.length; j++) { 
		for (int k = 0; k< sorted.length-1; k++) { 
			if (sorted[k] > sorted[k+1]) { 
				int temp = sorted[k]; 
				sorted[k] = sorted[k+1]; 
				sorted[k+1] = temp; 
			}
		}} 
		return sorted;
	}
}