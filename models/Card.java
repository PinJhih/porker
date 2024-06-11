package models;

public class Card implements Comparable<Card> {
    public static enum Suit {
        SPADE, HEART, DIAMOND, CLUB, NONE
    }

    private Suit suit;
    private int face;

    public Card(Suit suit, int face) {
        this.suit = suit;
        this.face = face;
    }

    public Card() {
        this.suit = Suit.NONE;
        this.face = 0;
    }

    @Override
    public int compareTo(Card card) {
        if (this.face == card.face) {
            return Integer.compare(this.suit.ordinal(), card.suit.ordinal());
        }
        return Integer.compare(this.face, card.face);
    }

    @Override
    public String toString() {
        String str = Integer.toString(face);
        switch (suit) {
            case SPADE:
                str += "S";
                break;
            case HEART:
                str += "H";
                break;
            case DIAMOND:
                str += "D";
                break;
            case CLUB:
                str += "C";
                break;
            case NONE:
                str = "Back";
                break;
        }
        return str;
    }
}
