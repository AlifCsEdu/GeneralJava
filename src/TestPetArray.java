import java.util.Scanner;

public class TestPetArray {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        /* Object declaration using array */
        Pet[] pets = new Pet[3];
        pets[0] = new Pet("blacky", "cat",2);
        pets[1] = new Pet("caca", "rabbit",3);
        pets[2] = new Pet ();

        System.out.println("The value for Pet 1 is\n" +pets[0].toString());
        System.out.println("The value for Pet 2 is\n" +pets[1].toString());

        pets[0].age= 3; //Modified object value of pet 1 "age" from 2 to 3
        System.out.println("The Modified age value for Pet 1 is\n" + pets[0].toString());

        pets[1].name= "ribbit"; //Modified name value for pet2 to "ribbit"
        System.out.println("The Modified Pet 2's name and it's value is now\n " + pets[1].toString());

        //Asking the user to input data for pets 3
        System.out.println("Enter the value for Pet 3");
        System.out.println("The pet's name");
        pets[2].name= a.nextLine();
        System.out.println("The pet's animal type");
        pets[2].animal_type= a.nextLine();
        System.out.println("The pet's age");
        pets[2].age= a.nextInt();

        System.out.println("The value for Pet 3 is\n" +pets[2].toString());
    }
}
