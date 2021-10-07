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
//    public void removeCard(String r,String s){
//        Position<Card> p = this.
//            }
//        }
//    }
    public void addCard(String r, String s) {
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getRank() == r && deck.get(i).getSuit() == s) {
                if (deck.get(i).getSuit() == "Heart") {
                    if (fingerHeart == null) {
                        cardsInHand.addLast(deck.get(i));
                        fingerHeart = cardsInHand.last();
                        deck.remove(i);
                    } else {
                        cardsInHand.addBefore(fingerHeart, deck.get(i));
                        deck.remove(i);
                    }
                } else if (deck.get(i).getSuit() == "Club") {
                    if (fingerClub == null) {
                        cardsInHand.addLast(deck.get(i));
                        fingerClub = cardsInHand.last();
                        deck.remove(i);
                    } else {
                        cardsInHand.addBefore(fingerClub, deck.get(i));
                        deck.remove(i);
                    }
                } else if (deck.get(i).getSuit() == "Spade") {
                    if (fingerSpade == null) {
                        cardsInHand.addLast(deck.get(i));
                        fingerSpade = cardsInHand.last();
                        deck.remove(i);
                    } else {
                        cardsInHand.addBefore(fingerSpade, deck.get(i));
                        deck.remove(i);
                    }
                } else {
                    if (fingerDiamond == null) {
                        cardsInHand.addLast(deck.get(i));
                        fingerDiamond = cardsInHand.last();
                        deck.remove(i);
                    } else {
                        cardsInHand.addBefore(fingerDiamond, deck.get(i));
                        deck.remove(i);
                    }
                }
            }
        }
    }

    public void randomCard(Position <Card> finger,Card cardPlayed){
        if(ifFingerEmpty(finger)){
            int i = 0;
            int item = new Random().nextInt(this.cardsInHand.size());
            for (Card card : cardsInHand){
                if(i == item){
                    cardPlayed.setRank(card.getRank());
                    cardPlayed.setSuit(card.getSuit());
                }i++;
            }
        }else {
            cardPlayed.setSuit(cardsInHand.before(finger).getElement().getSuit());
            cardPlayed.setRank(cardsInHand.before(finger).getElement().getRank());
        }
    }

    public Card Play(String s){
           Card cardPlayed=new Card(null,null);
            switch (s){
                case "Heart":
                    randomCard(fingerHeart,cardPlayed);
                    break;
                case "Club":
                    randomCard(fingerClub,cardPlayed);
                    break;
                case "Spade":
                    randomCard(fingerSpade,cardPlayed);
                    break;
                case "Diamond":
                    randomCard(fingerDiamond,cardPlayed);
                    break;
            }
           return cardPlayed;
    }
    public boolean ifFingerEmpty(Position<Card> finger){
        boolean value=false;
        if(finger==null){
            value = true;
        }
        return value;
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

}

//    public void subAddCard(Position<Card> finger,Card card){
//        if (finger == null) {
//            cardsInHand.addLast(card);
//            finger = cardsInHand.last();
//
//        } else {
//            cardsInHand.addBefore(finger, card);
//        }
//    }

