public class RegularCustomer extends Customer {
    protected double discount;

    public RegularCustomer(int id, double bal, double disc) {
        super(id, bal);
        disc = disc;
    }

    public void display(){
        super.display();
        System.out.println("Discount is " + discount);
    }
}
