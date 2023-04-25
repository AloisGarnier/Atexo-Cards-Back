package fr.atexo.agarnier.cards.entity.enums;

/**
 * Enumerates the possible values of playing cards.
 * In this enumeration, Aces have the lowest priority and Kings the highest one.
 */
public enum Value {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5),
    SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
    JACK(11), QUEEN(12), KING(13);

    private final int priority;

    Value(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return this.priority;
    }
}
