package class4;

public class StringConcatTest {

    public static void main(String[] args) {

        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString("Hello", "World");

        StringConcat strConcat = (x, y) -> {
            System.out.println(x + ", " + y);
        };

        strConcat.makeString("Hello", "World");

        StringConcat strConcat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + ", " + s2);
            }
        };

        strConcat2.makeString("Hello", "World");
    }
}
