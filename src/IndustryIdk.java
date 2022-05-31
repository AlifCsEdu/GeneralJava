import javax.swing.*;
import java.util.*;
public class IndustryIdk
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);

        Industry b = new Industry();

        System.out.print("Enter your industry Code \n(IC01, IC02, IC03");
        String code = a.next();

        String name;

        switch (code){
            case "IC01":
                name = "IC01-GLC";
                break;
            case "IC02":
                name = "IC02-private";
                break;
            case "IC03":
                name = "IC03-international";
                break;
            default:
                name = "Invalid Code";
                break;
        }

        System.out.print("Enter your Your Service : ");
        double yearRevenue = a.nextDouble();

        System.out.print("Enter your Year Revenue : ");
        double yearService = a.nextDouble();

        b.setIndustry(code, name, yearRevenue, yearService);

        System.out.println(b.toString());
    }
}
