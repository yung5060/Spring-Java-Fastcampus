package class5;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamTest {

    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();
        sList.add("Thomas");
        sList.add("Edward");
        sList.add("Jack");

        sList.stream().forEach(s -> System.out.println(s));
        System.out.println();
        sList.stream().sorted().forEach(s -> System.out.println(s));
        System.out.println();
        sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
        System.out.println();
        sList.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
    }
}
