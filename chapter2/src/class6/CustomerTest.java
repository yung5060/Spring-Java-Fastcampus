package class6;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomerTest {

    public static void main(String[] args) {

        Customer customerT = new Customer(10010, "Thomas");
        Customer customerJ = new Customer(10020, "James");
        Customer customerE = new GoldCustomer(10030, "Edward");
        Customer customerP = new GoldCustomer(10040, "Percy");
        Customer customerK = new VIPCustomer(10050, "Kim");

        ArrayList<Customer> customerList = new ArrayList<>(Arrays.asList(customerT, customerJ, customerE, customerP, customerK));

//        for (Customer customer : customerList) {
//            System.out.println(customer.showCustomerInfo());
//        }
//        int price = 10000;
//        for (Customer customer : customerList) {
//            int cost = customer.calPrice(price);
//            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불하셨습니다.");
//            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
//        }
        if (customerE instanceof GoldCustomer) {
            GoldCustomer vc = (GoldCustomer) customerE;
            System.out.println(customerE.showCustomerInfo());
        }
    }
}
