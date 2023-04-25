package fr.atexo.agarnier.cards.service;

import fr.atexo.agarnier.cards.entity.Hand;

public interface DrawService {

    Hand drawCards(int cardNumber);
    Hand sortHand(Hand hand);

}
