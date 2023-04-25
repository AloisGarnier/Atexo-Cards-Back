package fr.atexo.agarnier.cards.entity;

import fr.atexo.agarnier.cards.entity.enums.Suit;
import fr.atexo.agarnier.cards.entity.enums.Value;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PriorityComparatorTest {

    private PriorityComparator comp;

    @BeforeEach
    public void init() throws Exception {
        comp = new PriorityComparator();
    }

    @AfterEach
    public void clean() throws Exception {
        comp = null;
    }

    @Test
    public void compare() {
        Card c1 = new Card(Value.JACK, Suit.CLUBS);
        Card c2 = new Card(Value.QUEEN, Suit.HEARTS);
        assertEquals(1, comp.compare(c1, c2));
    }
}
