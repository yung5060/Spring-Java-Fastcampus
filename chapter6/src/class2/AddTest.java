package class2;

public class AddTest {

    public static void main(String[] args) {

        Add addL = (x, y) -> {return x + y;};
        System.out.println(addL.add(2, 3));
    }
}
