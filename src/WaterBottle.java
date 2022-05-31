public class WaterBottle {

    private String brand;
    private long capacity;
    private boolean gift;
    private double price;

    public WaterBottle() //default constructor
    {
        brand = null;
        capacity = 0;
        gift = false;
        price = 0.0;
    }
    public WaterBottle (String b, long c, boolean g, double p) { //normal constructor ?
        brand = b;
        capacity = c;
        gift = g;
        price = p;
    }
    public void setWaterbottle(String b, long c, boolean g, double p) {
        brand = b;
        capacity = c;
        gift = g;
        price = p;
    }
    public String getBrand() { //accessor
        return brand;
    }
    public long getCapacity() { //accessor
        return capacity;
    }
    public boolean getGift() { //accessor
        return gift;
    }
    public double getPrice() { //accessor
        return price;
    }
    public void display() {
        System.out.println("====================================================");
        System.out.print("The Water Bottle brand that you have chosen is : " + brand + "\nThe capacity for this bottle is : " + capacity +"L" + "\nWill come with free gift? : " + gift +
                "\nThe price for this bottle is : " + price);
        System.out.println("\n====================================================");
    }
}
