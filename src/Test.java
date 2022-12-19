public class Test {

    public static void main(String[] args) {
        Student student1 = new Student("Yung", 5000);
        Student student2 = new Student("Youngwoo", 8000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        student1.takeBus(bus100);

        Subway greenSubway = new Subway(2);

        student2.takeSubway(greenSubway);

        student1.showInfo();
        student2.showInfo();

        bus100.showBusInfo();
        bus500.showBusInfo();

        greenSubway.showSubwayInfo();
    }
}
