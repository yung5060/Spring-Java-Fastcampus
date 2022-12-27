package class14;

public interface Calc {

    double PI = 3.14;
    int ERROR_CODE = -99999999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    private void myMethod() {
        System.out.println("myMethod called");
    }

    private static void myStaticMethod() {
        System.out.println("myStaticMethod called");
    }

    default void describe() {
        System.out.println("정수의 사칙연산을 제공합니다.");
        myMethod();
    }

    static int total(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        myStaticMethod();
        return total;
    }
}
