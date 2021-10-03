public class Card implements Comparable<Card>  {
    private String rank;
    private String suit;
    private int heartSize;
    private int clubSize;
    private int spadeSize;
    private int diamondSize;

    public Card(String rank, String suit) { this.rank = rank; this.suit = suit; }

    private final static String[] Suit = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private final static String[] Rank = {"Heart", "Club", "Spade", "Diamond"};

    public static String[] getRank() {
        return Rank;
    }
    public static String[] getSuit() { return Suit; }

    public void setRank(String rank) {
        this.rank = rank;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setSuitSize(String s){
        if (s == "Heart"){
            this.heartSize += 1;
        }
        else if (s == "Club"){
            this.clubSize += 1;
        }
        else if (s == "Spade"){
            this.spadeSize += 1;
        }
        else{
            this.diamondSize +=1;
        }
    }
    public int getSuitSize(String s){
        if (s == "Heart"){
            return this.heartSize;
        }
        else if (s == "Club"){
            return this.clubSize;
        }
        else if (s == "Spade"){
            return this.spadeSize;
        }
        else{
            return this.diamondSize;
        }
    }

    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
