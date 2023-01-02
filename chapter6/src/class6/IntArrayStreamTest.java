package class6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntArrayStreamTest {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

//        for (int num : arr) {
//            System.out.println(num);
//        }

//        Arrays.stream(arr).forEach(n -> System.out.println(n));

        System.out.println(Arrays.stream(arr).sum());

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        System.out.println(intList.stream().mapToInt(n -> n.intValue()).sum());
    }
}
