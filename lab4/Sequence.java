import java.util.Iterator;

public class Sequence<E> {

    private int count = 0;

    private E[] element = (E[]) new Object[10];

    public Sequence() {
        element[0] = (E) "1";
        element[1] = (E) "2";
        element[2] = (E) "3";
    }

    public Iterator<E> getElements() {
        return new Iterator<E>() {
            public boolean hasNext() {
                return count < element.length;
            }

            public E next() {
                return element[count++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {

        Sequence client1 = new Sequence();
        Sequence client2 = new Sequence();
        Sequence client3 = new Sequence();

        System.out.println("Client 1: " + client1.getElements().next());
        System.out.println("Client 2: " + client2.getElements().next());
        System.out.println("Client 2: " + client2.getElements().next());
        System.out.println("Client 3: " + client3.getElements().next());
        System.out.println("Client 3: " + client3.getElements().next());
        System.out.println("Client 3: " + client3.getElements().next());
    }
}