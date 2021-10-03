public class Main {
    public static void main(String[] args) {
        PositionalList<Integer> L1 = new LinkedPositionalList<>();
        PositionalList<Integer> L2 = new LinkedPositionalList<>();
        Position p,q,r,s;
        p = L1.addLast( 1 );
        q = L1.addLast( 2 );
        r = L2.addLast( 3 );
        s = L2.addLast( 4 );
        System.out.println( "L1: " + L1 );
        System.out.println( "L2: " + L2 );
        L1.remove( r );
        System.out.println( "L1: " + L1 );
        System.out.println( "L2: " + L2 );
    }
}
