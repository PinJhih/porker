package models;

import java.util.*;

public class Player {
    private String name;
    private int chips;
    private Deck hand;
    private int currentBet;
    private boolean active;

    public Player(String name, int chips) {
        Card[] cards = {
                new Card(), new Card()
        };

        this.name = name;
        this.chips = chips;
        this.hand = new Deck(cards);
        this.currentBet = 0;
        this.active = true;
    }

    public String getName() {
        return name;
    }

    public int getChips() {
        return chips;
    }

    public Deck getHand() {
        return hand;
    }

    public int getCurrentBet() {
        return currentBet;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void placeBet(int amount) {
        currentBet += amount;
        chips -= amount;
    }

    public void resetBet() {
        currentBet = 0;
    }

    public void receiveCard(Card card) {
        hand.add(card);
    }

    public void receiveChips(int amount) {
        chips += amount;
    }

    public void setName(String name) {
        this.name = name;
        this.chips = 10000;
    }
}
