package jellyfishcoder.cardgame;
import jellyfishcoder.cardgame.*;

public class CardGame {
	public static void main(String[] args) {
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println("Deck:");
		System.out.println("\tSize: " + deck.size());
		while(deck.size() > 0) {
			Card draw = deck.drawCard();
			System.out.println("Card:");
			System.out.println("\tSuite: " + draw.suite);
			System.out.println("\tValue: " + draw.value);
			System.out.println("\tColor: " + draw.getColor());
		}
		System.out.println("Deck: ");
		System.out.println("\tSize: " + deck.size());
	}
}