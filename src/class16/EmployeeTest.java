package class16;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employeeCho = new Employee();
        employeeCho.setEmployeeName("Yung");

        System.out.println(employeeCho.serialNum);

        Employee employeePark = new Employee();
        employeePark.setEmployeeName("Heejin");
        employeePark.serialNum++;

        System.out.println(employeeCho.serialNum);
        System.out.println(employeePark.serialNum);
    }
}
