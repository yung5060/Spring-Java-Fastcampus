package class16;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employeeCho = new Employee();
        employeeCho.setEmployeeName("Yung");

        System.out.println(Employee.getSerialNum());

        Employee employeePark = new Employee();
        employeePark.setEmployeeName("Heejin");

        System.out.println(employeeCho.getEmployeeName() + "님의 사번은 " + employeeCho.getEmployeeId());
        System.out.println(employeePark.getEmployeeName() + "님의 사번은 " + employeePark.getEmployeeId());
    }
}
