//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.Scanner;

public class TriplesRunner
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
	   out.print("pick a number ::"); 
	   int response = keyboard.nextInt(); 
	   
	   Triples test =  new Triples(response); 
	   out.print(test);
	}
}