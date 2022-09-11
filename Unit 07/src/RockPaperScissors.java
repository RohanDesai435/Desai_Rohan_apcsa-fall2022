//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers(""); 
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player; 
	}

	public String determineWinner()
	{
		randomChoice(); 
		if (playChoice.equals(compChoice))
			return " Tie"; 
		else if ((playChoice.charAt(0) == 'R')&&(compChoice.charAt(0) == 'S'))
			return "Player Wins"; 
		else if ((playChoice.charAt(0) == 'S')&&(compChoice.charAt(0) == 'P'))
			return "Player Wins"; 
		else if ((playChoice.charAt(0) == 'P')&&(compChoice.charAt(0) == 'R'))
			return "Player Wins"; 
		else 
			return "Computer Wins"; 
	}
	public void randomChoice () 
	{ 
		int random =(int) (Math.random() *3); 
		if (random == 0) 
			compChoice = "R"; 
		else if (random == 1) 
			compChoice = "P"; 
		else 
			compChoice = "S"; 
	}

	public String toString()
	{
		return determineWinner() + "\n"; 
	}
}