public class Referee
{
    private int whoseTurn;
    private CardPile deck, pool;
    private Player player1, player2;

    public Referee(Player p1, Player p2)
    {
        whoseTurn = 1;
        deck = CardPile.makeDeck(CardPile.ACE_HIGH);
        System.out.println("Made deck with "+deck.size()+" cards.");
        player1 = p1;
        player2 = p2;
    }

    /**
     * Gives 26 cards to each player.
     */
    public void dealCards()
    {


    }

    /**
     * Create a new deck of 52 cards;
     * remove all the cards from the players; empty the pool
     */
    public void resetGame()
    {


    }

    /**
     * runs the game loop, asking players for cards, comparing them,
     * and giving cards back to the victors until the game is over.
     */
    public void playGame()
    {

    }
}

