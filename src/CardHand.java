public class CardHand {
    private static int totalInHand;
    public static final int Fingers = 4;
    static PositionalList<Card> cardsInHand = new LinkedPositionalList<Card>();
    public boolean ifEmpty() {
        return this.cardsInHand.isEmpty();
    }

    public static void addCard(String rank, String suit){

        Card card = new Card(rank,suit);
        CardHand.cardsInHand.addFirst(card);
        CardHand.totalInHand += 1;
        //add a new card with rank r and suit s to the hand.
    }
    public void play(String s) {
        //remove and return a card of suit s from the player’s hand; if there is
        //no card of suit s, then remove and return an arbitrary card from the hand.
    }
    public int iterator(){
        //return an iterator for all cards currently in the hand.
        return this.totalInHand;
    }
    public int suitIterator(String suit){
        int iterator = Card.getSuitSize(suit);
       return iterator ;
    }
    public int getTotalInHand() {
        return 1 ;
    }
}


