import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CardHand cards= new CardHand();
        cards.createDeck();
        System.out.println(cards.deck.size());
        cards.addCard("2","Club");
        System.out.println(cards.deck.size()+" and "+ cards.getTotalInHand());
        cards.addCard("3","Club");
        System.out.println(cards.deck.size()+" and "+ cards.getTotalInHand());
        System.out.println(cards.deck.size());
    }
}