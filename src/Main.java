import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CardHand cards= new CardHand();
        cards.createDeck();
//        //System.out.println(cards.deck.size());
        cards.addCard("2","Club");
//        //System.out.println(cards.deck.size()+" and "+ cards.getTotalInHand());
        cards.addCard("3","Club");
        //System.out.println(cards.deck.size()+" and "+ cards.getTotalInHand());
        cards.addCard("4","Heart");
        //System.out.println(cards.deck.size()+" and "+ cards.getTotalInHand());
        cards.addCard("6","Spade");
        cards.addCard("A","Club");
        cards.addCard("J","Diamond");
        cards.addCard("1","Heart");
        cards.addCard("6","Diamond");
        cards.addCard("8","Spade");
        //System.out.println(cards.deck.size()+" and "+ cards.getTotalInHand());
//        for(Card card:cards.cardsInHand){
//            if (card.getRank() != null){
//            System.out.println(card.getRank()+" of " + card.getSuit());}
//        }
//        System.out.println(cards.randomCard(cards.fingerClub, "Club"));
//        System.out.println(cards.cardsInHand.after(cards.fingerDiamond).getClass());

        for (Card card:cards.cardsInHand){
            if(){
                System.out.println(card.getRank()+" of " + card.getSuit());
            }
        }
//        System.out.println(new Random().nextInt(cards.getTotalInHand()-4));
    }
}