import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards = new ArrayList<Card>();

    public void deal(Card card) {
        cards.add(card);
    }

    public int getHandSize() {
        return cards.size();
    }

    public int getHandValue() {

        int value = 0;

        for (Card card : cards) {
            card.flipCard();
            value += card.getCardPointValue();
            card.flipCard();
        }

        return value;
    }
}
