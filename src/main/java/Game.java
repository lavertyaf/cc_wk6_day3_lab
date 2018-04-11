public class Game {

    private Deck deck;
    private Player player1;
    private Player player2;

    public Game(){
        this.deck = deck;
        this.player1 = player1;
        this.player2 = player2;
        playGame();

    }

    private void playGame(){
        this.deck.populateDeck();
        player1.addACard(deck.removeCard());
        player2.addACard(deck.removeCard());
        checkForWinner();
    }


    private Player checkForWinner(){
        if (player1.getTotalHandValue() > player2.getTotalHandValue() ){
            return player1;

        }
        else {
            return player2;
        }
    }


}
