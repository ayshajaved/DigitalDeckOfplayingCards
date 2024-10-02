public class Card{
    private String suit;
    private String rank;
Card(String rank, String suit){
    this.rank = rank;
    this.suit = suit;
}
public String getRank(){
    return this.rank;
}
public String getSuit(){
    return this.suit;
}
public void setRank(String r){
    this.rank = r;
}
public void setSuit(String s){
    this.suit = s;
}
public String toString(){
    return suit+" of "+rank;
}
}