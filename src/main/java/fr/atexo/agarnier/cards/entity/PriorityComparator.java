package fr.atexo.agarnier.cards.entity;

import java.util.Comparator;

/**
 * Ease the comparison between cards in order to sort them.
 */
public class PriorityComparator implements Comparator<Card> {

    @Override
    public int compare(Card c1, Card c2) {
        return Integer.compare(c1.getPriority(), c2.getPriority());
    }
}
