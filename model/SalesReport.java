package vortexpc.model;

public class SalesReport {
    public void printCustomerSummary(Customer customer) {
    customer.printSummary(); // delegasi ke Customer
    }



    // METHOD INI CEMBURU PADA CUSTOMER!
    // public void printCustomerSummary(Customer customer) {
    //     System.out.println("--- Customer Summary ---");
    //     System.out.println("Name: " + customer.getName());
    //     System.out.println("Email: " + customer.getEmail());
    //     System.out.println("Phone: " + customer.getPhone());
    //     System.out.println("------------------------");
    // }
}
