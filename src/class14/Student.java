package class14;

public class Student {
    private String studentName;
    private int balance;

    public Student(String studentName, int balance) {
        this.studentName = studentName;
        this.balance = balance;
    }

    public void takeBus(Bus bus) {
        bus.take(1000);
        this.balance -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.balance -= 1200;
    }

    public void takeTaxi(Taxi taxi, int fee) {
        taxi.take(fee);
        this.balance -= fee;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + balance + "원 입니다.");
    }
}
