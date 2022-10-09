public class Main {

    public static void main(String[] args) {
        ICustomerDal customerDal = new OracleCustomerDal(); // interface, onu implement eden classın referansını tutabilir.
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}
