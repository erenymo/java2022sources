package inheritance;

public class Main {
    public static void main(String[] args) {  // inheritance = miras demektir
        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.age = 15;

        EmployeeManager employeeManager = new EmployeeManager();
        CustomerManager customerManager = new CustomerManager();
        
    }
}
