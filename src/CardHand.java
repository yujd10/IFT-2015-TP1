public class CardHand {
    private static int totalInHand;

    public static int heartSize;
    public static int clubSize;
    public static int spadeSize;
    public static int diamondSize;
    PositionalList<Card> cardHand;

    Position<Card> fingerHeart;
    Position<Card> fingerClubs;
    Position<Card> fingerSpades;
    Position<Card> fingerDiamond;

    public CardHand() {
        cardHand = new LinkedPositionalList<Card>();
        //First fingers in order in the hand
        cardHand.addFirst(new Card(null, 0));
        fingerHeart = cardHand.first();
        cardHand.addLast(new Card(null, 0));
        fingerClubs = cardHand.last();
        cardHand.addLast(new Card(null, 0));
        fingerSpades = cardHand.last();
        cardHand.addLast(new Card(null, 0));
        fingerDiamond = cardHand.last();

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
        if (fingerHeart.equals(finger)){return fingerClubs;}
        else if (fingerClubs.equals(finger)){return fingerSpades;}
        else if (fingerSpades.equals(finger)){return fingerDiamond;}
        else {return fingerHeart;}
    }
    //find the finger for a specific suit
    public Position<Card> suitLocation(String s){
        if (s == Card.getSuit()[0]){
            return fingerHeart;
        }
        else if (s == Card.getSuit()[1]){
            return fingerClubs;
        }
        else if (s == Card.getSuit()[2]){
            return fingerSpades;
        }
        else {
            return fingerDiamond;
        }
    }
    public void play(String s) {
        Position<Card> finger = suitLocation(s);
        if (cardHand.isEmpty()){
            System.out.println("You have no cards.");
        }
        else if(isFingerEmpty(finger)){
            Position<Card> nextFinger = getNextFinger(finger);
        }

    }
    public Position<Card> checkNextFinger(Position<Card> finger){

        if(isFingerEmpty(finger)){
            Position<Card> nextFinger = getNextFinger(finger);
            checkNextFinger(nextFinger);
        }
        else{
            return finger;
        }
        return finger;
    }


    /*public Position<Card> cardToPlay(String s, Position<Card> finger){
        Card card = cardHand.after(finger).getElement().getRank();
    }*/

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


