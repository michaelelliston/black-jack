import java.util.Scanner;

public class BlackJack {

    public static void main(String[] args) {

        Deck deck = new Deck();

        Scanner myScanner = new Scanner(System.in);

        Deck.shuffleDeck();

        System.out.print("\nPlease enter your name: ");
        String playerName = myScanner.nextLine().trim();

        Hand playerOne = new Hand(playerName);

        System.out.print("\nPlease enter your opponent's name: ");
        String opponentName = myScanner.nextLine().trim();

        Hand playerTwo = new Hand(opponentName);

        System.out.println("Dealing cards...");

        for (int i = 0; i < 2; i++) {
            Card card = deck.dealFromDeck();
            playerOne.deal(card);
            card = deck.dealFromDeck();
            playerTwo.deal(card);
        }


        System.out.println(playerOne.getHandOwner() + "'s hand is worth: " + playerOne.getHandValue());
        System.out.println(playerTwo.getHandOwner() + "'s hand is worth: " + playerTwo.getHandValue());

        Card card = deck.dealFromDeck();
        playerOne.deal(card);
        card = deck.dealFromDeck();
        playerTwo.deal(card);

        System.out.println("Now, " + playerOne.getHandOwner() + "'s hand is worth: " + playerOne.getHandValue());
        System.out.println("Now, " + playerTwo.getHandOwner() + "'s hand is worth: " + playerTwo.getHandValue());
    }
}
