//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size]; 
    	int j=0; 
    	for (int i=0; i<size;i++) { 
    		for (int k=0; k<size; k++) { 
    			m[i][k] = str.charAt(j) + ""; 
    			j++; 
    		}
    	}
    	
    }

    public boolean isFound( String word )
    {
    	for (int r = 0; r<m.length; r++) { 
    		for (int c=0; c<m[r].length; c++) { 
    			if (checkRight(word, r,c) || checkLeft(word, r,c)|| checkUp(word, r,c)|| checkDown(word, r,c) ||checkDiagUpRight(word,r,c)||checkDiagDownRight(word,r,c)||checkDiagUpLeft(word,r,c)||checkDiagDownLeft(word,r,c))
    				return true; 
    		}
    	}
    	return false; 
    }

	public boolean checkRight(String w, int r, int c)
   {
		for (int i=0; i<w.length(); i++) { 
			if (c+i>=m.length) { 
				return false;
			}
			else if (!m[r][c+i].equals(w.charAt(i) + "")) {
				return false; 
			}
			
		}
		return true;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		for (int i=0; i<w.length(); i++) { 
			if (c-i<0) { 
				return false;
			}
			else if (!m[r][c-i].equals(w.charAt(i) + "")) {
				return false; 
			}
			
		}
		return true;
	}

	public boolean checkUp(String w, int r, int c)
	{
		for (int i=0; i<w.length(); i++) { 
			if (r-i<0) { 
				return false;
			}
			else if (!m[r-i][c].equals(w.charAt(i) + "")) {
				return false; 
			}
			
		}
		return true;
	}

	public boolean checkDown(String w, int r, int c)
   {
		for (int i=0; i<w.length(); i++) { 
			if (r+i>=m.length) { 
				return false;
			}
			else if (!m[r+i][c].equals(w.charAt(i) + "")) {
				return false; 
			}
			
		}
		return true;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		for (int i=0; i<w.length(); i++) { 
			if (r-i<0 || c+i >=m.length) { 
				return false;
			}
			
			else if (!m[r-i][c+i].equals(w.charAt(i) + "")) {
				return false; 
			}
			
		}
		return true;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		for (int i=0; i<w.length(); i++) { 
			if (r-i<0 || c-i <0) { 
				return false;
			}
			
			else if (!m[r-i][c-i].equals(w.charAt(i) + "")) {
				return false; 
			}
			
		}
		return true;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		for (int i=0; i<w.length(); i++) { 
			if (r+i >=m.length ||  c-i <0) { 
				return false;
			}
			
			else if (!m[r+i][c-i].equals(w.charAt(i) + "")) {
				return false; 
			}
			
		}
		return true;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		for (int i=0; i<w.length(); i++) { 
			if (r+1 >=m.length ||  c+i >=m.length ) { 
				return false;
			}
			
			else if (!m[r+i][c+i].equals(w.charAt(i) + "")) {
				return false; 
			}
			
		}
		return true;
	}

    public String toString()
    {
    	String output = ""; 
    	for (int i=0; i<m.length;i++) { 
    		for (int k=0; k<m[i].length; k++) { 
    			output = output + m[i][k] + " " ; 
    			
    		}
    		output = output + "\n"; 
    	}
    	return output;
    }
}
