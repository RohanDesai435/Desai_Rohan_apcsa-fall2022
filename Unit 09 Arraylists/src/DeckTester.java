

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		 String [] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jacks", "Queens", "Kings"}; 
			String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
			int [] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
			System.out.println(ranks.length + " " + suits.length + " "+ values.length) ;
			Deck test1 = new Deck(ranks,suits,values); 
			System.out.println(test1.size()); 
			System.out.println(test1); 
		
			test1.shuffle(); 
			System.out.println(test1); 
		
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

/* 
  String [] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jacks", "Queens", "Kings"}; 
		String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		int [] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};
		System.out.println(ranks.length + " " + suits.length + " "+ values.length) ;
		Deck test1 = new Deck(ranks,suits,values); 
		System.out.println(test1.size()); 
		System.out.println(test1); 
		
		test1.shuffle(); 
		System.out.println(test1); 
		*/ 
