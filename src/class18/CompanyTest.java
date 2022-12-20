package class18;

import java.util.Calendar;

public class CompanyTest {

    public static void main(String[] args) {
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        // 자바 유틸에서 제공해주는 캘린더는 싱글톤!!!!
        Calendar calendar = Calendar.getInstance();
    }
}
