package lesson3;

import java.util.ArrayList;

public class ListSample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(12);
        list.add(19);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
