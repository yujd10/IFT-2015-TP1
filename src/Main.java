import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CardHand cards= new CardHand();
        cards.createDeck();
        Card c1 =cards.addCard("2","Heart");
        cards.addCard("3","Heart");
        cards.addCard("4","Heart");
        cards.addCard("5","Heart");
        cards.addCard("8","Heart");
        Card c2 = cards.addCard("J","Spade");

        cards.addCard("K","Spade");
        cards.addCard("5","Diamond");
        cards.addCard("6","Diamond");
        cards.addCard("7","Diamond");
        cards.addCard("3","Club");
        cards.addCard("4","Club");
        cards.addCard("5","Club");
        cards.addCard("Q","Spade");


//        System.out.println(cards.cardsInHand.before(cards.fingerHeart).getElement().getRank()+" of "+cards.cardsInHand.before(cards.fingerHeart).getElement().getSuit());
//        System.out.println(cards.cardsInHand.before(cards.fingerSpade).getElement().getRank()+" of "+cards.cardsInHand.before(cards.fingerSpade).getElement().getSuit());
//        System.out.println(cards.cardsInHand.before(cards.fingerDiamond).getElement().getRank());
//        System.out.println(cards.cardsInHand.before(cards.fingerClub).getElement().getRank());
        //System.out.println(cards.ifFingerEmpty(cards.fingerSpade));

        System.out.println(cards.playRandomCard(cards.fingerHeart, "Heart").getRank());
        System.out.println(cards.playRandomCard(cards.fingerHeart, "Heart").getRank());
        System.out.println(cards.playRandomCard(cards.fingerHeart, "Heart").getRank());
//        System.out.println(cards.playRandomCard(cards.fingerHeart, "Heart").getRank());
//        Position<Card> p2= cards.findPosition(c2);
//        System.out.println(cards.cardsInHand.before(p2).getElement().getRank());
        Iterator<Card> it = cards.suitIterator("Heart");
//        System.out.println(it.hasNext());
//        int i= 0;
//        int item = new Random().nextInt(cards.cardsInHand.size()-4);
        while (it.hasNext()){
            Card card = it.next();
                System.out.println(card.getRank() + "  of " + card.getSuit());

        }
//        System.out.println(cards.playRandomCard(cards.fingerHeart, "Heart").getRank());
//        System.out.println(cards.playRandomCard(cards.fingerHeart, "Heart").getRank());
//        System.out.println(cards.playRandomCard(cards.fingerHeart, "Heart").getRank());
//        System.out.println(cards.playRandomCard(cards.fingerHeart, "Heart").getRank());
//        System.out.println(cards.playRandomCard(cards.fingerHeart, "Heart").getRank());
//        System.out.println(cards.playRandomCard(cards.fingerHeart, "Heart").getRank());
//        for(Card card: cards.cardsInHand){if(card.getSuit()!=null){System.out.println(card.getRank()+" of " +card.getSuit());}}
//        cards.removeCard(c2);
//        System.out.println(cards.fingerSpade.getElement().getRank());
//        System.out.println("==========================");

//        System.out.println(cards.cardsInHand.before(cards.fingerSpade).getElement().getRank());
//
//        cards.removeCard(cards.cardsInHand.before(cards.fingerSpade).getElement());
//
//        for(Card card: cards.cardsInHand){System.out.println(card.getRank()+" of " +card.getSuit());}
//
//        System.out.println(cards.cardsInHand.before(cards.fingerSpade).getElement().getRank());
//        cards.removeCard(cards.cardsInHand.before(cards.fingerSpade).getElement());
//
//        for(Card card: cards.cardsInHand){System.out.println(card.getRank()+" of " +card.getSuit());}
//
//        System.out.println(cards.cardsInHand.before(cards.fingerSpade).getElement().getRank());
//        cards.removeCard(cards.cardsInHand.before(cards.fingerSpade).getElement());
//        System.out.println(cards.cardsInHand.before(cards.fingerSpade).getElement().getRank());

////        cards.Play("Spade");
//        cards.addCard("3","Diamond");
//        for(Card card: cards.cardsInHand){
//            System.out.println(card.getRank()+" of "+card.getSuit());
//        }
//        System.out.println("===========================");
//        System.out.println();
//        cards.Play("Spade");
//
//        for(Card card: cards.cardsInHand){
//            System.out.println(card.getRank()+" of "+card.getSuit());
//        }

    }
}