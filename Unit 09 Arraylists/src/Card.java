

/**
 * Card.java
 *
 * <code>Card</code> represents a playing card.
 */
public class Card {

	
	private String suit; // String value that holds the suit of the card
	
	private String rank; // String value that holds the rank of the card

	private int pointValue;//integer value that holds the point value.


	public Card(String cardRank, String cardSuit, int cardPointValue) {
		suit = cardSuit; 
		rank = cardRank; 
		pointValue = cardPointValue; 
	}


	public String suit() {
		return suit; 
   }

	public String rank() {
		return rank; 
	}

  
	public int pointValue() {
		return pointValue; 
	}

	public boolean matches(Card otherCard) {
		if (otherCard.rank() == rank && otherCard.suit() == suit && otherCard.pointValue() == pointValue) { 
			return true; 
		}
		else { 
			return false; 
		}
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a <code>Deck</code> in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a <code>String</code> containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
		return rank + " of " + suit + " (point value = " + pointValue + ")"; 
	}
}

