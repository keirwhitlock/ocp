public class TheCaseAndTheKey {

    public static void main(String... args) {
        int switchVar = 4;

        switch(switchVar) {
            case 1:  // if switchVar == 1
                System.out.println("Value is 1");
                break;   // without the breaks, the code would fallthrough on the first match
            case 2:  // else if switchVar == 2
                System.out.println("Value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value is a 3, 4 or a 5");
                break;
            default: // else
                System.out.println("Unknown value");
                // break;  // could have a break, but its also the last case, so not req
        }

        String month = "AUG";
        System.out.printf("Today is in the month of %s, and thats in the %s quarter", month, getQuarter(month));
    }

    public static String getQuarter(String month) {
        return switch(month){
            case "JAN", "FEB", "MAR" -> "1st";
            case "APR", "MAY", "JUN" -> "2nd";
            case "JUL", "AUG", "SEP" -> "3rd";
            case "OCT", "NOV", "DEC" -> "4th";
             default -> "bad";  // error: the switch expression does not cover all possible input values
        }; // essentially a expression, so needs a ;
    }
}