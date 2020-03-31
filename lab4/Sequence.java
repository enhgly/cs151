import java.io.*;
import java.util.*;

public class Sequence {

    private List<Integer> list = new ArrayList<Integer>();

    public void display() {
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public void add(int a) {
        list.add(a);
    }

    public void remove(int b) {
        boolean element = false;
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            if ((Integer) iterator.next() == b) {
                list.remove(Integer.valueOf(b));
                element = true;
                break;
            }
        }
        if (element == false) {
            System.out.println("Element " + b + " is not in the array.");
        }
    }
}