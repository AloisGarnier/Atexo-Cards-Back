package fr.atexo.agarnier.cards.service.impl;

import fr.atexo.agarnier.cards.entity.Deck;
import fr.atexo.agarnier.cards.entity.Hand;
import fr.atexo.agarnier.cards.service.DrawService;
import org.springframework.stereotype.Service;

@Service
public class DrawServiceImpl implements DrawService {

    @Override
    public Hand drawCards(int cardNumber) {

        Deck deck = new Deck();
        Hand hand = new Hand();
        deck.shuffle();

        hand.addCards(deck.drawCards(cardNumber));

        return hand;
    }

    @Override
    public Hand sortHand(Hand hand) {
        return null;
    }
}
