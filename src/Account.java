public class Account {
    //Data Members
    private String name;
    private int id;
    private double balance;

            public Account(){
                this.name = "";
                this.id=0;
                this.balance = 0.0;
            }
            public Account(String name, int id, double balance){
                this.name = name;
                this.id = id;
                this.balance = balance;
            }
            public  Account (Account newAccount){
                name = newAccount.name;
                id = newAccount.id;
                balance = newAccount.balance;
            }
            public void setAccount (String n, int i, double b) {
                name = n;
                id = i;
                balance= b;

            }
            public String getName(){
                return name;
            }
            public int getId(){
                return id;
            }
            public double getBalance(){
                return balance;
            }
            public void display(){
                System.out.println("Ur name" + name + "\n ur id" + id + "\nur balance" + balance);
            }
}
