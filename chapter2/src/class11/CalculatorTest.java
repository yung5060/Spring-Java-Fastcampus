package class11;

public class CalculatorTest {

    public static void main(String[] args) {

        int num1 = 10, num2 = 2;
        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2));
        System.out.println(calc.substract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        CompleteCalc cmpCalc = (CompleteCalc) calc;
        cmpCalc.showInfo();
    }
}
