public class Card implements Comparable<Card>  {
    private int rank;
    private String[] suit;


    public Card(String suit, int rank) {
        String[] s = suit.split("");
        this.rank = rank;
        this.suit = s;
        /*if ((ifInList(suit, Suit))&&ifInList(rank, Rank)){
            this.rank = rank;this.suit=suit;
        }
        else {
            throw new IllegalArgumentException( "Select a card existing" );
        }*/
     }


    private static String[] Suit = {"Heart", "Club", "Spade", "Diamond"};
    private static int[] Rank = {1,2,3,4,5,6,7,8,9,10,11,12,13};

    public boolean ifInList(String val, String[] list){
        for (int i=0 ;i<list.length;i++) {
          //  if (val in list[i]) {
                return true;
            //}
        }
        return false;
    }


    public int[] getRank() {
        return Rank;
    }
    public static String[] getSuit() { return Suit; }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public void setSuit(String[] suit) {
        this.suit = suit;}


    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
