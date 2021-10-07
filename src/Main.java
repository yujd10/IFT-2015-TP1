import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CardHand cards= new CardHand();
        cards.createDeck();
 //       System.out.println(cards.fingerHeart == null);
        cards.addCard("2","Heart");
        cards.addCard("J","Spade");
        cards.addCard("3","Heart");
        cards.addCard("A","Diamond");
        cards.addCard("4","Heart");
        cards.addCard("2","Club");
        cards.addCard("5","Heart");
        cards.addCard("A","Club");
        cards.addCard("2","Diamond");
        cards.addCard("8","Heart");

//        Position<Card> p1 = cards.findPosition(c1);
//        System.out.println(p1);
//        //System.out.println(cards.cardsInHand.after(p1).getElement().getRank());
        Iterator<Card> it = cards.suitIterator("Heart");
        while(it.hasNext()){
            Card card = it.next();
            System.out.println(card.getRank()+" of "+card.getSuit());
        }
//        System.out.println(c1.getRank());
//        for(Card card:cards.cardsInHand){
//            if (card.getRank() !=  " "){
//                System.out.println(card.getRank()+" of " + card.getSuit());}
//        }
//
//        cards.iterator();


//
//        Card cardPlayed = cards.Play("Heart");
//        System.out.println(cardPlayed.getRank()+" of "+cardPlayed.getSuit());
//    }
}
}