//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	ArrayList <Integer> row = new ArrayList <Integer> (); 
    	
    	for (int i = 0; i<m.length; i++) { 
    		int sum = 0; 
    		for (int j=0; j<m[i].length; j++) { 
    			sum += m[i][j]; 
    		}
    		row.add(sum);  
    	} 
		return row;
    }
}
