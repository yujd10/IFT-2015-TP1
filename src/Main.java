/*
 * Names: Jiadi Yu                Badge: 20189854
 *        Vanessa Thibault-Soucy         20126808
 * Date: October 7th 2021
 */


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        CardHand cards= new CardHand();
        cards.createDeck();

        cards.addCard("2","Heart");
        cards.addCard("3","Heart");
        cards.addCard("4","Spade");
        cards.addCard("5","Diamond");
        cards.addCard("6","Club");
        cards.addCard("7","Spade");
        cards.addCard("8","Diamond");
        cards.addCard("9","Spade");
        cards.addCard("10","Heart");
        cards.addCard("A","Heart");
        cards.addCard("J","Diamond");
        cards.addCard("Q","Heart");
        cards.addCard("K","Diamond");

        System.out.println("===========List of Diamond============");
        //To go through the list of a particular suit of cards
        Iterator<Card> itSuit = cards.suitIterator("Diamond");
        while(itSuit.hasNext()){
            Card card = itSuit.next();
            System.out.println(card.getRank()+" of "+card.getSuit());
        }
        System.out.println("============All cards in hand==========");
        //To go through the list with iterator
        Iterator<Card> it = cards.iterator();
        while(it.hasNext()){
            Card card = it.next();
            System.out.println(card.getRank()+" of "+card.getSuit());
        }

        System.out.println("==========================================");

        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");

        //Iterator 2
        Iterator<Card> it1 = cards.iterator();
        while(it1.hasNext()){
            Card card = it1.next();
            System.out.println(card.getRank()+" of "+card.getSuit());

        }
        System.out.println("==========================================");

        //When running out of card of suit Heart, we are going to choose randomly from other suits of cards
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");


        //Iterator 3
        Iterator<Card> it2 = cards.iterator();
        while(it2.hasNext()){
            Card card = it2.next();
            System.out.println(card.getRank()+" of "+card.getSuit());
        }

        System.out.println("==========================================");

        //When running out of all cards, it will show that we don't have more cards to play
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");

    }
}