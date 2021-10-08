import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class CardHand {
    private int totalInHand;
<<<<<<< HEAD
    public ArrayList<Card> deck ;//= new ArrayList<>();
    PositionalList<Card> cardsInHand; //=new LinkedPositionalList<>();
    Position<Card> fingerOne;
    Position<Card> fingerTwo;
    Position<Card> fingerThree;
    Position<Card> fingerFour;
=======
    public ArrayList<Card> deck ;
    PositionalList<Card> cardsInHand;
>>>>>>> cd2912138a0a545be3ae9cca99ede1de5ff84983
    Position<Card> fingerHeart;
    Position<Card> fingerClub;
    Position<Card> fingerSpade;
    Position<Card> fingerDiamond;

    public CardHand() {
        cardsInHand = new LinkedPositionalList<>();
        deck = new ArrayList<>();
<<<<<<< HEAD

        cardsInHand.addFirst(new Card("4", "Spade"));
        fingerFour = cardsInHand.first();
        cardsInHand.addFirst(new Card("3",null));
        fingerThree = cardsInHand.first();
        cardsInHand.addFirst(new Card("2", null));
        fingerTwo = cardsInHand.first();
        cardsInHand.addFirst(new Card("1", null));
        fingerOne = cardsInHand.first();

=======
        //cardsInHand.addFirst(new Card(null,null));
>>>>>>> cd2912138a0a545be3ae9cca99ede1de5ff84983
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
<<<<<<< HEAD
                if(deck.get(i).getSuit() == "Heart") {
                    defineFinger(fingerHeart,deck.get(i));
                    }
                }else if (deck.get(i).getSuit() == "Club"){
                    defineFinger(fingerClub,deck.get(i));

                }else if (deck.get(i).getSuit() == "Spade"){
                    defineFinger(fingerSpade,deck.get(i));
                }else{
                    defineFinger(fingerDiamond,deck.get(i));

                }
=======
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
>>>>>>> cd2912138a0a545be3ae9cca99ede1de5ff84983
            }
           return cardPlayed;
    }
    public boolean ifFingerEmpty(Position<Card> finger){
        boolean value=false;
        if(cardsInHand.before(finger)==null||finger == null||cardsInHand.before(finger).getElement().getRank()==null){
            value = true;
        }
<<<<<<< HEAD
    public void defineFinger(Position<Card> finger,Card card){
        if (isFingerEmpty(fingerOne)){
            cardsInHand.before(fingerOne).getElement().setSuit(card.getSuit());
            cardsInHand.before(fingerOne).getElement().setRank(card.getRank());
            this.fingerOne = finger;
            deck.remove(card);}
        else if (isFingerEmpty(fingerTwo)) {
            cardsInHand.before(fingerTwo).getElement().setSuit(card.getSuit());
            cardsInHand.before(fingerTwo).getElement().setRank(card.getRank());
            this.fingerTwo = finger;
            deck.remove(card);}
        else if (isFingerEmpty(fingerThree)) {
            cardsInHand.before(fingerThree).getElement().setSuit(card.getSuit());
            cardsInHand.before(fingerThree).getElement().setRank(card.getRank());
            this.fingerThree = finger;
            deck.remove(card);}
        else if (isFingerEmpty(fingerFour)) {
            cardsInHand.before(fingerFour).getElement().setSuit(card.getSuit());
            cardsInHand.before(fingerFour).getElement().setRank(card.getRank());
            this.fingerFour = finger;
            deck.remove(card);}
        else {
            this.cardsInHand.addBefore(finger,card);
            deck.remove(card);}
    }


    public boolean isFingerEmpty(Position<Card> finger){
        boolean value;
        if (cardsInHand.before(finger).getElement().getRank() == null){
            value = true;}
        else{
            value = false;
        }

        return value;
    }
    //Iterates to the next finger
    public Position<Card> getNextFinger(Position<Card> finger){
        if (fingerOne.equals(finger)){return fingerOne;}
        else if (fingerTwo.equals(finger)){return fingerTwo;}
        else if (fingerThree.equals(finger)){return fingerThree;}
        else {return fingerFour;}
    }
    //find the finger for a specific suit
//    public Position<Card> suitLocation(String s){
//        if (s == Card.getSuit()[0]){
//            return fingerOne;
//        }
//        else if (s == Card.getSuit()[1]){
//            return fingerTwo;
//        }
//        else if (s == Card.getSuit()[2]){
//            return fingerThree;
//        }
//        else {
//            return fingerFour;
//        }
//    }
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
=======
        return value;
    }

    public Position<Card> findPosition (Card card){
        Position<Card> walk = cardsInHand.last();
        while (walk != null && cardsInHand.before(walk).getElement() != card ){
            walk = this.cardsInHand.before(walk);
        }
        return cardsInHand.before(walk);
>>>>>>> cd2912138a0a545be3ae9cca99ede1de5ff84983
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
        if(this.cardsInHand.size()!=4){
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
        }else{
        System.out.println("no more cards in hand");
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

