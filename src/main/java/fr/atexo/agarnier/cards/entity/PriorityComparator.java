package fr.atexo.agarnier.cards.entity;

import java.util.Comparator;

/**
 * Eases the comparison between cards in order to sort them.
 */
public class PriorityComparator implements Comparator<Card> {

    /**
     * Compares two cards according to their priority
     * @param c1 the first card to be compared.
     * @param c2 the second card to be compared.
     * @return -1 if c1 < c2, 0 if c1 = c2 or 1 if c1 > c2
     */
    @Override
    public int compare(Card c1, Card c2) {
        return Integer.compare(c1.getPriority(), c2.getPriority());
    }
}
