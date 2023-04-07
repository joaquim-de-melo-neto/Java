package poker;

import java.util.Comparator;

public class CardComparator implements Comparator<Card> {
    private final String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                                     "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };

    @Override
    public int compare(Card card1, Card card2) {
        int index1 = getIndex(card1.getFace());
        int index2 = getIndex(card2.getFace());
        return Integer.compare(index1, index2);
    }

    private int getIndex(String face) {
        for (int i = 0; i < faces.length; i++) {
            if (faces[i].equals(face)) {
                return i;
            }
        }
        return -1;
    }
}

