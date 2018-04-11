import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {


    Player player;
    Card card1;
    Card card2;

    @Before
    public void before(){
        player = new Player("Seb");
        card1 = new Card(Suit.HEARTS, Rank.EIGHT);
        card2 = new Card(Suit.SPADES, Rank.QUEEN);
    }

    @Test
    public void handIsEmptyAtStart(){
        assertEquals(0, player.howManyCardsInHand());
    }

    @Test
    public void canReceiveACard(){
        player.addACard(card1);
        assertEquals(1, player.howManyCardsInHand());
    }

    @Test
    public void getTotalHandValue(){
        player.addACard(card1);
        player.addACard(card2);
        assertEquals(20, player.getTotalHandValue());
    }


}
