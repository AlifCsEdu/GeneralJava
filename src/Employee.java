public class Employee
{
    private String name;
    private int age;
    private String gender;
    private double salary;

    //Default constructor
    public Employee()
    {
        name = null;
        age = 0;
        gender = null;
        salary = 0.00;
    }

    //Mutator


    public void setEmployee(String name, int age, String gender, double salary)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    //Accessor
    public String getName(){
        return name;
    }
}
