import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private String handOwner;

    public Hand(String handOwner) {
        cards = new ArrayList<Card>();
        this.handOwner = handOwner;
    }

    public void deal(Card card) {
        cards.add(card);
    }

    public int getHandSize() {
        return cards.size();
    }

    public String getHandOwner() {
        return this.handOwner;
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
