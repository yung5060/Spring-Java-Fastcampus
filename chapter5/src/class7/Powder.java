package class7;

public class Powder extends Material {

    @Override
    public void doPrinting() {
        System.out.println("printing powder");
    }

    @Override
    public String toString() {
        return "재료는 Powder 입니다";
    }
}
