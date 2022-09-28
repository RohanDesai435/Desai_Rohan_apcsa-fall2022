package activity3;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String [] ranks = {"A", "B", "C"}; 
		String [] suits = {"Giraffes", "Lions"};
		int [] values = {2,1,6};
		Deck test1 = new Deck(ranks,suits,values); 
		System.out.println(test1.size()); 
		System.out.println(test1); 
		test1.deal(); 
		System.out.println(test1); 
		System.out.println(test1.isEmpty()); 
		
		String [] ranks2 = {"D", "E"}; 
		String [] suits2 = {"F", "E"};
		int [] values2 = {1,2};
		Deck test2 = new Deck(ranks2,suits2,values2); 
		System.out.println(test2.size()); 
		System.out.println(test2); 
		test2.deal(); 
		System.out.println(test2); 
		System.out.println(test2.isEmpty()); 
		
		
		String [] ranks3 = {"D", "E"}; 
		String [] suits3 = {"F", "E"};
		int [] values3 = {1,2};
		Deck test3 = new Deck(ranks3,suits3,values3); 
		System.out.println(test3.size()); 
		System.out.println(test3); 
		test3.deal(); 
		System.out.println(test3); 
		System.out.println(test3.isEmpty()); 
		
	}
}
