import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        CardHand cards= new CardHand();
        cards.createDeck();
<<<<<<< HEAD
       System.out.println(cards.cardsInHand.before(cards.fingerOne).getElement().getRank());
       System.out.println(cards.cardsInHand.after(cards.fingerTwo).getElement().getRank());
        System.out.println(cards.cardsInHand.after(cards.fingerThree).getElement().getRank());
       System.out.println(cards.cardsInHand.before(cards.fingerFour).getElement().getRank());
        //System.out.println(cards.deck.size());
//        cards.addCard("2","Club");
////        //System.out.println(cards.deck.size()+" and "+ cards.getTotalInHand());
//        cards.addCard("3","Club");
        //System.out.println(cards.deck.size()+" and "+ cards.getTotalInHand());
//        cards.addCard("4","Heart");
//        //System.out.println(cards.deck.size()+" and "+ cards.getTotalInHand());
//        cards.addCard("6","Spade");
//        cards.addCard("A","Club");
//        cards.addCard("J","Diamond");
//        cards.addCard("1","Heart");
//        cards.addCard("6","Diamond");
//        cards.addCard("8","Spade");
        //System.out.println(cards.deck.size()+" and "+ cards.getTotalInHand());
//        for(Card card:cards.cardsInHand){
//            if (card.getRank() != " "){
//            System.out.println(card.getRank()+" of " + card.getSuit());}
//        }
//        System.out.println(cards.randomCard(cards.fingerClub, "Club"));
//        System.out.println(cards.cardsInHand.after(cards.fingerDiamond).getClass());

//        for (Card card:cards.cardsInHand){
//            if(){
//                System.out.println(card.getRank()+" of " + card.getSuit());
//            }
//        }
//        System.out.println(new Random().nextInt(cards.getTotalInHand()-4));
=======
        cards.addCard("2","Heart");
        cards.addCard("5","Heart");
         cards.addCard("Q","Spade");
        cards.addCard("7","Diamond");
       cards.addCard("2","Heart");
        cards.addCard("2","Diamond");
        cards.addCard("2","Club");
        cards.addCard("2","Heart");
        cards.addCard("2","Club");
        cards.addCard("2","Heart");
        cards.addCard("2","Spade");
         cards.addCard("2","Diamond");
        cards.addCard("2","Heart");

        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");
        cards.Play("Heart");



>>>>>>> cd2912138a0a545be3ae9cca99ede1de5ff84983
    }
}