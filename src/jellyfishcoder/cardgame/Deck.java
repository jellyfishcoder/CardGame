package jellyfishcoder.cardgame;
import java.util.*;

public class Deck {
	public Deck() {
		cards = new ArrayList<Card>();
		cards.clear();
		for(Card.Suites i : Card.Suites.values()) {
			for(Card.Values j : Card.Values.values()) {
				cards.add(new Card(i, j));
			}
		}
	}
	public Deck(ArrayList<Card> c) {
		cards = c;
	}

	// Functions
	public Card drawCard() {
		return cards.remove((int) (cards.size() - 1));
	}
	public void insertCard(Card card) {
		cards.add(card);
	}
	public int size() {
		return cards.size();
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	// Variables
	private ArrayList<Card> cards;
}