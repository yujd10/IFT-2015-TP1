import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CardHand cards= new CardHand();
        cards.createDeck();
        Card c1 =cards.addCard("2","Heart");
        cards.addCard("5","Club");
        cards.addCard("Q","Spade");
        cards.addCard("7","Diamond");

        System.out.println(cards.Play("Diamond").getRank());
        System.out.println(cards.Play("Spade").getRank());
        System.out.println(cards.Play("Club").getRank());
        System.out.println(cards.Play("Heart").getRank()); //Error only for the first element!!!!


        Iterator<Card> it = cards.iterator();

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