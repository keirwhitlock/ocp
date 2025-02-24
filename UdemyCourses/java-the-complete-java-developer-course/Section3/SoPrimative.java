public class SoPrimative {

    // Primative datatypes are placeholders in memory for a value.

    public static void main(String[] args) {
        System.out.println(
            String.format(
                "Integer min: %d \t Integer max: %d", Integer.MIN_VALUE, Integer.MAX_VALUE
            )
        );

        // assigning a literal value thats outside the range results in an error
        // int assignTooHigh = 2147483648; //error: integer number too large


        // do to the expression, the compiler isn't checking the result
        // but 2147483648 can't fit into an int, so it overflows. 
        // a bit like a numerical dial going form 9999->0000
        int expressionTooHigh = Integer.MAX_VALUE + 1;

        System.out.println(expressionTooHigh);  // Woah! -2147483648

        // similarly the compiler isn't checking as the result of the expression
        // but int cant fit anything more negative than that so underflows to the highest value
        int expressionTooLow = Integer.MIN_VALUE - 1;
        System.out.println(expressionTooLow);  // 2147483647
    }
}