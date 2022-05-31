import java.util.*;
public class Example_2A
{
    static Scanner a = new Scanner(System.in);

    public static void main(String[] args)
    {
        double length;
        double width;
        double perimeter;
        double area;

        System.out.print("Enter the length of the rectangle : ");
        length = a.nextDouble();
        System.out.println();

        System.out.print("Enter the width of the rectangle : ");
        width = a.nextDouble();
        System.out.println();

        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("Area:" + area);
        System.out.println("Perimeter:" + perimeter);
    }
}

