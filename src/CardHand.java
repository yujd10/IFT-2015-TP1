public class CardHand <E extends Comparable<E>>{
    //Class of cards
    protected static class Item <E extends Comparable<E>> implements Comparable <Item<E>> {
        private String rank;
        private String suit;
        private E value;
        private int totalInHand;
        private int heartSize;
        private int clubSize;
        private int spadeSize;
        private int diamondSize;


        public Item(String rank, String suit) {
            this.rank = rank;
            this.suit = suit;
        }

        private final static String[] Suit = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        private final static String[] Rank = {"Heart", "Club", "Spade", "Diamond"};

        public static String[] getRank() {
            return Rank;
        }

        public static String[] getSuit() {
            return Suit;
        }

        public E getValue() {
            return value;
        }
        public int getTotalInHand() {
            return totalInHand;
        }
        @Override
        public int compareTo(Item<E> other) {

            return this.value.compareTo(other.getValue());
        }

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
        public void addCard(String rank, String suit){
            //add a new card with rank r and suit s to the hand.
        }
        public void play(String s) {
            //emove and return a card of suit s from the player’s hand; if there is
            //no card of suit s, then remove and return an arbitrary card from the hand.
        }
        public int iterator(){
            //return an iterator for all cards currently in the hand.
            return this.totalInHand;
        }
        public int suitIterator(String suit){
            int size = getSuitSize(suit);
            return size;
        }


    }

    public static final int Fingers = 4;

}
