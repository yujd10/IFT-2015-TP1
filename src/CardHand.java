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

    public CardHand() {cardHand = new LinkedPositionalList<Card>();
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


    public boolean isEmpty(){
        if (cardHand.size() == 4){
            return true;}
        else{
            return false;
        }

    }
    /*static PositionalList<Card> cardsInHand = new LinkedPositionalList<Card>();
    public boolean ifEmpty() {
        return this.cardsInHand.isEmpty();
    }

    public static void addCard(int rank, String suit){
        //if (CardHand.getSuitSize(suit) == 0){}

        Card card = new Card(suit, rank);
        CardHand.cardsInHand.addFirst(card);
        CardHand.totalInHand += 1;
        //add a new card with rank r and suit s to the hand.
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


