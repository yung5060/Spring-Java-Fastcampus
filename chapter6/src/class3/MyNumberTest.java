package class3;
import java.lang.Math;

public class MyNumberTest {

    public static void main(String[] args) {

        MyNumber myNumber = (x, y) -> { return Math.max(x, y); };

        System.out.println(myNumber.getMax(4, 5));
    }
}
