import java.util.*;
import java.text.*;

public class Example_2ADecimal {
    public static void main (String[] args)
    {
        Scanner a = new Scanner (System.in);

        DecimalFormat b = new DecimalFormat("#0.00");

        double length,width,area,perimeter;

        System.out.print("Enter the lenght of the rectangle: "); length = a.nextDouble();

        System.out.print("Enter the width of the rectangle: "); width = a.nextDouble();

        area = length * width;
        perimeter = 2 * (length + width);

        System.out.println("Area: " + b.format(area));
        System.out.println("Perimeter: " + b.format(perimeter));
    }
}
