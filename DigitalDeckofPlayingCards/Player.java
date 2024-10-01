import java.util.ArrayList;
import java.util.List;
public class Player {
    private List<Card> hand;
    private String name;
    Player(String name){
    this.hand = new ArrayList<>();  // Initialize the player's hand list
    this.name = name;
    }
    // Add a card to player's hand
    public void receiveCard(Card card) {
        hand.add(card);
    }

    // Display all cards in player's hand
    public void showHand() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            System.out.println(card);
        }
    }
    // Get player name
    public String getName() {
        return name;
    }
}


