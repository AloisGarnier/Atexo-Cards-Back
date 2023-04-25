package fr.atexo.agarnier.cards.entity.enums;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuitTest {

    private Suit suit;

    @BeforeEach
    public void init() throws Exception {
        suit = Suit.HEARTS;
    }

    @AfterEach
    public void clean() throws Exception {
        suit = null;
    }

    @Test
    public void getPriority() {
        assertEquals(2, suit.getPriority());
    }
}
