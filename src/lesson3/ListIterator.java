package lesson3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIterator {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }
    }
}
