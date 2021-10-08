import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        CardHand cards= new CardHand();
        cards.createDeck();
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



    }
}