public abstract class Car {
    protected String name;
    protected String color;

    public Car(){name = ""; color = "";}

    public String getName(){return name;}
    public String getColor(){return color;}

    abstract public String calculate_price();

    abstract public void display();
}
