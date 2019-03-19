package ko.maeng.vector;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>(4, 1);
        System.out.println(vector.size());
        System.out.println(vector.capacity());

        vector.addElement("Apple");
        vector.addElement("Kiwi");
        vector.addElement("Rice");
        vector.addElement("Rise");

        System.out.println("----------------------------");

        System.out.println(vector.size());
        System.out.println(vector.capacity());

        System.out.println("First: " + vector.firstElement());
        System.out.println("Last: " + vector.lastElement());
        vector.add("Faker");
        vector.set(1, "Water");

        Iterator<String> iterator = vector.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + ",");
        }
    }
}
