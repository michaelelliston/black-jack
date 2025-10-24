public class Card {
    private String suit;
    private String rank;
    private boolean isFaceUp;
    RuntimeException CardFacingDown = new RuntimeException("That card is face down, and can't be read!");

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        this.isFaceUp = false;
    }

    public String getCardSuit() {
        if (isFaceUp) {
            return this.suit;
        } else {
            throw CardFacingDown;
        }
    }

    public String getCardRank() {
        if (isFaceUp) {
            return this.rank;
        } else {
            throw CardFacingDown;
        }
    }

    public int getCardPointValue() {
        if (isFaceUp) {
            String value = this.getCardRank();
            return switch (value) {
                case "2" -> 2;
                case "3" -> 3;
                case "4" -> 4;
                case "5" -> 5;
                case "6" -> 6;
                case "7" -> 7;
                case "8" -> 8;
                case "9" -> 9;
                case "J", "K", "Q", "10" -> 10;
                case "A" -> 11;
                default -> -1;
            };
        } else {
            throw CardFacingDown;
        }
    }

    public boolean isCardFaceUp() {
        return this.isFaceUp;
    }

    public void flipCard() {
        this.isFaceUp = !this.isFaceUp;
    }
}
