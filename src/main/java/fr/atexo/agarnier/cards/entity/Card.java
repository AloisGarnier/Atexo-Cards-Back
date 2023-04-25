package fr.atexo.agarnier.cards.entity;

import fr.atexo.agarnier.cards.entity.enums.Suit;
import fr.atexo.agarnier.cards.entity.enums.Value;

/**
 * Represents a playing card with a value and a suit
 */
public class Card {

    private final Value value;
    private final Suit suit;
    /**
     * Represents the card priority, in order to sort a hand or a deck
     */
    private final int priority;

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
        this.priority = 13 * (suit.getPriority()-1) + value.getPriority();
    }

    /// Getters ///
    public Value getValue() {
        return value;
    }
    public Suit getSuit() {
        return suit;
    }
    public int getPriority() {
        return priority;
    }
}
