package class14;


public class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10, num2 = 2;
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        CompleteCalc cmpCalc = (CompleteCalc) calc;
        cmpCalc.describe();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Calc.total(arr));    // static method
    }
}
