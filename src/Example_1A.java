import java.util.*;
public class Example_1A
{
    static Scanner student = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter your name : ");
        String name = student.nextLine();

        System.out.print("Enter your ID Number (Without COV) :");
        int id = student.nextInt();

        System.out.print("Enter your cgpa for this semester :");
        double cgpa = student.nextDouble();

        System.out.println();
        System.out.println("\tSTUDENT DETAILS");
        System.out.println("\t***************");
        System.out.println("My Name       : " +name);
        System.out.println("My ID Number  : " +id);
        System.out.println("My CGPA       : " +cgpa);
    }
}
