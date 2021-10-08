import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        CardHand cards= new CardHand();
        cards.createDeck();
        Card c1 = cards.addCard("2","Heart");
        Card c2 = cards.addCard("5","Club");
        Card c3 = cards.addCard("Q","Spade");
        Card c4 = cards.addCard("7","Diamond");

//        Position<Card> walk = cards.cardsInHand.last();
//        System.out.println(cards.cardsInHand.before(walk).getElement().getRank());
//        walk=cards.cardsInHand.before(walk);
//        System.out.println(cards.cardsInHand.before(walk).getElement().getRank());
//        walk=cards.cardsInHand.before(walk);
//        System.out.println(cards.cardsInHand.before(walk).getElement().getRank());
//        walk=cards.cardsInHand.before(walk);
//        System.out.println(cards.cardsInHand.before(walk).getElement().getRank());
//        walk=cards.cardsInHand.before(walk);
//        System.out.println(cards.cardsInHand.before(walk).getElement().getRank());
//        walk=cards.cardsInHand.before(walk);
//        System.out.println(cards.cardsInHand.before(walk).getElement().getRank());
//        walk=cards.cardsInHand.before(walk);
//        System.out.println(cards.cardsInHand.before(walk).getElement().getRank());
//        walk=cards.cardsInHand.before(walk);
//        System.out.println(cards.cardsInHand.before(walk).getElement().getRank());

        Position<Card> p1 = cards.findPosition(c1);
        Position<Card> p2 = cards.findPosition(c2);
        Position<Card> p3 = cards.findPosition(c3);
        Position<Card> p4 = cards.findPosition(c4);

       // System.out.println(cards.cardsInHand.before(p1).getElement().getRank());

//        System.out.println(cards.cardsInHand.before(cards.fingerHeart).getElement());

//        System.out.println(cards.Play("Diamond").getRank());
//        System.out.println(cards.Play("Spade").getRank());
//        System.out.println(cards.Play("Club").getRank());
        System.out.println(cards.Play("Heart").getRank()); //Error only for the first element!!!!
        System.out.println(cards.Play("Heart").getRank());
        System.out.println(cards.Play("Heart").getRank());
        System.out.println(cards.Play("Heart").getRank());
        System.out.println(cards.Play("Heart").getRank());
        System.out.println(cards.cardsInHand.size());
//        System.out.println(cards.Play("Heart").getRank());


//        Iterator<Card> it = cards.iterator();
//
//        while (it.hasNext()){
//            Card card = it.next();
//                System.out.println(card.getRank() + "  of " + card.getSuit());
//        }
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