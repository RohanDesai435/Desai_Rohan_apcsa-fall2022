//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>() ; 
		
	}

	public void loadToys( String toys )
	{
		Toy temp = new Toy(toys); 
		int i = 0; 
		boolean trigger = false; 
		for (i=0; i<toyList.size(); i++) { 
			if (toyList.get(i).getName().equals(temp.getName())) {
				toyList.get(i).setCount(toyList.get(i).getCount()+1);
				 trigger = true; 
			}
			
		}
		if (trigger == false)
		toyList.add(temp); 
	}
  
  	public Toy getThatToy( String nm )
  	{
  		Toy temp =new Toy(); 
  		for (int i = 0; i<toyList.size(); i ++) { 
  			if (toyList.get(i).getName().equals(nm))
  				temp = toyList.get(i); 
  		}
  		return temp;
  	}
  
  	public String getMostFrequentToy()
  	{
  		Toy temp = new Toy(); 
  		int cnt = 0; 
  		for (int i = 0; i<toyList.size(); i++) { 
  			if (toyList.get(i).getCount()>cnt) { 
  				cnt = toyList.get(i).getCount(); 
  				temp = toyList.get(i); 
  			}
  		}
  		return temp.getName(); 
  	}  
  
  	public void sortToysByCount()
  	{
  		int k = 0; 
  		int start = toyList.get(k).getCount(); 
  		for (int i =0; i<toyList.size(); i++) { 
  			if (toyList.get(i).getCount()<start ) { 
  				Toy temp = toyList.get(k); 
  				toyList.set(k, toyList.get(i)); 
  				toyList.set(i, temp); 
  				k++;  
  			}
  		}
  	}  
  	  
	public String toString()
	{
	   return "" + toyList;
	}
}