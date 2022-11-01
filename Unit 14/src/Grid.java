import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols]; 
		int length = vals.length; 
		ArrayList <String> strand = new ArrayList <String> (); 
		int rand; 
		
		while (strand.size()<length) { 
			rand = (int)(Math.random()*(length-1));
			String rander = rand + ""; 
			
				strand.add(vals[rand]); 
			
			
		}
		int index = 0; 
		for (int i=0; i<rows; i++) { 
			for (int j=0; j<cols; j++) { 
				grid[i][j] = strand.get(index); 
				index++; 
			}
		}
		
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int count =0 ; 
		int total =0; 
		String fin = ""; 
		for (int i=0; i<vals.length; i++) { 
			for (int j =0; j<vals.length; j++) { 
				if (vals[i].equals(vals[j])) { 
					count ++; 
				}
			}
			
			if (count >total) { 
				total = count ; 
				fin = vals[i]; 
			}
			count =0; 
		}
		return fin + " is the max and its count is " + total;
	}

	//returns a count of how many times val occurs in the matrix
	public int countVals( String val )
	{
		int count = 0; 
		for (int i=0; i<grid.length; i++) { 
			for (int j =0; j<grid[i].length; j++) { 
				if (grid[i][j].equals(val)) { 
					count ++; 
				}
			}}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i<grid.length; i++) {
			for (int j=0; j< grid[i].length; j++) {
				output = output + grid[i][j] + " ";
			}
			output = output +  "\n\n"; 
			
		}
		
		return output;
		
	}
}