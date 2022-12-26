package class10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void startCar() {
        System.out.println("시동을 켭니다");
    }

    public void washCar() {}

    public void killEngine() {
        System.out.println("시동을 끕니다");
    }

    public final void run() {
        startCar();
        drive();
        wiper();
        stop();
        killEngine();
        washCar();
    }
}
