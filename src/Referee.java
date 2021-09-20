public class Referee
{
    private int whoseTurn;
    private CardPile deck;
    private Player player1, player2;

    public Referee()
    {
        whoseTurn = 1;
        deck = CardPile.makeDeck(CardPile.ACE_HIGH);
        System.out.println("Made deck with "+deck.size()+" cards.");
    }
}

