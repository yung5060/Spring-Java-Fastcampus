package class7;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 30, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 20, 50);

        List<TravelCustomer> customerList = new ArrayList<>();
        customerList.add(customerLee);
        customerList.add(customerKim);
        customerList.add(customerHong);

        System.out.println("고객 명단 출력");
//        () -> customerList()
    }
}
