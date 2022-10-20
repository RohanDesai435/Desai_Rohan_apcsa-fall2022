//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		ArrayList<Word> total = new ArrayList<Word>(size); 
		
		for (int i = 0 ; i< size; i++) { 
			Word temp = new Word(file.next()); 
			total.add(temp);  
			file.nextLine(); 
		}
	
		for (int i = 0; i< size-1; i++) { 
			
			for (int k =0; k<size-1; k++) { 
				
				if (total.get(k).compareTo(total.get(k+1)) > 0){ 
					
					Word tempora = total.get(k); 
					total.set(k, total.get(k+1));
					total.set(k+1, tempora); 
				}
				
			}
			
		}
		/*for (int i =0; i<total.size(); i++) { 
			System.out.println(total.get(i)); 
		}*/
		System.out.println(total); 









	}
}