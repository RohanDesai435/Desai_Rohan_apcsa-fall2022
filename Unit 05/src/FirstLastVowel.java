//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   int leng = a.length()-1; 
		if (a.charAt(0) == 'a' || a.charAt(0) == 'e' || a.charAt(0) == 'i'|| a.charAt(0) == 'o'|| a.charAt(0) == 'u') {
			return "yes"; 
		}
		if (a.charAt(leng) == 'a' || a.charAt(leng) == 'E' || a.charAt(leng) == 'i'|| a.charAt(leng) == 'o'|| a.charAt(leng) == 'u') { 
			return "yes"; 
		} 
		return "no";
	}
}