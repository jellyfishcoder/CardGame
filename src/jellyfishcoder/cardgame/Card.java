package jellyfishcoder.cardgame;

public class Card {
	public Card(Suites s, Values v) {
		suite = s;
		value = v;
	}
	public Colors getColor() {
		if (suite == Suites.HEARTS || suite == Suites.DIAMONDS) {
			return Colors.RED;
		} else {
			return Colors.BLACK;
		}
	}
	public enum Colors { RED, BLACK }
	public enum Suites { CLUBS, SPADES, DIAMONDS, HEARTS }
	public enum Values { ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, KING, QUEEN }
	public Suites suite;
	public Values value;
}