import java.util.ArrayList;
import java.util.List;
public class Game {
    private Deck deck;
    private List<Player> players;
    Game(int playersnumber){
        this.deck = new Deck();        
        players = new ArrayList<>();
        deck.display();
        System.out.println("\n***********");
        System.out.println("After Shuffling");
        System.out.println("***********\n");
        for(int i=1;i <= playersnumber; i++)
            players.add(new Player("Player "+i));
        deck.shuffle();

    }
    public void distribute(){
        int x = 52/players.size();
        for(int i=0;i <x;i++){
            for(Player player : players) {
                // Deal one card to each player in turn
                player.receiveCard(deck.getTop());
            }
        }
    }
    public void display(){
        //displaying hands
            for (Player player : players) {
                player.showHand();
                System.out.println();
            }
        }
    public static void main(String[] args) {
        Game game = new Game(5);
        game.distribute();
        game.display();
    }















}
