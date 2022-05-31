import java.util.*;

public class WaterBotCons {
    public static void main(String[] args){
        Scanner bottles = new Scanner(System.in);
        WaterBottle run = new WaterBottle();

        System.out.println("================================");

        System.out.println("What kind of bottle brand would you like :? \n Thermos, Contigo, Tupperware, Lava");
        String brand = bottles.nextLine();

        System.out.println("What Capacity would you like ? \n1L,2L,3L,4L,5L");
        long capacity = bottles.nextLong();

        System.out.println("Would you want it with a free gift? (True Or False)");
        boolean gift = bottles.nextBoolean();

        System.out.println("Enter the bottle price");
        double price = bottles.nextDouble();

        run.setWaterbottle(brand, capacity, gift, price);
        System.out.println("================================");
        run.display();
    }
}
