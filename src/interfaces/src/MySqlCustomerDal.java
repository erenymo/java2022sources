public class MySqlCustomerDal implements ICustomerDal, IRepository{ //Classlar bir adet sınıfı/abstractı ve birden fazla interfaceyi implement edebilir.
    @Override
    public void add() {
        System.out.println("My sql eklendi");
    }
}
