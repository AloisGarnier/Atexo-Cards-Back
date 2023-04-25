package fr.atexo.agarnier.cards.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a player's hand.
 */
public class Hand {

    private List<Card> cards = new ArrayList<>();

    /**
     * Adds new cards to the hand.
     * @param newCards new cards.
     */
    public void addCards(List<Card> newCards) {
        cards.addAll(newCards);
    }

    /// Getter ///
    public List<Card> getCards() {
        return cards;
    }

    /// Setter ///
    public void setCards(List<Card> cards) {
        this.cards = cards;
    }
}
