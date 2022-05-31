public class Pet {

    String name;
    String animal_type; //cat, rabbit, etc
    int age;

    public Pet()//Default Constructor (Constructor without paremeter)
    {
        name = null;
        animal_type = null;
        age = 0;
    }
    public Pet(String nm, String at, int a)//Normal Constructor (Constructor with parameter)
    {
        name = nm; //
        animal_type = at;
        age = a;
    }

    public void setPet(String nm, String at, int a){ //Mutator for all attributes
        name = nm;
        animal_type = at;
        age = a;
    }
    public void setName(String nm) //Mutator for name
    {
        this.name = nm;
    }
    public void setAge(int age) //Mutator for Age
    {
        this.age = age;
    }
    public void setAnimalType(String at) //Mutator for animal type
    {
        this.animal_type = at;
    }

    public String getName() { //Accessor
        return name;
    }
    public String getAnimal_type() { //Accessor
        return animal_type;
    }
    public int getAge() { //Accessor
        return age;
    }
    public String toString(){ //Printer
        return ("\n\t============================="+"\n\tPet's name is : "+name+"\n\tIt is a : " +animal_type+"\n\tThe age is : " +age + "\n\t=============================");
    }
}
