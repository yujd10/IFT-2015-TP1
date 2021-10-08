import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/*
 * Names: Jiadi Yu                Badge: 20189854
 *        Vanessa Thibault-Soucy         20126808
 * Date: October 7th 2021
 * CardHand class arranges a group of cards in a person's hand. The simulator represent the sequence of cards
 * with the use of a single positional list ADT. This implementation makes sure all cards of the same suit
 * are kept together in the person's hand.
 *
 * To create this class, we have used the classes LinkedPositionalList.java, PositionalList.java and Position.java
 * which were available on the course's OneDrive. We are not the owner of these classes.
*/

public class CardHand {
    public ArrayList<Card> deck ;   // A deck of 52 cards
    PositionalList<Card> cardsInHand;
    Position<Card> fingerHeart; // Variables for our fingers
    Position<Card> fingerClub;
    Position<Card> fingerSpade;
    Position<Card> fingerDiamond;

    /*
     * CardHand() initiates the LinkedPositionalList that will hold all the cards a player is holding.
     * It also initiates deck as an ArrayList we will use to make sure a card is not produced twice.
    */
    public CardHand() {
        cardsInHand = new LinkedPositionalList<>();
        deck = new ArrayList<>();
    }

    /*
     * createDeck() produces the desk of 52 cards that will be used as our guide.
    */
    public  void createDeck(){
        for (int i = 0; i <Card.Suit.length ; i++){
            for (int j = 0; j < Card.Rank.length ; j++){
                deck.add(new Card(Card.Rank[j],Card.Suit[i]));
            }
        }
    }

    /*
     * addCard() takes 2 String type arguments which represents the rank and the suit of a card respectively.
     * The function goes through the deck and finds the matching card. If the card is not there the call to the function
     * has no action on the cards in the players hand. If the card is found in the deck, we check if the finger
     * that will be holding the card's suit had been placed in the list. If so, the card is placed to the position
     * before its holding finger and this card is then removed from the deck. If the holding finger has not been placed
     * yet, the finger in added to the cards in hand as the last element of the list, and the card is added
     *  right before it.
    */
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
/*
 * Play() takes a String s which corresponds to the suit of a card. It then analyses the case that corresponds to
 * this suit and sends it to the playRandomCard() methode with the finder the suit should be attached to, and the suit.
 * The method returns the card playRandomCard() will have return.
*/

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
    /*
     * ifFingerEmpty() takes a the position of a finger as its argument and returns true if no cards of the
     * corresponding suit can be found.
    */
    public boolean ifFingerEmpty(Position<Card> finger){
        boolean value=false;
        if(cardsInHand.before(finger)==null||finger == null||cardsInHand.before(finger).getElement().getRank()==null){
            value = true;
        }
        return value;
    }

    /*
     * findPosition takes a card as its argument and returns the position of the card that we are looking for.
     * The method is also used when we are removing a card to insure we are not trying to remove a finger position.
     */
    public Position<Card> findPosition (Card card){
        Position<Card> walk = cardsInHand.last();
        while (walk != null && cardsInHand.before(walk).getElement() != card ){
            walk = this.cardsInHand.before(walk);
        }
        return cardsInHand.before(walk);
    }
    /*
     * iterator() return an iterator for all cards currently placed in the player's hand.
     */
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
    /*
     * suitIterator() takes a String in argument which represents the targeted suit and return an iterator f
     * or all cards of this suit currently in the player's hand.
     */
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
    /*
     * removeCard takes a card as its argument and removes it form the cards in the hand.
     */
    public void removeCard(Card card){
        if(card.getRank()!=null && card.getSuit()!=null) {
            Position<Card> p = this.findPosition(card);
            cardsInHand.remove(p);
        }
    }
    /*
     * playRandomCard takes the position of a specific finger and a suit as its arguments. It validates first if the
     * hand is not empty and then validates if the finger that we are looking for is not empty as well. If the finger
     * is empty, we iterate through all the cards in hand and select a random one. If the finger is not empty,
     * we iterate through the cards that are available for this suit. The method returns the card that was
     * randomly selected. If the deck is empty, a message is print.
     */
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


