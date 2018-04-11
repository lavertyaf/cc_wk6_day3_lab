public class Card {

    private Rank rank;
    private Suit suit;


    public Card(Suit suit, Rank rank){
        this.suit = suit;
        this.rank = rank;
    }

    public Suit whatSuit(){
        return this.suit;
    }

    public Rank whatRank(){
        return this.rank;
    }






}


