import java.util.Scanner;

public class TestPet {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);

        /* Object declaration for pets 1, pets 2, pets 3 */
        Pet pets1 = new Pet("blacky", "cat",2);
        Pet pets2 = new Pet("caca", "rabbit",3);
        Pet pets3 = new Pet ();

        System.out.println("The value for Pet 1 is\n" +pets1.toString());
        System.out.println("The value for Pet 2 is\n" +pets2.toString());

        pets1.age= 3; //Modified object value of pet 1 "age" from 2 to 3
        System.out.println("The Modified age value for Pet 1 is\n" + pets1.toString());

        pets2.name= "ribbit"; //Modified name value for pet2 to "ribbit"
        System.out.println("The Modified Pet 2's name and it's value is now\n " + pets2.toString());

        //Asking the user to input data for pets 3
        System.out.println("Enter the value for Pet 3");
        System.out.println("The pet's name");
        pets3.name= a.nextLine();
        System.out.println("The pet's animal type");
        pets3.animal_type= a.nextLine();
        System.out.println("The pet's age");
        pets3.age= a.nextInt();

        System.out.println("The value for Pet 3 is\n" +pets3.toString());
    }
}