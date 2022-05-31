public class MathMethod {
    public static void main(String[] args) {

        double abs = Math.abs(-1.23);
        System.out.println(abs);

        double power = Math.pow(3, 2);
        System.out.println(power);

        double pow = Math.pow(10, -2);
        System.out.println(pow);

        double squareRoot = Math.sqrt(121.0);
        double squareRoot2 = Math.sqrt(256.0);
        double squareAns = squareRoot - squareRoot2;
        System.out.println(squareAns);

        double round = Math.round(Math.PI);
        double round2 = Math.round(Math.E);
        double roundans = round + round2;
        System.out.println(roundans);

        double ceil = Math.ceil(6.022);
        double floor = Math.floor(15.9994);
        double plus = ceil + floor;
        System.out.println(plus);

        double min = Math.abs(Math.min(-3, -5));
        System.out.println(min);
    }
}
