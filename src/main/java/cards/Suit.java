package cards;

public enum Suit {

    CLUBS       ('♣'),
    DIAMONDS    ('♦'),
    HEARTS      ('♥'),
    SPADES      ('♠');

    private final char symbol;

    private Suit(char symbol) {
        this.symbol = symbol;
    }

    public static Suit fromSymbol(char symbol) {
        for (Suit suit : values()) {
            if (suit.symbol == symbol) {
                return suit;
            }
        }

        throw new IllegalArgumentException(symbol + " doesn't exist.");
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }
}
