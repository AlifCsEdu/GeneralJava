import java.util.*;
public class testIndustry
{
    public static void main (String[] args)
    {
        Scanner a = new Scanner (System.in);

        Industry1 x = new Industry1 ();

        System.out.print( " Enter your industry code:");
        String code = a.next();

        String name = switch (code) {
            case "IC01" -> "IC01-GLC";
            case "IC02" -> "IC02-private";
            case "IC03" -> "IC03-international";
            default -> "Invalid Code";
        };

        System.out.print("Enter your Year Service :");
        double yearRevenue = a.nextDouble();

        System.out.print("Enter your Year Revenue :");
        double yearService = a.nextDouble();

        x.setIndustry (code, name, yearRevenue, yearService);

        System.out.println(x.toString());
    }
}