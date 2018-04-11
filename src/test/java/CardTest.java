import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;
    Deck deck;


    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void getCard(){
        card = new Card(Suit.HEARTS, Rank.FIVE );
        assertEquals(Suit.HEARTS, card.whatSuit());
        assertEquals(Rank.FIVE, card.whatRank());
    }







}
