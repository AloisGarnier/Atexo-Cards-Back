package fr.atexo.agarnier.cards.entity;

import fr.atexo.agarnier.cards.entity.enums.Suit;
import fr.atexo.agarnier.cards.entity.enums.Value;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardTest {

    private Card card;

    @BeforeEach
    public void init() throws Exception {
        card = new Card(Value.QUEEN, Suit.HEARTS);
    }

    @AfterEach
    public void clean() throws Exception {
        card = null;
    }
}
