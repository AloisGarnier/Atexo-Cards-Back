package fr.atexo.agarnier.cards.entity;

import fr.atexo.agarnier.cards.entity.enums.Suit;
import fr.atexo.agarnier.cards.entity.enums.Value;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a standard 52-card deck, where cards may be drawn from.
 */
public class Deck {

    private List<Card> cards = new ArrayList<>();

    /**
     * Creates a full deck with all values of all suits.
     */
    public Deck() {
        for (Suit s : Suit.values()) {
            for (Value v : Value.values()) {
                cards.add(new Card(v, s));
            }
        }
    }

    /**
     * Shuffles the deck.
     */
    public void shuffle() {
        List<Card> shuffledCards = new ArrayList<>();

        while (cards.size() > 0) {
            int index = (int) (Math.random() * cards.size());
            shuffledCards.add(cards.remove(index));
        }

        cards = shuffledCards;
    }

    /**
     * Draw the first card of the deck.
     * @param cardNumber number of cards to draw.
     * @return the drawn card.
     */
    public List<Card> draw(int cardNumber) {
        return null;
    }

    public List<Card> getCards() {
        return cards;
    }
}
