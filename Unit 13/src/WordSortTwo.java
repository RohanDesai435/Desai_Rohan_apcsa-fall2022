//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String s; 
	private String[] wordRay;
	private ArrayList <Integer>temp = new ArrayList<Integer>();
	
	
	public WordSortTwo(String sentence)
	{
	
		ArrayList <Integer>temp = new <Integer> ArrayList(); 
		temp.add(0); 
		for (int i=0; i<sentence.length(); i++) { 
			if (sentence.charAt(i) == ' ') { 
				temp.add(i); 
			}
		}
		temp.add(sentence.length()) ;
		wordRay = new String[temp.size()-1]; 
		
		for (int i =0; i<temp.size()-1; i++) { 
			wordRay[i] = sentence.substring(temp.get(i), temp.get(i+1)); 		
		} 
	}
	

	public void sort()
	{
		for (int i=0; i<wordRay.length; i++) { 
			for (int j =0; j<wordRay.length-1; j++) {
				if (wordRay[j].compareTo(wordRay[j+1]) >0) {
					String t = wordRay[j]; 
					wordRay[j] = wordRay[j+1];
					wordRay[j+1] = t; 
				}
			}
		}
	}

	public String toString()
	{
		String output=""; 
		for (int i=0; i<wordRay.length; i++) { 
			output =output+ wordRay[i] + " "; 
		}
		return output +"\n\n";
	}
}