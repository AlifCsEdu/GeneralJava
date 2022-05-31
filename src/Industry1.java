import java.text.DecimalFormat;


public class Industry1
{
    private String code;
    private String name;
    private double yearRevenue;
    private double yearService;

    public Industry1(){
        this.code = "";
        this.name = "";
    }

    public Industry1(String[] args)
    {
        this.code = code;
        this.name = name;
    }

    public void setIndustry(String c, String n, double yR, double yS)
    {
        code = c;
        name = n;
        yearRevenue = yR;
        yearService = yS;
    }

    public String getCode()
    {
        return code;
    }

    public double getYearRevenue()
    {
        return yearRevenue;
    }

    public double getYearService()
    {
        return yearService;
    }

    public String toString(){
        DecimalFormat format = new DecimalFormat("#,##0.00");

        return ("\nCode and Name industry : " + name + "\nYear Service           : RM " + format.format(yearRevenue) + "\nYear Revenue           : RM "+ format.format(yearService));

    }
}