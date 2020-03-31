import java.io.*;

public class ADT {
    public static void main(String[] args) {

        Sequence seq = new Sequence();

        System.out.println("Empty List : ");
        seq.display();

        seq.add(4);
        seq.add(5);
        seq.add(7);
        seq.add(1);
        seq.add(6);
        seq.add(8);
        seq.add(8);

        System.out.println("Filled array: ");
        seq.display();

        System.out.println("Remove method: ");
        seq.remove(8);
        seq.remove(2);
        seq.remove(7);

        System.out.println("Array after remove method: ");
        seq.display();
        
        seq.remove(8);
        seq.display();
    }
}