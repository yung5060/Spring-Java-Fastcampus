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

        System.out.println("======================================");

        Student student3 = new Student("Edward", 20000);

        Taxi taxi1 = new Taxi("잘나간다 운수");

        student3.takeTaxi(taxi1, 10000);

        student3.showInfo();
        taxi1.showTaxiInfo();
    }
}
