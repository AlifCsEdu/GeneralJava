public class Customer {
    private int idNum;
    private double balance;

    public Customer(int id, double bal){
        idNum = id;
        balance = bal;
    }

    public void display(){
        System.out.println("Customer Num " + idNum + "Balance RM " + balance);
    }
}
