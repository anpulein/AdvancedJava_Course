package JavaCollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ITERABLE {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Before Java 5
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Java 5
        for (int x: list) {
            System.out.println(x);
        }
    }
}
