import java.util.ArrayList;
import java.util.Random;

public class CardHand {
    private int totalInHand;
    public ArrayList<Card> deck ;//= new ArrayList<>();
    PositionalList<Card> cardsInHand; //=new LinkedPositionalList<>();
    Position<Card> fingerHeart;
    Position<Card> fingerClub;
    Position<Card> fingerSpade;
    Position<Card> fingerDiamond;

    public CardHand() {
        cardsInHand = new LinkedPositionalList<>();
        deck = new ArrayList<>();
        cardsInHand.addFirst(new Card(null, null));
        fingerHeart = cardsInHand.first();
        cardsInHand.addLast(new Card(null, null));
        fingerClub = cardsInHand.last();
        cardsInHand.addLast(new Card(null, null));
        fingerSpade = cardsInHand.last();
        cardsInHand.addLast(new Card(null, null));
        fingerDiamond = cardsInHand.last();
    }

    public boolean ifEmpty() { return this.cardsInHand.isEmpty(); }

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
                if(deck.get(i).getSuit() == "Heart") {
                    this.cardsInHand.addAfter(fingerHeart,deck.get(i));
                    deck.remove(deck.get(i));

                    //System.out.println("Created");
                }else if (deck.get(i).getSuit() == "Club"){
                    this.cardsInHand.addAfter(fingerClub,deck.get(i));
                    deck.remove(deck.get(i));

                    //System.out.println("Created");
                }else if (deck.get(i).getSuit() == "Spade"){
                    this.cardsInHand.addAfter(fingerSpade,deck.get(i));
                    deck.remove(deck.get(i));

                    //System.out.println("Created");
                }else{
                    this.cardsInHand.addAfter(fingerDiamond,deck.get(i));
                    deck.remove(deck.get(i));

                    //System.out.println("Created");
                }
            }
        }
    }

//    Card Result;
//    public Card randomCard(Position<Card> finger,String s){
//
//        if(this.cardsInHand.after(finger).getElement().getRank() != null){
//            int i =0;
//            for (Card card:this.cardsInHand){
//                if(i == new Random().nextInt(getTotalInHand())&&card.getSuit()==s){
//                    i++;
//                    Result = card;
//                }
//            }
//        }else{
//            int i =0;
//            for (Card card:this.cardsInHand){
//                if(i == new Random().nextInt(getTotalInHand())&&card.getRank()!=null){
//                    ++i;
//                    Result=card;
//                }
//            }
//        }
//        return Result;
//    }

//    public Card play(String s) {
//        switch (s){
//            case "Heart":
//                randomCard(fingerHeart,s);
//                break;
//            case "Club":
//                randomCard(fingerClub,s);
//            case "Spade":
//                randomCard(fingerSpade,s);
//            case "Diamond":
//                randomCard(fingerDiamond,s);
//        }
//    }
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


