public class CustomerTest {
    public static void main(String[] args){
        Customer C = new Customer(123,25.00);
        RegularCustomer R = new RegularCustomer(111,37.50,0.25);

        C.display();
        R.display();
    }
}
