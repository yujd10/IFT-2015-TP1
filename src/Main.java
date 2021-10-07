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



        for(Card card:cards.cardsInHand){
            if (card.getRank() !=  " "){
            System.out.println(card.getRank()+" of " + card.getSuit());}
        }

//        Card cardPlayed = cards.Play("Heart");
//        System.out.println(cardPlayed.getRank()+" of "+cardPlayed.getSuit());
//    }
}}