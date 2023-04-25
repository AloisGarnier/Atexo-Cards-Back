package fr.atexo.agarnier.cards.entity;

import fr.atexo.agarnier.cards.entity.enums.Suit;
import fr.atexo.agarnier.cards.entity.enums.Value;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HandTest {

    private Hand hand;

    @BeforeEach
    public void init() throws Exception {
        hand = new Hand();
    }

    @AfterEach
    public void clean() throws Exception {
        hand = null;
    }

    @Test
    public void addCards() {
        Card firstCard = new Card(Value.EIGHT, Suit.DIAMONDS);
        Card secondCard = new Card(Value.KING, Suit.SPADES);
        List<Card> cards = new ArrayList<>();
        cards.add(firstCard);
        cards.add(secondCard);

        hand.addCards(cards);
        assertEquals(cards, hand.getCards());
    }
}
