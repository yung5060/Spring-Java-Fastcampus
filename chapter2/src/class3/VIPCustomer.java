package class3;

public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

//    public VIPCustomer() {
//
//        bonusRatio = 0.05;
//        salesRatio = 0.1;
//        customerGrade = "VIP";
//
//        System.out.println("VIPCustomer() called");
//    }


    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        salesRatio = 0.1;
        bonusRatio = 0.05;
        customerGrade = "VIP";

        System.out.println("VIPCustomer(int, String) called");
    }

    public double getSalesRatio() {
        return salesRatio;
    }

    public void setSalesRatio(double salesRatio) {
        this.salesRatio = salesRatio;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
