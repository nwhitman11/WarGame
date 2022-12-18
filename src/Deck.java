
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {


//Fields
	//1.  Cards (List of Card)
	
	List<Card> deck = new ArrayList<Card>();
	

// Methods
	//1.  Shuffle (randomizes the order of the cards)
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	//2.  Draw (removes and returns the top card of the Cards field)
	public Card playCard() {
		Card playedCard = this.deck.get(0);
		this.deck.remove(0);
		return playedCard;
	}

	
//3.  In the constructor when a new Deck is instantiated, 
	// the cards field should be populated with hte standard 52 cards

public Deck() {
	for (int i = 0; i < 4; i++) {
		for (int j = 2; j <= 14; j++) {
			deck.add(new Card (i,j));
		}
	}
}



// Getters and Setters for getting cards from deck and setting order after shuffle

public List<Card> getCards(){
	return deck;
}
public void setCards(List<Card> deck) {
	this.deck = deck;
}

// This indicates that the deck is empty and all cards have been dealt

public Card draw() {
	if(deck.isEmpty()) {
		System.out.println("There are no more cards");
		return null;
	} else {
		Card drawnTopCard = deck.get(0);
		deck.remove(0);
		return drawnTopCard;
	}
}


	
} // End of class
