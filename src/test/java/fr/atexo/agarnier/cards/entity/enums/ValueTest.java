package fr.atexo.agarnier.cards.entity.enums;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValueTest {

    private Value value;

    @BeforeEach
    public void init() throws Exception {
        value = Value.JACK;
    }

    @AfterEach
    public void clean() throws Exception {
        value = null;
    }

    @Test
    public void getPriority() {
        assertEquals(11, value.getPriority());
    }
}
