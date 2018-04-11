    import java.util.ArrayList;

    public class Deck {

        private ArrayList<Card> cards;


        public Deck(){
            this.cards = new ArrayList<>();
        }

        public void populateDeck(){

            for (Suit aSuit : Suit.values()) {

                for (Rank aRank : Rank.values()) {
                    Card myCard = new Card(aSuit, aRank);
                    cards.add(myCard);
            }

        }
        }

        public int howManyCardsInADeck(){
            return this.cards.size();
        }

        public Card removeCard(){
            return this.cards.remove(0);
        }
    }

