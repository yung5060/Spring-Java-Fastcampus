package class7;

public class Plastic extends Material {

    @Override
    public void doPrinting() {
        System.out.println("printing plastic");
    }

    @Override
    public String toString() {
        return "재료는 Plastic 입니다";
    }
}
