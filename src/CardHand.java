public class CardHand <E extends Comparable<E>>{
    //Class of cards
    protected static class Item <E extends Comparable<E>> implements Comparable <Item<E>> {
        private String rank;
        private String suit;
        private E value;

        public Item(String rank, String suit) {
            this.rank = rank;
            this.suit = suit;
        }

        private final static String[] Suit = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        private final static String[] Rank = {"Hearts", "Club", "Spade", "Diamond"};

        public static String[] getRank() {
            return Rank;
        }

        public static String[] getSuit() {
            return Suit;
        }

        public E getValue() {
            return value;
        }

        @Override
        public int compareTo(Item<E> other) {
            return this.value.compareTo(other.getValue());
        }
    }
    public static final int Fingers = 4;

}
