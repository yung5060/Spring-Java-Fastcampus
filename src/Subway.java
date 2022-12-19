public class Subway {
    private int lineNumber;
    private int passengerCnt;
    private int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCnt++;
    }

    public void showSubwayInfo() {
        System.out.println(lineNumber + "번의 승객 수는 " + passengerCnt + "명 이고, 수입은 " + money + "원입니다.");
    }
}
