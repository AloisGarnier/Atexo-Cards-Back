package fr.atexo.agarnier.cards.entity;

import fr.atexo.agarnier.cards.entity.enums.Suit;
import fr.atexo.agarnier.cards.entity.enums.Value;

/**
 * Represents a playing card with a value and a suit
 */
public class Card {

    private Value value;
    private Suit suit;
    /**
     * Represent the card priority, in order to sort a hand or a deck
     */
    private int priority;

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
        this.priority = 13 * suit.getPriority() + value.getPriority();
    }
}
