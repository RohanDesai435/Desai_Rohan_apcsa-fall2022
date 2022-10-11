//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore test = new ToyStore(); 
		test.loadToys("cat"); 
		test.loadToys("frog");
		test.loadToys("cat");
		test.loadToys("dog");
		System.out.println(test);
		System.out.println(test.getThatToy("cat"));
		System.out.println(test.getMostFrequentToy()+ " is the most freqeunt toy"); 
		test.sortToysByCount();
		System.out.println(test); 
	}
}