import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class CardHand {
    private int totalInHand;
    public ArrayList<Card> deck ;
    PositionalList<Card> cardsInHand;
    Position<Card> fingerHeart;
    Position<Card> fingerClub;
    Position<Card> fingerSpade;
    Position<Card> fingerDiamond;

    public CardHand() {
        cardsInHand = new LinkedPositionalList<Card>();
        deck = new ArrayList<>();
    }

    //public boolean ifEmpty() { return this.cardsInHand.isEmpty(); }

    //public int getTotalInHand() {return this.cardsInHand.size();}

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
    public Card addCard(String r, String s) {
        Card cardAdded=new Card(null,null);
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getRank() == r && deck.get(i).getSuit() == s) {
                if (deck.get(i).getSuit() == "Heart") {
                    if (fingerHeart == null) {
                        cardAdded = deck.get(i);
                        cardsInHand.addLast(deck.get(i));
                        fingerHeart = cardsInHand.last();
                        deck.remove(i);
                    } else {
                        cardAdded = deck.get(i);
                        cardsInHand.addBefore(fingerHeart, deck.get(i));
                        deck.remove(i);
                    }
                } else if (deck.get(i).getSuit() == "Club") {
                    if (fingerClub == null) {
                        cardAdded = deck.get(i);
                        cardsInHand.addLast(deck.get(i));
                        fingerClub = cardsInHand.last();
                        deck.remove(i);
                    } else {
                        cardAdded = deck.get(i);
                        cardsInHand.addBefore(fingerClub, deck.get(i));
                        deck.remove(i);
                    }
                } else if (deck.get(i).getSuit() == "Spade") {
                    if (fingerSpade == null) {
                        cardAdded = deck.get(i);
                        cardsInHand.addLast(deck.get(i));
                        fingerSpade = cardsInHand.last();
                        deck.remove(i);
                    } else {
                        cardAdded = deck.get(i);
                        cardsInHand.addBefore(fingerSpade, deck.get(i));
                        deck.remove(i);
                    }
                } else {
                    if (fingerDiamond == null) {
                        cardAdded = deck.get(i);
                        cardsInHand.addLast(deck.get(i));
                        fingerDiamond = cardsInHand.last();
                        deck.remove(i);
                    } else {
                        cardAdded = deck.get(i);
                        cardsInHand.addBefore(fingerDiamond, deck.get(i));
                        deck.remove(i);
                    }
                }
            }
        }
        return cardAdded;
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

//    public Position<Card> findPosition (Card card){
//        Position<Card> walk =this.cardsInHand.first();
//        while (walk != null && walk != card){
//            Position<Card> w = this.cardsInHand.after(walk);
//            walk = w;
//        }
//        return walk;
//    }

    public Iterator<Card> iterator(){
        Iterator<Card> it = cardsInHand.iterator();
        return it;
    }

    public Iterator<Card> suitIterator(String suit){
        Iterator<Card> itSuit;
        PositionalList<Card> cardOfSuit = new LinkedPositionalList<>();
        for(Card card : cardsInHand){
            if(card.getSuit()==suit){
                cardOfSuit.addFirst(card);
                }
            }
        itSuit=cardOfSuit.iterator();
        return itSuit;
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

