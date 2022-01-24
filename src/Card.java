public class Card implements Comparable<Card>  {
    private String rank;
    private String suit;


    public Card(String rank, String suit) {this.rank = rank;this.suit=suit;}

    public final static String[] Rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    public final static String[] Suit = {"Heart", "Club", "Spade", "Diamond"}; //Spade > Heart > Diamond > Club

    public String getRank() {return rank;}

    public String getSuit() {
        return suit;
    }

    public void setRank(String rank) { this.rank = rank; }
    public void setSuit(String suit) { this.suit = suit; }

    @Override
    public int compareTo(Card o) {
        return -1;
    }
}
//    public void setSuitSize(String s){
//        if (s == "Heart"){
//            this.heartSize += 1;
//        }
//        else if (s == "Club"){
//            this.clubSize += 1;
//        }
//        else if (s == "Spade"){
//            this.spadeSize += 1;
//        }
//        else{
//            this.diamondSize +=1;
//        }
//    }
//    public int getSuitSize(String s){
//        if (s == "Heart"){
//            return this.heartSize;
//        }
//        else if (s == "Club"){
//            return this.clubSize;
//        }
//        else if (s == "Spade"){
//            return this.spadeSize;
//        }
//        else{
//            return this.diamondSize;
//        }
//    }
//public boolean ifInList(String val,String[] list){
//        for (int i=0 ;i<list.length;i++) {
//            if (val == list[i]) {
//                return true;
//            }
//        }
//        return false;
//    }
