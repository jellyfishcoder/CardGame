package jellyfishcoder.cardgame;

public class Card {
	public Card(Suites s, Values v) {
		suite = s;
		value = v;
	}
	public enum Suites { CLUBS, SPADES, DIAMONDS, HEARTS };
	public enum Values { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, KING, QUEEN };
	public Suites suite;
	public Values value;
}