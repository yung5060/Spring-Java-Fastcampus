public class Bus {
    private int busNumber;
    private int passengerCnt;
    private double money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCnt++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번의 승객 수는 " + passengerCnt + "명 이고, 수입은 " + money + "원입니다.");
    }
}
