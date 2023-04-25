package fr.atexo.agarnier.cards.entity.enums;

/**
 * Enumerates the possible suits of playing cards.
 * In this enumeration, priority is as following: diamonds < hearts < spades < clubs.
 */
public enum Suit {
    DIAMONDS(1), HEARTS(2), SPADES(3), CLUBS(4);

    private final int priority;

    Suit(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return this.priority;
    }
}
