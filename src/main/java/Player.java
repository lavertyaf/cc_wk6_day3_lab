import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name){
        this.hand = new ArrayList<>();
    }

    public int howManyCardsInHand(){
       return this.hand.size();
    }

    public void addACard(Card card){
        this.hand.add(card);
    }

    public int getTotalHandValue(){
       int total = 0;
       for (Card card: hand){
           total += card.whatRank().getValue();
       }
       return total;
    }

}
