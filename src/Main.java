

public class Main {

    public static String[] Suit = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    public static String[] Rank = {"Heart", "Club", "Spade", "Diamond"};
    public static boolean ifInList(String val,String[] list){
        for (int i=0 ;i<list.length;i++) {
            if (val == list[i]) {
                return true;
            }
        }
    return false;}
    public static void main(String[] args) {
        CardHand cards= new CardHand();
        System.out.println(cards.ifEmpty());
        cards.addCard("2","Ace");
        System.out.println(cards.ifEmpty());
    // System.out.println(ifInList("1", Suit));

    }
}