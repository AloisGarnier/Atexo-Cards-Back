package fr.atexo.agarnier.cards.entity;

import fr.atexo.agarnier.cards.entity.enums.Suit;
import fr.atexo.agarnier.cards.entity.enums.Value;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeckTest {

    private Deck deck;

    @BeforeEach
    public void init() throws Exception {
        deck = new Deck();
    }

    @AfterEach
    public void clean() throws Exception {
        deck = null;
    }

    @Test
    public void deckGeneration() {
        Card card = new Card(Value.EIGHT, Suit.SPADES);
        assertEquals(card.getValue(), deck.getCards().get(card.getPriority()-1).getValue());
        assertEquals(card.getSuit(), deck.getCards().get(card.getPriority()-1).getSuit());
    }

    @Test
    public void shuffle() {
        Card card = deck.getCards().get(22);
        deck.shuffle();
        assertTrue(deck.getCards().contains(card));
    }

}
