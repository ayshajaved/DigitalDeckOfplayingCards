import java.util.Random;

public class Deck {
    static final String suits[]={"Hearts", "Diamonds","Spades","Clubs"};
    static final String ranks[] ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","king"};
    Card[]cards;
    {
        cards = new Card[52];
    }
    Deck(){
        int i = 0;
        for(String suit: suits){    
            for(String rank:ranks){
                cards[i++]= new Card(rank, suit);
            }
        }
    }
    public void shuffleCards(){
        Random rand = new Random();
        for(int i = 0; i<5000;i++){
        int r = rand.nextInt(52);
        Card temp = cards[r];
        cards[r]= cards[0];
        cards[0]= temp;
        }
    }
    public void displayCards(){
        for(Card card: cards){
            System.out.println(card);
        }
    }







}
