//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size]; 
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds	
		Dog temp = new Dog(age,name); 
		if ( spot < pups.length) { 
			pups[spot] = temp; 
		}
	}

	public String getNameOfOldest()
	{
		String temp = "-1"; 
		int age = 0; 
		Dog deg; 
		for (int i =0 ; i<pups.length; i++) { 
			deg = pups[i]; 
			if (deg.getAge() > age) { 
				age = deg.getAge(); 
				temp = deg.getName(); 
			}
			
		}
		return temp; 
	}

	public String getNameOfYoungest()
	{
		String temp = "-1"; 
		int age = pups[0].getAge(); 
		Dog deg; 
		for (int i =1 ; i<pups.length; i++) { 
			deg = pups[i]; 
			if (deg.getAge() < age) { 
				age = deg.getAge(); 
				temp = deg.getName(); 
			}
			
		}
		return temp; 
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}