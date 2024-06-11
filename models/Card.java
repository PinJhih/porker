package models;

public class Card implements Comparable<Card> {
    public static enum Suit {
        SPADE, HEART, DIAMOND, CLUB, NONE
    }

    private Suit suit;
    private int face;

    public Card() {
        this.suit = Suit.NONE;
        this.face = 0;
    }

    public Card(Suit suit, int face) {
        this.suit = suit;
        this.face = face;
    }

    public Card(String str) {
        int n = str.length();
        String num = str.substring(0, str.length() - 1);
        this.face = Integer.parseInt(num);

        switch (str.charAt(n - 1)) {
            case 'S':
                this.suit = Suit.SPADE;
                break;
            case 'H':
                this.suit = Suit.HEART;
                break;
            case 'D':
                this.suit = Suit.DIAMOND;
                break;
            case 'C':
                this.suit = Suit.CLUB;
                break;
        }
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
