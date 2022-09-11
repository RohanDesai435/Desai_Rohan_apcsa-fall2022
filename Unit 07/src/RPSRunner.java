//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		
		//add in a do while loop after you get the basics up and running
		String player = "";
		boolean trigger = false; 
		String resp = ""; 
		do { 
			out.print("type in your prompt [R,P,S] :: ");
			player = keyboard.next();  
	
			RockPaperScissors game = new RockPaperScissors(player);	
			out.print(game);
			out.print("want to continue y/n::");
			resp = keyboard.next(); 
			if (resp.equals("N") )
					trigger = true; 
		} while (trigger == false); 
		
	}
}



