

public class Main {
    // private final static String[] Suit = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    // private final static String[] Rank = {"Heart", "Club", "Spade", "Diamond"};
    // public static boolean ifInList(String val,String[] list){
    //     for (int i=0 ;i<list.length;i++) {
    //         if (val == list[i]) {
    //             return true;
    //         }
    //     }
    //     return false;
    //}
    public static void main(String[] args) {
        CardHand cards= new CardHand();
        // Card card1 = new Card("2", "Spade");
        cards.addCard("2","Club");
        cards.addCard("3","Club");
        cards.addCard("4","Club");
        cards.addCard("5","Club");
        System.out.println(cards.ifEmpty());
        
        cards.iterator();
        // System.out.println(ifInList("2", Suit)&&(ifInList("Spade",Rank)));
    // System.out.println(ifInList("1", Suit));

    }
}