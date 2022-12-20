public class Taxi {

    private String corpName;
    private int money;

    public Taxi() {
        this("no name");
    }

    public Taxi(String corpName) {
        this.corpName = corpName;
        this.money = 0;
    }

    public void take(int fee) {
        this.money += fee;
    }

    public void showTaxiInfo() {
        System.out.println(corpName + "택시 수입은 " + money + "원 입니다.");
    }
}
