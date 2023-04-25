package fr.atexo.agarnier.cards.service.impl;

import fr.atexo.agarnier.cards.entity.Deck;
import fr.atexo.agarnier.cards.entity.Hand;
import fr.atexo.agarnier.cards.entity.PriorityComparator;
import fr.atexo.agarnier.cards.service.DrawService;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class DrawServiceImpl implements DrawService {

    /**
     * Draw a given number of cards from a shuffled deck to an empty hand.
     * @param cardNumber number of cards to be drawn.
     * @return the drawn hand.
     */
    @Override
    public Hand drawCards(int cardNumber) {

        Deck deck = new Deck();
        Hand hand = new Hand();
        deck.shuffle();

        hand.addCards(deck.drawCards(cardNumber));

        return hand;
    }

    /**
     * Sorts a given hand according to the priority of the cards
     * @param hand the hand to be sorted.
     * @return the sorted hand.
     */
    @Override
    public Hand sortHand(Hand hand) {

        Collections.sort(hand.getCards(), new PriorityComparator());

        return hand;
    }
}
