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
        cardsInHand = new LinkedPositionalList<>();
        deck = new ArrayList<>();
        //cardsInHand.addFirst(new Card(null,null));
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

    public Card addCard(String r, String s) {
        Card cardAdded=new Card(null,null);
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getRank() == r && deck.get(i).getSuit() == s) {
                if (deck.get(i).getSuit() == "Heart") {
                    if (fingerHeart == null) {
                        cardAdded = deck.get(i);
                        cardsInHand.addLast(new Card(null,null));
                        fingerHeart = cardsInHand.last();
                        cardsInHand.addBefore(fingerHeart,cardAdded);
                        deck.remove(i);
                    } else {
                        cardAdded = deck.get(i);
                        cardsInHand.addBefore(fingerHeart, cardAdded);
                        deck.remove(i);
                    }
                } else if (deck.get(i).getSuit() == "Club") {
                    if (fingerClub == null) {
                        cardAdded = deck.get(i);
                        cardsInHand.addLast(new Card(null,null));
                        fingerClub = cardsInHand.last();
                        cardsInHand.addBefore(fingerClub,cardAdded);
                        deck.remove(i);
                    } else {
                        cardAdded = deck.get(i);
                        cardsInHand.addBefore(fingerClub, cardAdded);
                        deck.remove(i);
                    }
                } else if (deck.get(i).getSuit() == "Spade") {
                    if (fingerSpade == null) {
                        cardAdded = deck.get(i);
                        cardsInHand.addLast(new Card(null,null));
                        fingerSpade = cardsInHand.last();
                        cardsInHand.addBefore(fingerSpade,cardAdded);

                        deck.remove(i);
                    } else {
                        cardAdded = deck.get(i);
                        cardsInHand.addBefore(fingerSpade, cardAdded);
                        deck.remove(i);
                    }
                } else {
                    if (fingerDiamond == null) {
                        cardAdded = deck.get(i);
                        cardsInHand.addLast(new Card(null,null));
                        fingerDiamond =cardsInHand.last();
                        cardsInHand.addBefore(fingerDiamond,cardAdded);
                        deck.remove(i);
                    } else {
                        cardAdded = deck.get(i);
                        cardsInHand.addBefore(fingerDiamond, cardAdded);
                        deck.remove(i);
                    }
                }
            }
        }
        return cardAdded;
    }



    public Card Play(String s){
           Card cardPlayed=null;
           Iterator<Card> it = this.iterator();
           Iterator<Card> itSuit = this.suitIterator(s);

            switch (s){
                case "Heart":
                    cardPlayed = playRandomCard(fingerHeart,"Heart");

                    break;
                case "Club":
                    cardPlayed = playRandomCard(fingerClub,"Club");
                    break;
                case "Spade":
                    cardPlayed = playRandomCard(fingerSpade,"Spade");
                    break;
                case "Diamond":
                    cardPlayed = playRandomCard(fingerDiamond,"Diamond");
                    break;
            }
           return cardPlayed;
    }
    public boolean ifFingerEmpty(Position<Card> finger){
        boolean value=false;
        if(finger == null||cardsInHand.before(finger).getElement().getRank()==null  ){
            value = true;
        }
        return value;
    }

    public Position<Card> findPosition (Card card){
        Position<Card> walk = cardsInHand.last();
        while (walk != null && cardsInHand.before(walk).getElement() != card ){
            walk = this.cardsInHand.before(walk);
        }
        return cardsInHand.before(walk);
    }

    public Iterator<Card> iterator(){
        Iterator<Card> it = cardsInHand.iterator();
        PositionalList<Card> nonEmpty = new LinkedPositionalList<>();
        for(Card card : cardsInHand){
            if(card.getSuit()!=null ){
                nonEmpty.addFirst(card);
            }
        }
        it = nonEmpty.iterator();
        return it;
    }

    public Iterator<Card> suitIterator(String suit){
        Iterator<Card> itSuit;
        PositionalList<Card> cardOfSuit = new LinkedPositionalList<>();
        for(Card card : cardsInHand){
            if(card.getSuit()==suit && card.getSuit()!=null){
                cardOfSuit.addFirst(card);
                }
            }
        itSuit=cardOfSuit.iterator();
        return itSuit;
    }
    public void removeCard(Card card){
        if(card.getRank()!=null && card.getSuit()!=null) {
            Position<Card> p = this.findPosition(card);
            cardsInHand.remove(p);
        }
    }
    public Card playRandomCard(Position<Card> finger,String suit){
        Card card=null;
        if(ifFingerEmpty(finger)){
            Iterator<Card> it1 = this.iterator();
            int i = 0;
            int item = new Random().nextInt(this.cardsInHand.size()-4);
            while (it1.hasNext()){
                Card cardChosed = it1.next();
                if(i == item){
                    card = cardChosed;
                    removeCard(card);
                }i++;
            }
        }
        else {
            Iterator<Card> suitIt = suitIterator(suit);
            if(suitIt.hasNext()){
                card = suitIt.next();
                removeCard(card);
            }
        }
        return card;
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

