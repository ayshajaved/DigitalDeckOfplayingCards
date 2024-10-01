import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Deck{
//stack of cards
    private List<Card> cards;
    public Deck(){
        cards = new ArrayList<>();
        String suits[]={"Hearts", "Diamonds", "Clubs", "Spades"};
        String ranks[]={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        //initializing cards with ranks and suits
        for(String suit:suits){
            for(String rank: ranks){
                cards.add(new Card(suit, rank));
            }
        }
    }
    public void shuffle(){
        Collections.shuffle(cards);
    }
    public void display(){
        for(Card card:cards){
            System.out.println(card);
        }
    }
    public Card getTop(){
        return cards.remove(cards.size()-1);
    }











}
