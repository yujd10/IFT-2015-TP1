import java.util.Iterator;

public class CardHand {
    private int totalInHand;
    public static final int Fingers = 4;
    PositionalList<Card> cardsInHand = new LinkedPositionalList<Card>();
    public boolean ifEmpty() {
        return this.cardsInHand.isEmpty();
    }

    public void addCard(String rank, String suit){

        Card card = new Card(rank,suit);
        this.cardsInHand.addFirst(card);
        this.totalInHand += 1;
        //add a new card with rank r and suit s to the hand.
    }

    public void play(String s) {
        //emove and return a card of suit s from the player’s hand; if there is
        //no card of suit s, then remove and return an arbitrary card from the hand.
    }
    public void iterator(){
        int i=0;
        Iterator<Card> it = this.cardsInHand.iterator();
        //return an iterator for all cards currently in the hand.
        while(it.hasNext())
        if(i<=100) {
            {
                i += 1;
                System.out.println(i);
            }
//        return this.totalInHand;
        }
        System.out.println("fini");
    }
    public int suitIterator(String suit){
       return 1 ;
    }
    public int getTotalInHand() {
        return 1 ;
    }
}


