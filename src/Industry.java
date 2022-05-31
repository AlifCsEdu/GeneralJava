import java.text.DecimalFormat;

public class Industry {
    private String code;  //IC01-GLC, IC02-private,IC03 – international
    private String name; //GLC,private,international
    private double yearRevenue;
    private double yearService;

    //definition of methods

    public Industry(){
        this.code = "";
        this.name = "";
    }
    public Industry(String[] args){
        this.code = code;
        this.name = name;
    }

    public void setIndustry (String c, String n, double yR, double yS){ //mutator
        code = c;
        name = n;
        yearRevenue = yR;
        yearService = yS;
    }

    public String getCode(){ //accessor
        return code;
    }
    public double getYearRevenue(){ //accessor
        return yearRevenue;
    }
    public double getYearService(){ //accessor
        return yearService;
    }

    public String toString() { //toPrinter display method
        DecimalFormat format = new DecimalFormat("#,##0.00");

        return ("\nCode and Name industry : " + name + "\nYear Service           : RM " + format.format(yearRevenue) + "\nYear Revenue           : RM "+ format.format(yearService));
    }

}
