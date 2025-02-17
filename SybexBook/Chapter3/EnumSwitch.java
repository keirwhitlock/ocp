public class EnumSwitch {

    enum Season { 
        SPRING, 
        SUMMER, 
        FALL, 
        WINTER 
    } // optional ; ?  - seems to be

    public static void main(String[] args){

        Season v = Season.SPRING;

        String n = switch(v) {
            case SPRING -> "Spring";
            case SUMMER -> "Summer";
            //case FALL -> "Fall";  // all values must be caught or add a default error: the switch expression does not cover all possible input values
            case WINTER -> "Winter";
            default -> "No Season"; // default fixes Switch Expression's need to have all bases covered if they arn't
        }; // req ; for expressions

        System.out.println(n);
    }
}