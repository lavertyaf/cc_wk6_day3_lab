import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {


        Deck deck;

        @Before
        public void before(){
            deck = new Deck();
        }

//        @Test
//        public void deckHasCards(){
//            assertEquals(52, deck.howManyCardsInADeck());
//        }

        @Test
        public void numberOfCardsAfterPopulation(){
            deck.populateDeck();
            assertEquals(52, deck.howManyCardsInADeck());
        }

        @Test
        public void canRemoveCard(){
            deck.populateDeck();
            Card theCardIRemoved = deck.removeCard();
            assertEquals(51, deck.howManyCardsInADeck());
            assertEquals( Rank.ACE, theCardIRemoved.whatRank());
        }


    }
