public class Main {
    public static void main(String[] args) {
        CardHand<Card> cards= new CardHand<>();
        System.out.println(cards.ifEmpty());
        cards.addCard("2","Ace");
        System.out.println(cards.ifEmpty());
    }
}
