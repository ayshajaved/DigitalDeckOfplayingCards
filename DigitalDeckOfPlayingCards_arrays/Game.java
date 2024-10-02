import java.util.Scanner;

public class Game {
    private Deck deck = new Deck();
    String playersNames[];
    Player players[];

Game(int noOfPlayers){
    playersNames= new String[noOfPlayers];
    players = new Player[noOfPlayers];
    for(int i =0; i <noOfPlayers; i++){
        players[i]= new Player(52/noOfPlayers);
    }
}
public Deck getDeck(){
    return this.deck;
}
public void distriuteCards(){
    deck.shuffleCards();
    int cardIndex=0;
    for(int i = 0; i<players.length;i++){
        for(int j=0;j<players[i].hand.length;j++){
            players[i].hand[j]= deck.cards[cardIndex];
            deck.cards[cardIndex]= null;
            cardIndex++;
        }
    }
}
public void displayPlayerHand(){
    for(int i =0; i<players.length;i++){
        System.out.println(playersNames[i]+"'s Hand!");  
        for(Card card: players[i].hand){      
        System.out.println(card);
    }
    System.out.println();
}
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Players: ");
    int no = sc.nextInt();
    sc.nextLine();
    Game game = new Game(no);
    System.out.println("Enter "+ no +" player's names: ");
    for(int i = 0; i<no; i++){
        String name = sc.nextLine();
        game.playersNames[i]= name;
    }
    System.out.println();
    System.out.println("*************************");
    System.out.println("---Displaying Cards---");
    System.out.println("*************************");
    game.getDeck().displayCards();
    System.out.println("*************************");
    System.out.println("---Displaying Hands---");
    System.out.println("*************************");
    game.distriuteCards();
    game.displayPlayerHand();
    sc.close();
}
}
