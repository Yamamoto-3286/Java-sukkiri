package lesson6;

import java.util.Arrays;
import java.util.List;

public class StreamSample {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list1.stream().sorted().forEach(System.out::println);
    }
}
