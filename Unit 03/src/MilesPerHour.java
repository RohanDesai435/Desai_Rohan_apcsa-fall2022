//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes,f;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist,hrs,mins); 
		
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist; 
		hours = hrs; 
		minutes = mins;
	}

	public void calcMPH()
	{
		mph =  (double) distance / ((double) hours  +  (double) minutes/60); 
		mph = round(mph); 
		f = (int) mph; 
		 
	}

	public String print()
	{
		
		out.print(Integer.toString(distance) + " miles in " + Integer.toString(hours) + " hour and " + Integer.toString(minutes) + " minutes = " + Integer.toString(f) + " MPH");
		return null;
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "k";
	}
}