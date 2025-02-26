public class Precisely {

    static final double CONVERSION =  0.45359237D;

    public static void main(String args[]) {

        int noFractional = 5 / 2;  // answer 2 ;  as two ints result in an int, with no fractional part.
        System.out.println(noFractional); 

        double withFractional = 5d / 2d; // nice we get the Fractional element of the division
        System.out.println(withFractional);

        float withRecuring = 5f / 3f; // 1.6666666
        System.out.println(withRecuring);


        /* lbs to kgs */

        double pounds = 211.644D;
        double kgs = pounds * CONVERSION;

        System.out.println(kgs);

        // Research BigDecimal

    }
}