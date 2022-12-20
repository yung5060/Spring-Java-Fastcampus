package class19;

public class CarFactory {

    private static int defaultNum = 10000;

    private static CarFactory instance = new CarFactory();

    private CarFactory() {}

    public static CarFactory getInstance() {
        if (instance == null) {
            return new CarFactory();
        }
        return instance;
    }

    public Car createCar() {
        defaultNum++;
        return new Car(defaultNum);
    }
}
