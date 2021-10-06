import java.sql.SQLOutput;

public class CardHand {
    private static int totalInHand;

    public static int heartSize;
    public static int clubSize;
    public static int spadeSize;
    public static int diamondSize;
    PositionalList<Card> cardHand;

    Position<Card> fingerOne;
    Position<Card> fingerTwo;
    Position<Card> fingerThree;
    Position<Card> fingerFour;

    public CardHand() {
        cardHand = new LinkedPositionalList<Card>();
        //First fingers in order in the hand
        cardHand.addFirst(new Card(null, 0));
        fingerOne = cardHand.first();
        cardHand.addLast(new Card(null, 0));
        fingerTwo = cardHand.last();
        cardHand.addLast(new Card(null, 0));
        fingerThree = cardHand.last();
        cardHand.addLast(new Card(null, 0));
        fingerFour = cardHand.last();

    }
    public void addCard(int rank, String suit) {
        Position<Card> finger = suitLocation(suit);
        cardHand.addAfter(finger, new Card(suit, rank));


    }
    public boolean isEmpty(){
        if (cardHand.size() == 4){
            return true;}
        else{
            return false;
        }

    }
    public boolean isFingerEmpty(Position<Card> finger){
        boolean value;
        if (cardHand.after(finger) == null){
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
    public Position<Card> suitLocation(String s){
        if (s == Card.getSuit()[0]){
            return fingerOne;
        }
        else if (s == Card.getSuit()[1]){
            return fingerTwo;
        }
        else if (s == Card.getSuit()[2]){
            return fingerThree;
        }
        else {
            return fingerFour;
        }
    }
    public void play(String s) {
        Position<Card> finger = suitLocation(s);
        if (isEmpty()){
            System.out.println("You have no cards.");
        }
        else if(isFingerEmpty(finger)){
            System.out.println("No Card from this suit on hand.");
        }

    }


    /*static PositionalList<Card> cardsInHand = new LinkedPositionalList<Card>();
    public boolean ifEmpty() {
        return this.cardsInHand.isEmpty();
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
        int iterator = getSuitSize(suit);
       return iterator ;
    }
    public int getTotalInHand() {
        return 1 ;
    }
    public void setSuitSize(String s){
        if (s == "Heart"){
            this.heartSize += 1;
        }
        else if (s == "Club"){
            this.clubSize += 1;
        }
        else if (s == "Spade"){
            this.spadeSize += 1;
        }
        else{
            this.diamondSize +=1;
        }
    }
    public static int getSuitSize(String s){
        if (s == "Heart"){
            return CardHand.heartSize;
        }
        else if (s == "Club"){
            return CardHand.clubSize;
        }
        else if (s == "Spade"){
            return CardHand.spadeSize;
        }
        else{
            return CardHand.diamondSize;
        }
    }*/
}


