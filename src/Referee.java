public class Referee
{
    private int whoseTurn;
    private CardPile deck, pool;
    private Player player1, player2;

    public Referee()
    {
        whoseTurn = 1;
        deck = CardPile.makeDeck(CardPile.ACE_HIGH);
        System.out.println("Made deck with "+deck.size()+" cards.");
    }

    public void dealCards()
    {


    }

    public void resetGame()
    {


    }

    public void playGame()
    {

    }
}

