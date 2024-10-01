public class Card{
    private String rank;
    private String suit;

    public Card(String rank ,String suit){
        this.suit= suit;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
    @Override
    public String toString(){
        return rank+" of "+suit;
    }
   













}