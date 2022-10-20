//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	//add instance variables	
	private int size; 
	private String name; 
	//add a constructor
	public Skeleton(int s, String n) { 
		size = s; 
		name = n; 
	}
	//add code to implement the Monster interface
	public String getName() { 
		return name; 
	}
	public int getHowBig() { 
		return size; 
	}
	public boolean isBigger(Monster other) { 
		if(other.getHowBig()>size)
			return true; 
		return false; 
	}
	public boolean isSmaller(Monster other) {
		if(other.getHowBig()<size)
			return true; 
		return false; 
	}
	public boolean namesTheSame(Monster other) {
		if (other.getName().equals(name))
			return true; 
		return false; 
	}
	//add a toString
}