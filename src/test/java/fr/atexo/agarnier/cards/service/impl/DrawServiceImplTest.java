package fr.atexo.agarnier.cards.service.impl;

import fr.atexo.agarnier.cards.entity.Hand;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrawServiceImplTest {

    DrawServiceImpl drawService;

    @BeforeEach
    public void init() throws Exception {
        drawService = new DrawServiceImpl();
    }

    @AfterEach
    public void clean() throws Exception {
        drawService = null;
    }

    @Test
    public void drawCards() {
        Hand hand = drawService.drawCards(4);
        assertEquals(4, hand.getCards().size());
    }
}
