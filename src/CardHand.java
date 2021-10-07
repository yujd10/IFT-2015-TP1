import java.util.ArrayList;

public class CardHand {
    private int totalInHand;
    public ArrayList<Card> deck = new ArrayList<>();
    

    PositionalList<Card> cardsInHand = new LinkedPositionalList<>();
    public boolean ifEmpty() {
        return this.cardsInHand.isEmpty();
    }
    public int getTotalInHand() {return this.cardsInHand.size();}

    public  void createDeck(){

        for (int i = 0; i <Card.Suit.length ; i++){
            for (int j = 0; j < Card.Rank.length ; j++){
                deck.add(new Card(Card.Rank[j],Card.Suit[i]));
            }
        }
    }

    public void addCard(String r, String s) {
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getRank() == r && deck.get(i).getSuit() == s) {
                this.cardsInHand.addFirst(deck.get(i));
                deck.remove(deck.get(i));
                System.out.println("Created");
            }
        }
    }

    public void play(String s) {
        //emove and return a card of suit s from the player’s hand; if there is
        //no card of suit s, then remove and return an arbitrary card from the hand.

    }
    public void iterator(){
//        int i=0;
//        Iterator<Card> it = this.cardsInHand.iterator();
//        //return an iterator for all cards currently in the hand.
//        while(it.hasNext())
//        if(i<=100) {
//            {
//                i += 1;
//                System.out.println(i);
//            }
////        return this.totalInHand;
//        }
//        System.out.println("fini");
    }
    public int suitIterator(String suit){
       return 1 ;
    }

//    public void removeCard(String r,String s)
}


