package class9;

public class ComputerTest {

    public static void main(String[] args) {

        Computer desktop = new Desktop();
        Computer laptop = new MyLaptop();

        desktop.display();
        laptop.display();
    }
}
