import java.util.ArrayList;
import java.util.Random;

public class CardHand {
    private int totalInHand;
    public ArrayList<Card> deck ;//= new ArrayList<>();
    PositionalList<Card> cardsInHand; //=new LinkedPositionalList<>();
    Position<Card> fingerOne;
    Position<Card> fingerTwo;
    Position<Card> fingerThree;
    Position<Card> fingerFour;
    Position<Card> fingerHeart;
    Position<Card> fingerClub;
    Position<Card> fingerSpade;
    Position<Card> fingerDiamond;

    public CardHand() {
        cardsInHand = new LinkedPositionalList<>();
        deck = new ArrayList<>();
        cardsInHand.addFirst(new Card("1", null));
        fingerOne = cardsInHand.last();
        cardsInHand.addLast(new Card(  ull));
        fingerTwo = cardsInHand.last();
        cardsInHand.addLast(new Card(null, null));
        fingerThree = cardsInHand.last();
        cardsInHand.addLast(new Card(null, null));
        fingerFour = cardsInHand.last();
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
                    defineFinger(fingerHeart,deck.get(i));
                    }
                }else if (deck.get(i).getSuit() == "Club"){
                    defineFinger(fingerClub,deck.get(i));

                }else if (deck.get(i).getSuit() == "Spade"){
                    defineFinger(fingerSpade,deck.get(i));
                }else{
                    defineFinger(fingerDiamond,deck.get(i));

                }
            }
        }
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
    }
    public int suitIterator(String suit){
       return 1 ;
    }

//    public void removeCard(String r,String s)
}


