import java.util.*;

public class Acctry {
    public static void main(String[] args){

        try (Scanner in = new Scanner(System.in)){
            Account run = new Account();

            System.out.print("Enter ur name ");
            String name = in.nextLine();

            System.out.print("Enter ur id ");
            int id = in.nextInt();

            System.out.print("Enter ur balance ");
            double balance = in.nextDouble();

            run.setAccount(name, id, balance);

            run.display();
        }
    }
}
